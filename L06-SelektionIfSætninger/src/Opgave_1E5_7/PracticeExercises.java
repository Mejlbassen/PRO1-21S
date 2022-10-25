package Opgave_1E5_7;

import java.util.Scanner;

public class PracticeExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Giv mig tre tal");
        int tal1 = scan.nextInt();
        int tal2 = scan.nextInt();
        int tal3 = scan.nextInt();

        if (tal1 < tal2) {
            if (tal2 < tal3) {
                System.out.println("Tallene er stigende");
            } else if (tal1 > tal2) {
                if (tal2 > tal3) {
                    System.out.println("Tallene er faldende");
                } else
                    System.out.println("Tallene er hverken stigende eller faldende");
            }
        }
// jeg bør close scanner

    }

}
