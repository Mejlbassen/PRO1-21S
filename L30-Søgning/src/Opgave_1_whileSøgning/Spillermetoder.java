package Opgave_1_whileSøgning;

import soegningelev.Kunde;

import java.util.ArrayList;

public class Spillermetoder {
    //Opgave 4.1
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getMaal() == (score))
                spiller = k;
            else
                i++;
        }return spiller;
    }

    //Opgave 4.2
    public Spiller findScoreBinær (ArrayList<Spiller> spillere, int score){
        Spiller spiller = null;
        int left = 0;
        int right = spillere.size() - 1;
        while (spiller == null && left <= right) {
            int middle = (left+right) / 2;
            Spiller k = spillere.get(middle);
            if (k.getMaal() == (score))
                spiller = k;
            else if (k.getMaal() > (score))
                right = middle - 1;
            else
                left = middle + 1;
        }return spiller;
    }

    //Opgave 4.3
    public String godSpiller (ArrayList<Spiller> spillere) {
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getMaal() > 50 && k.getHoejde() > 170)
                spiller = k;
            else
                i++;
        }
        return spiller.toString();
    }

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1, 4.2, 4.3
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));

        System.out.println("*********** Opgave 4.1");
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));

        System.out.println("*********** Opgave 4.2");
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreBinær(spillerListe,35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreBinær(spillerListe,30));

        System.out.println("*********** Opgave 4.3");
        System.out.println("Spiller der har scoret over 50 mål og er over 170 cm: " + metoder.godSpiller(spillerListe));

    }

}
