package Opgave_1_E5_1;

import java.util.Scanner;

public class PracticeExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Giv mig et helt tal");
        int tal = scan.nextInt();
        if (tal > 0) {
            System.out.println("Tallet er positivt");
        } else if (tal < 0) {
            System.out.println("Tallet er negativt");
        } else {
            System.out.println("Tallet er zero");
        }

    }
}