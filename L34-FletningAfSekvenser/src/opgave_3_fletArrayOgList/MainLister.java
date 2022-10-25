package opgave_3_fletArrayOgList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainLister {
    public static void main(String[] args) {
        ArrayList<Kunde> alKunder = new ArrayList<>();
        Kunde k1 = new Kunde("Larsen", "lars", 65);
        Kunde k2 = new Kunde("Andersen", "Anders", 25);
        Kunde k3 = new Kunde("Johnson", "Anders", 24);
        Kunde k4 = new Kunde("John", "Jo", 35);
        Kunde k5 = new Kunde("Verstappen", "Max", 26);
        Kunde k6 = new Kunde("Albon", "Coug", 26);
        Kunde k7 = new Kunde("Russel", "George", 26);
        Kunde k8 = new Kunde("Sainz", "Andreas", 24);
        alKunder.add(k1);
        alKunder.add(k2);
        alKunder.add(k3);
        alKunder.add(k4);
        alKunder.add(k5);
        alKunder.add(k6);
        alKunder.add(k7);
        alKunder.add(k8);

        System.out.println("ArrayList med alle kunder");
        System.out.println(alKunder);
        System.out.println("****");

        System.out.println("ArrayList med alle kunder, sorteret");
        //Sorter med compareTo metoden
        Collections.sort(alKunder);
        System.out.println(alKunder);
        System.out.println("****");

        Kunde k9 = new Kunde("Poulsen", "George", 24);
        Kunde k10 = new Kunde("Sainz", "Andreas", 24);
        Kunde k11 = new Kunde("Larsen", "Amazon", 24);
        Kunde k12 = new Kunde("Albon", "Alex", 24);
        Kunde k13 = new Kunde("Johnson", "Anders", 24);
        Kunde[] aKunder = {k9, k10, k11, k12, k13};
        System.out.println("Array med dårlige kunder");
        System.out.println(Arrays.toString(aKunder));
        //Sorter med selection sort
        selectionSort(aKunder);
        System.out.println("Array med dårlige kunder, sorteret");
        System.out.println(Arrays.toString(aKunder));
        System.out.println("****");

        System.out.println("Arraylist fra Array og ArrayList. Uden dårlige kunder");
        System.out.println(goodCustomers(alKunder, aKunder));

    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * customers fra l1 der ikke er i l2
     * Krav: l1 og l2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static ArrayList goodCustomers(ArrayList<Kunde> l1, Kunde[] l2){
        ArrayList<Kunde> result = new ArrayList<Kunde>();
        int i1 = 0;
        int i2 = 0;
        result.addAll(l1);
        while (i1 < l1.size() && i2 < l2.length) {
            if (l1.get(i1).compareTo(l2[i2]) < 0 )
                i1++;
            else if (l1.get(i1).compareTo(l2[i2]) > 0)
                i2++;
            else {
                // result.add(l1.get(i1));
                result.remove(l1.get(i1));
                i1++;
                i2++;
            }
        }

        return result;
    }

    private static void swap(Kunde[] list, int i, int j) {
        Kunde temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSort(Kunde[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j;
                }

            }
            swap(list, i, minPos);
        }
    }



}
