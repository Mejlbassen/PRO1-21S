package model;

import java.util.ArrayList;

public class PersonChip {
    private final int nr;
    private final String navn;
    private final int maxSaldo;
    private final int alder;

    // association --> 0..* Facilitet
    final ArrayList<Facilitet> faciliteter = new ArrayList<>();  // OBS: package visibility

    public PersonChip(int nr, String navn, int maxSaldo, int alder) {
        this.nr = nr;
        this.navn = navn;
        this.maxSaldo = maxSaldo;
        this.alder = alder;
    }

    public int getNr() {
        return nr;
    }

    public String getNavn() {
        return navn;
    }

    public int getMaxSaldo() {
        return maxSaldo;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public String toString() {
        return navn;
    }

    //-----------------------------------------------------

    public ArrayList<Facilitet> getFaciliteter() {
        return new ArrayList<>(faciliteter);
    }

    //-----------------------------------------------------

    // Opg 1.2
    public boolean checkSaldo(int prisFacilitet) {
        int brugtBeloeb = 0;
        for (Facilitet facilitet : faciliteter) {
            brugtBeloeb += facilitet.getPris();
        }
        return maxSaldo >= brugtBeloeb + prisFacilitet;
    }
}
