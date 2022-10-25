package opgave_5_indlæserTastatur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tastatur {

    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/mkmej/Jottacloud/eaaa/PRO1/Lektion 33 ExceptionsTekstfiler/opgave5.txt";
            PrintWriter printWriter = new PrintWriter(fileName);
            Scanner scan = new Scanner(System.in);
            int tal = 0;

            System.out.println("Skriv et positivt heltal");
                while (-1 != tal && scan.hasNextInt()) {
                    tal = scan.nextInt();
                    if (tal > 0){
                        printWriter.println(tal);
                        System.out.println("Flere tal? Ellers afslut ved at skrive -1");
                    }
                }

            // flush og skriv filen
            printWriter.flush();
            printWriter.close();
            scan.close();
            System.out.println("Filen er lavet med positive tal");
        }catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
