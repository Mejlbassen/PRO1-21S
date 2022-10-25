package Opgave_3;

import java.util.Scanner;

public class PigPlay {
    //Atributer
    private Die die;
    private Scanner scan;

    private int mSum = 0;
    private int playerOneSum = 0;
    private int playerTwoSum = 0;

    private boolean finished = false;

    private boolean playerOne;

    //Constructor
    public PigPlay() {

        scan = new Scanner(System.in);
        die = new Die();
    }

    private void welcomeToGame() {
        System.out.println("Velkommen til spillet KAST terning");
    }

    private void gameOver() {
        if (playerOneSum >= 10) {
            System.out.println("Tak for spillet. Player 1 vandt");
        } else if (playerTwoSum >= 10) {
            System.out.println("Tak for spillet. Player 2 vandt");
        } else {
            System.out.println("Der er ingen vindere");
        }
        scan.close();
    }

    private void takeTurn() {
        if (playerOne) {
            if (playerOneSum >= 10) {
                finished = true;
                gameOver();
            } else{
                    System.out.println("**Spiller ** 1 **");
                    die.roll();
                    int roll = die.getFaceValue();
                    System.out.println("Du har kastet: " + roll);
                    if (roll == 1){
                        playerOne = false;
                        mSum = 0;
                        takeTurn();
                    }
                    mSum = mSum + roll;

                    System.out.println("Midlertidig sum : " + mSum);
                    System.out.println("Du har samlet " + playerOneSum + mSum + " hvis du stopper nu");
                    System.out.println("Vil du spille videre?");
                    String keepPlaying = scan.nextLine();
                    if (keepPlaying.equalsIgnoreCase("nej")) {
                        playerOneSum = playerOneSum + mSum;
                        playerOne = false;
                        mSum = 0;
                    } else {
                        takeTurn();
                    }
                }
            }
         else {
            if (playerTwoSum >= 10) {
                finished = true;
                gameOver();
            } else {
                    System.out.println("**Spiller ** 2 **");
                    die.roll();
                    int roll = die.getFaceValue();
                    System.out.println("Du har kastet: " + roll);
                    mSum = mSum + roll;
                if (roll == 1){
                    playerOne = true;
                    mSum = 0;
                    takeTurn();
                }

                    System.out.println("Midlertidig sum : " + mSum);
                System.out.println("Du har samlet " + playerTwoSum + mSum + " hvis du stopper nu");
                System.out.println("Vil du spille videre?");
                    String keepPlaying = scan.nextLine();
                    if (keepPlaying.equalsIgnoreCase("nej")) {
                        playerTwoSum = playerTwoSum + mSum;
                        playerOne = true;
                        mSum = 0;
                    } else {
                        takeTurn();
                    }
                }
            }
        }


            public void startGame () {
                welcomeToGame();

                boolean finished = false;

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