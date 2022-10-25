package Opgave_1;

import java.util.Scanner;

public class playPairOfDice {

    private Scanner scan;

    private PairOfDices dices;


    public playPairOfDice() {
        dices = new PairOfDices();
        scan = new Scanner(System.in);
    }

    private void velkommenTilSpillet() {
        System.out.println("Velkommen til spillet KAST terninger");
    }

    private void slut() {
        System.out.println("Tak for spillet. Du har slået " + dices.getEqualDies() + " ens slag");
        System.out.println("Dit største slag var " + dices.getBiggestSum());
        System.out.println("Du har slået " + dices.getSixes() + " seksere");
        System.out.println("Du har slået " + dices.getFive() + " femere");
        System.out.println("Du har slået " + dices.getFour() + " firere");
        System.out.println("Du har slået " + dices.getThree() + " trerere");
        System.out.println("Du har slået " + dices.getTwo() + " toere");
        System.out.println("Du har slået " + dices.getOne() + " ettere");
        scan.close();
    }

    private void takeTurn() {
        dices.rollBothDices();
        System.out.println("Du har kastet: " + dices.sumOfDices());
    }

    public void startSpil() {
        velkommenTilSpillet();

        boolean finished = false;

        while (!finished) {
            System.out.println("Vil du kaste terninger? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                takeTurn();
            }
        }
        slut();
    }
}
