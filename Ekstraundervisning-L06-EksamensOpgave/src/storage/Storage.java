package storage;

import model.Facilitet;
import model.Gruppe;
import model.PersonChip;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Storage {
    private static final ArrayList<Gruppe> grupper = new ArrayList<>();
    private static final ArrayList<PersonChip> personer = new ArrayList<>();
    private static final ArrayList<Facilitet> faciliteter = new ArrayList<>();

    public static ArrayList<Gruppe> getGrupper() {
        return new ArrayList<>(grupper);
    }

    public static ArrayList<PersonChip> getPersoner() {
        return new ArrayList<>(personer);
    }

    public static ArrayList<Facilitet> getFaciliteter() {
        return new ArrayList<>(faciliteter);
    }

    public static void storeGruppe(Gruppe gruppe) {
        grupper.add(gruppe);
    }

    public static void storePerson(PersonChip person) {
        personer.add(person);
    }

    public static void storeFacilitet(Facilitet facilitet) {
        faciliteter.add(facilitet);
    }
}
