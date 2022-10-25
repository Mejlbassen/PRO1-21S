package Opgave_1;

import dicegames.Die;

/**
 * This class models one pair of dices.
 */
public class PairOfDices {
    /**
     * The first die in the pair.
     */
    private Die die1;
    /**
     * The second die in the pair.
     */
    private Die die2;

    //5)
    private int antalRul;

    //6)
    private int sixes;

    //7)
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    //8)
    private int equalDies;

    //9)
    private int biggestSum = 0;

    /**
     * 2) Programmer endnu en constructor. Denne skal have en parameter for antal sider der skal
     * være på terningerne. Så den opretter de to terninger, dvs. to objekter af Die i felterne die1
     * og die2, med det angivne antal sider.
     */
    public PairOfDices(int sider) {
        die1 = new Die(sider);
        die2 = new Die(sider);
    }

    public PairOfDices() {
        die1 = new Die();
        die2 = new Die();

    }

    //3)
    public void rollBothDices() {
        die1.roll();
        die2.roll();

        antalRul++;                //5)

	/*
	6) Tilføj til klassen det der er nødvendigt for at klassen kan returnere antallet af 6’er der er forekommet
	på de to terninger.
	*/
        if (die1.getFaceValue() == 6) {
            sixes++;
        }
        if (die2.getFaceValue() == 6) {
            sixes++;
        }

        //7)
        if (die1.getFaceValue() == 1) {
            one++;
        }
        if (die2.getFaceValue() == 1) {
            one++;
        }
        if (die1.getFaceValue() == 2) {
            two++;
        }
        if (die2.getFaceValue() == 2) {
            two++;
        }
        if (die1.getFaceValue() == 3) {
            three++;
        }
        if (die2.getFaceValue() == 3) {
            three++;
        }
        if (die1.getFaceValue() == 4) {
            four++;
        }
        if (die2.getFaceValue() == 4) {
            four++;
        }
        if (die1.getFaceValue() == 5) {
            five++;
        }
        if (die2.getFaceValue() == 5) {
            five++;
        }

        //8)
        if (die1.getFaceValue() == die2.getFaceValue()) {
            equalDies++;
        }

        //9)
        if (sumOfDices() > biggestSum) {
            biggestSum = sumOfDices();
        }
    }

    //4)
    public int sumOfDices() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    //6)
    public int getSixes() {
        return sixes;
    }


    //7)
    public int getOne() {
        return one;
    }
    public int getTwo() {
        return two;
    }
    public int getThree() {
        return three;
    }
    public int getFour() {
        return four;
    }
    public int getFive() {
        return five;
    }

    //8)
    public int getEqualDies() {
        return equalDies;
    }

    public int getBiggestSum(){
        return biggestSum;
    }

    //9)
    public void resetPairOfDices(){
        antalRul = 0;
        sixes = 0;
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        biggestSum = 0;
        equalDies = 0;
    }
}

