package opgave_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave1 {

    public static void main(String[] args) {
        try {
            int[] prim = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Hvilket nr. primtal skal vises?: ");
                int n = scan.nextInt();
                System.out.println("Primtal nr. " + n + " er "
                        + prim[n - 1] + "\n");
            }
        }  catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Skriv et positivt heltal");
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f.getMessage());
            System.out.println("Brug de udleverede numre");
        }
    }
    /*
    abc: InputMismatchException
    1000: ArrayIndexOutOfBoundsException: Array index out of range: 999

     */

}
