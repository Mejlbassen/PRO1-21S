package opgave_3_arrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegersOmvendt {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        try {
            File filein = new File("C:/Users/mkmej/Jottacloud/eaaa/PRO1/Lektion 33 ExceptionsTekstfiler/opgave2.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                int s = scan.nextInt();
                a.add(s);
                System.out.println(s);
            }
            scan.close();
            System.out.println("****");

            Collections.reverse(a);
            System.out.println("After Reverse Order, ArrayList Contains : " + a);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
