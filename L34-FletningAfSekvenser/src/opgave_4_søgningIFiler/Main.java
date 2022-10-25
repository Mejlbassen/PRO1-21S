package opgave_4_søgningIFiler;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/mkmej/Jottacloud/eaaa/PRO1/Lektion 34 Fletning af sekvenser/opgave4.txt";
            PrintWriter printWriter = new PrintWriter(fileName);

            printWriter.println(9140);
            printWriter.println(4450);
            printWriter.println(5885);
            printWriter.println(1284);
            printWriter.println(219);
            printWriter.println(4203);
            printWriter.println(8965);
            printWriter.println(4919);
            printWriter.println(982);
            printWriter.println(959);

            // flush og skriv filen
            printWriter.flush();
            printWriter.close();
            System.out.println("Filen er lavet");
            System.out.println(linFileSearch(fileName, 219));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean linFileSearch(String fileName, int target) {
        boolean found = false;
        try {
            File filein = new File(fileName);
            Scanner scan = new Scanner(filein);
            while (scan.hasNext() && !found) {
                int k = scan.nextInt();
                if (target == k)
                    found = true;
                else
                    scan.nextLine();
            }
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return found;
    }
}
