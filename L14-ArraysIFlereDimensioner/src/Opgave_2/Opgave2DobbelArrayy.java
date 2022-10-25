package Opgave_2;

import opgave1_2dobbelArray.DobbelArrayMethods;

public class Opgave2DobbelArrayy {

    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];
        DobbelArrayMethods da = new DobbelArrayMethods();

        //Udskriv values på tabel form
        da.udskrivArray(values);


        // TODO Opgave 2.1  lav ændringer i values så der står 5 på alle pladser

        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 på alle pladser");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = 5;
            }
        }
        System.out.println();
        da.udskrivArray(values);

        // TODO Opgave 2.2  lav ændringer i values så der står 2 i lige rækker og 3 i ulige

        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden række");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (i % 2 == 0)
                    values[i][j] = 3;
                else
                    values[i][j] = 2;
            }
        }
        System.out.println();
        da.udskrivArray(values);

        // TODO Opgave 2.3  lav ændringer i values så der står 2 i lige søjler og 3 i ulige

        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden søjle");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (j % 2 == 0)
                    values[i][j] = 3;
                else
                    values[i][j] = 2;
            }
        }
        System.out.println();
        da.udskrivArray(values);


        // TODO Opgave 2.4 lav ændringer i values så den har skiftende 0'er og 1'er som på et
        // skakbræt

        System.out.println();
        System.out.println("Nedenfor skulle der stå 0 og 1 på alle pladser som på skakbræt");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (j % 2 == 0 && i % 2 == 0)
                    values[i][j] = 1;
                else
                    values[i][j] = 0;
            }
            for (int j = 0; j < values[i].length; j++) {
                if (j % 2 == 1 && i % 2 == 1)
                    values[i][j] = 1;
            }
        }
        System.out.println();
        da.udskrivArray(values);

        // TODO Opgave 2.5 lav ændringer så alle elementer i nederste og øverste række samt første
        // og sidste søjle er 5 og resten skal være 2.

        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 i kanten og 2 ellers");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (i == 0 || j == 0 || i == ROW - 1 || j == COL - 1)
                    values[j][i] = 5;
                else
                    values[i][j] = 2;
            }
        }
        System.out.println();
        da.udskrivArray(values);
    }


}
