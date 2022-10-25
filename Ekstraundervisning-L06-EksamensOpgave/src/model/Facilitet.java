package model;

import java.util.ArrayList;

public class Facilitet {
    private final String navn;
    private final int minimumsalder;
    private final int pris;

    // association --> 0..* PersonChip
    private final ArrayList<PersonChip> personer = new ArrayList<>();

    public Facilitet(String navn, int minimumsalder, int pris) {
        this.navn = navn;
        this.minimumsalder = minimumsalder;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getMinimumsalder() {
        return minimumsalder;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return navn + ", kr " + pris;
    }

    public ArrayList<PersonChip> getPersoner() {
        return new ArrayList<>(personer);
    }

    /** Pre: Personen er ikke forbundet til denne facilitet. */
    public void addPerson(PersonChip person) {
        personer.add(person);
        person.faciliteter.add(this);
    }

    /** Pre: Personen er forbundet til denne facilitet. */
    public void removePerson(PersonChip person) {
        personer.remove(person);
        person.faciliteter.remove(this);
    }
}
