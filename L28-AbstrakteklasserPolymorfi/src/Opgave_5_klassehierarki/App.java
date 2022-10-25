package Opgave_5_klassehierarki;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ElArtikel el1 = new ElArtikel("Stikdåse", 100, "med jord", 2.2);
        Fødevare f1 = new Fødevare("Banan", 10, "Fra Jamaica", 4);
        Spiritus s1 = new Spiritus("Vodka", 100, "Fra Rusland", 45);

        ArrayList<Vare> indkøb = new ArrayList<>();

        indkøb.add(el1);
        indkøb.add(f1);
        indkøb.add(s1);

        System.out.println("Du har købt");
        System.out.println(indkøb);
        System.out.println(prisMedMoms(indkøb));


    }

    public static double prisMedMoms(ArrayList<Vare> varer){
        double samlet = 0;
        for (Vare v : varer){
            samlet = samlet + v.beregnSalgsprisMoms();
        }
        return samlet;
    }
}
