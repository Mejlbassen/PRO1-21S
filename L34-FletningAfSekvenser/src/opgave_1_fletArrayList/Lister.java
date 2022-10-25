package opgave_1_fletArrayList;

import java.util.ArrayList;

public class Lister {

    public static void main(String[] args) {
        ArrayList<Kunde> l1 = new ArrayList<>();
        ArrayList<Kunde> l2 = new ArrayList<>();

        Kunde k1 = new Kunde("Larsen", "lars", 65);
        Kunde k2 = new Kunde("Andersen", "Anders", 25);
        Kunde k3 = new Kunde("Brian", "Briansen", 28);
        Kunde k4 = new Kunde("John", "Jo", 35);
        Kunde k5 = new Kunde("Verstappen", "Max", 26);
        Kunde k6 = new Kunde("Albon", "Coug", 26);
        Kunde k7 = new Kunde("Russel", "George", 26);
        Kunde k8 = new Kunde("Sainz", "Carlos", 26);
        Kunde k9 = new Kunde("Norris", "Coug", 26);
        Kunde k10 = new Kunde("Raikonen", "Kimi", 26);
        Kunde k11 = new Kunde("Vettel", "Sebastion", 26);
        Kunde k12 = new Kunde("Stroll", "Lance", 26);
        Kunde k13 = new Kunde("Yrsa", "Ursula", 26);

        indsætKunde(l1, k1);
        indsætKunde(l1, k2);
        indsætKunde(l1, k3);
        indsætKunde(l1, k4);
        indsætKunde(l1, k5);
        indsætKunde(l1, k6);
        indsætKunde(l1, k7);
        indsætKunde(l1, k8);

        indsætKunde(l2, k9);
        indsætKunde(l2, k10);
        indsætKunde(l2, k11);
        indsætKunde(l2, k12);
        indsætKunde(l2, k13);

        System.out.println("Liste 1");
        System.out.println(l1);
        System.out.println("**********");

        System.out.println("Liste 2");
        System.out.println(l2);
        System.out.println("**********");

        System.out.println("Listerne flettet sammen");
        System.out.println(fletAlleKunder(l1, l2));

    }

    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * kunder fra både l1 og l2
     * Krav: l1 og l2 er sorterede
     */
    public static ArrayList fletAlleKunder(ArrayList<Kunde> l1, ArrayList<Kunde> l2){
        ArrayList<Kunde> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        // flet sålænge der er noget i begge lister
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo((l2.get(i2))) <= 0) {
                // s1's første tal er mindst
                result.add(l1.get(i1));
                i1++;
            }
            else { // s2's første tal er mindst
                result.add(l2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }


    public static void indsætKunde(ArrayList<Kunde> customers, Kunde customer) {
        boolean found = false;
        int i = 0;
        while (!found && i < customers.size()) {
            if (customers.get(i).compareTo(customer) > 0) {
                found = true;
            } else {
                i++;
            }
        }
        customers.add(i, customer);
    }

}
