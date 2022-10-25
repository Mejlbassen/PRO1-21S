package Opgave_2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Mekaniker m1 = new Mekaniker("John", "Heden", 2009, 20.5);
        Mekaniker m2 = new Mekaniker("Lars", "Havnen", 2020, 10.8);
        Værkfører v1 = new Værkfører("veran", "By C", 1991, 35, 2000, 20.5);
        Værkfører v2 = new Værkfører("Vera", "Landet", 2003, 23, 2005, 10.6);
        Synsmand s1 = new Synsmand("Syko Joe", "Hedemannsgage, Århus", 2004, 21, 10);

        ArrayList<Mekaniker> meka = new ArrayList<>();
        meka.add(m1);
        meka.add(m2);
        meka.add(v1);
        meka.add(v2);

        System.out.println(samletLoen(meka));
        System.out.println("*******");
        System.out.println("Synsmand");
        meka.add(s1);
        System.out.println(samletLoen(meka));
        System.out.println("*******");




    }

    public static double samletLoen(ArrayList<Mekaniker> list) {
        double samlet = 0;
        for (Mekaniker m : list) {
            samlet = samlet + m.beregnLoen();
        }
        return samlet;
    }

}
