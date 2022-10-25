package model;

import java.util.ArrayList;

public class Gruppe {
    private final int nr;

    // association --> 0..1 PersonChip
    private PersonChip ansvarlig;

    // aggregation --> 0..* PersonChip
    private final ArrayList<PersonChip> personer = new ArrayList<>();

    public Gruppe(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    //-----------------------------------------------------

    /** Note: Nullable return value. */
    public PersonChip getAnsvarlig() {
        return ansvarlig;
    }

    /** Pre: Den ansvarlige er ikke forbundet til en gruppe,
     gruppen er ikke forbundet til en ansvarlig. */
    public void setAnsvarlig(PersonChip ansvarlig) {
        this.ansvarlig = ansvarlig;
    }

    /** Pre: Den ansvarlige er forbundet til denne gruppe. */
    public void removeAnsvarlig(PersonChip ansvarlig) {
        this.ansvarlig = null;
    }

    //-----------------------------------------------------

    public ArrayList<PersonChip> getPersoner() {
        return new ArrayList<>(personer);
    }

    public PersonChip opretPerson(int nr, String navn, int maxSaldo, int alder) {
        PersonChip person = new PersonChip(nr, navn, maxSaldo, alder);
        personer.add(person);
        return person;
    }

    /** Pre: Personen er ikke forbundet til en gruppe. */
    public void addPerson(PersonChip person) {
        personer.add(person);
    }

    /** Pre: Personen er forbundet til denne gruppe. */
    public void removePerson(PersonChip person) {
        personer.remove(person);
    }

    //-----------------------------------------------------

    // Opg 1.3a
    public PersonChip findPersonChip(String navn) {
        PersonChip person = null;
        int i = 0;
        while (person == null && i < personer.size()) {
            PersonChip p = personer.get(i);
            if (p.getNavn().equals(navn))
                person = p;
            else
                i++;
        }
        return person;
    }

    // Opg 1.3b
    public ArrayList<String> oversigtFaciliteter(String navn) {
        PersonChip person = findPersonChip(navn);
        ArrayList<String> oversigt = new ArrayList<>();
        if (person != null) {
            for (Facilitet facilitet : person.getFaciliteter()) {
                oversigt.add(facilitet.getNavn() + " kr " + facilitet.getPris());
            }
        }
        return oversigt;
    }
}
