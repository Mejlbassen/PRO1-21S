package opgave_2_notesblok;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Notesblokken {

    public static void main(String[] args) {
        try {
            File filein = new File("C:/Users/mkmej/Jottacloud/eaaa/PRO1/Lektion 33 ExceptionsTekstfiler/opgave2.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                System.out.println(scan.nextInt()*2);
            }
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
