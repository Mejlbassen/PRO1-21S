package opgave_4_filMedUligeTal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UligeTal {

    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/mkmej/Jottacloud/eaaa/PRO1/Lektion 33 ExceptionsTekstfiler/opgave4.txt";
            //	String fileName = "tal.txt";
            PrintWriter printWriter = new PrintWriter(fileName);

            // indlaes antal tal i filen
            Scanner scan = new Scanner(fileName);

            for (int i = 1; i < 100; i++){
                if (i%2==1){
                    printWriter.println(i);
                    System.out.println(i);
                }
            }

            // flush og skriv filen
            printWriter.flush();
            printWriter.close();
            scan.close();
            System.out.println("Filen er lavet med positive, ulige tal under 100");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}