package Opgave_1;

import com.sun.jdi.Value;

import java.sql.SQLOutput;
import java.util.ArrayList;

// Opgave 1
public class Arrangement {
    public String navn;
    public boolean offentlig;
    public int pris;
    public int maxAntal;
    public ArrayList deltagere;

    public Arrangement(String navn, boolean offentlig, int pris, int maxAntal) {
        this.navn = navn;
        this.offentlig = offentlig;
        this.pris = pris;
        this.maxAntal = maxAntal;
        this.deltagere = new ArrayList();
    }

    public String getNavn() {
        return navn;
    }

    public boolean isOffentlig() {
        return offentlig;
    }

    public int getPris() {
        return pris;
    }

    public int getMaxAntal() {
        return maxAntal;
    }

    // Opgave 1.1
    public String toString() {
        String info = ("Arrangement: " + getNavn() + "\n Er det offentligt: " + isOffentlig() +
                "\n Arrangement pris: " + getPris() + "\n Arrangements antal pladser: " + getMaxAntal());
        return info;
    }

    // Opgave 1.2
    public boolean addDeltager(String navn) {
        if (deltagere.size() < maxAntal) {
            deltagere.add(navn);
            return true;
        } else
            return false;
    }

    // Opgave 1.3
    public int antalTilmeldte() {
        return deltagere.size();
    }

    //Opgave 1.5                           ER MÅSKE FORKERT
//    public int antalTilmeldteMedNavn (String navn){return getNavn().indexOf(getNavn());}
//    public int antalTilmeldteMedNavn (String navn){return deltagere.contains(getNavn().compareToIgnoreCase(getNavn()));}
//      public int antalTilmeldteMedNavn (String navn){return deltagere.contains(getNavn());}

//    public int antalTilmeldteMedNavn(String tilMedNavn) {         //Denne sektion er 95% korrekt.
//        int antal = 0;
//        for (String tilMedNavn : deltagere) {
//            if (tilMedNavn.equals(deltagere)) {
//                antal++;
//            }
//        }
//        return antal;
//    }


    // Opgave 1.6
    public String typeAfArrangement1(int prislimit) {
        String result = " ";
        if (!offentlig) {
            return "Arrangementet er ikke offentligt";
        } else if (pris <= prislimit) {
            return "Alle er velkomne til dette billige arrangement, prisen er 200" + pris;
        } else {
            return "Alle er velkomne til dette lidt dyre arrangement, prisen er 500" + this.pris;
        }
    }

    // Opgave 1.7
    public String typeAfArrangement2(int prislimit) {
        String result = " ";
        if (deltagere.size() == maxAntal) {
            return "Arrangementet er fuldt booket";
        } else {
            if (pris <= prislimit) {
                return "Der er ledige pladser, prisen er 99" + pris;
            } else { // pris > prislimit

                return "Der er ledige pladser til et luksus arrangement, prisen er 1001" + pris;
            }
        }
    }
}

