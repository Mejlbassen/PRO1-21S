package Opgave_2;

//4)

import java.util.Scanner;

public class CrapsPlay {

    //1)
    private Die die1;
    private Die die2;

    //4-5)
    private int point;
    private boolean førsteKast = true;
    private boolean finished;
    private boolean vundet = true;
    private Scanner scan;
    private int antalVundneSpil = 0;
    private int antalTabteSpil = 0;

    private void reset(){
        førsteKast = true;
        finished = false;
        vundet = false;
        point = 0;
    }

    public CrapsPlay() {
        //2)
        die1 = new Die();
        die2 = new Die();

        scan = new Scanner(System.in);
    }

    //3)
    private void welcomeToGame() {
        System.out.println("Velkommen til spillet KAST terning");
    }

    //4)
    private void gameOver() {
        if (vundet) {
            System.out.println("Tak for spillet");
            antalVundneSpil++;
        } else {
            System.out.println("Taber, gå hjem");
            antalTabteSpil++;
        }
        System.out.println("Vil du spille videre?");
        String keepPlaying = scan.nextLine();
        if (keepPlaying.equalsIgnoreCase("nej")) {
            scan.close();
            System.out.println("Du har vundet " + antalVundneSpil + "spil");
            System.out.println("Du har tabt " + antalTabteSpil + "spil");
        }else {
            reset();
            startGame();
        }
    }

    //5)
    private void takeTurn() {
        die1.roll();
        die2.roll();
        int sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Du har slået " + sum);
        if (førsteKast) {
            if (sum == 7 || sum == 11) {
                vundet = true;
                finished = true;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                vundet = false;
                finished = true;
            } else {
                point = sum;
                førsteKast = false;
            }
        } else {
            if (sum == 7) {
                finished = true;
                vundet = false;
            } else if (point == sum) {
                finished = true;
                vundet = true;
            }
        }
    }

    public void startGame() {
        welcomeToGame();

        finished = false;

        while (!finished) {
            System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                takeTurn();
            }
        }
        gameOver();
    }
}
