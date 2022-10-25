package storage;

import model.Forhindring;
import model.Løb;

import java.util.ArrayList;

//Opgave 6
public class Storage {
    private static final ArrayList<Løb> løbs = new ArrayList<>();
    private static final ArrayList<Forhindring> forhindringer = new ArrayList<>();

    public static void storeLøb(Løb løb) {
        løbs.add(løb);
    }

    public static void storeForhindring(Forhindring forhindring) {
        forhindringer.add(forhindring);
    }

    public static ArrayList<Løb> getLøb() {
        return new ArrayList<>(løbs);
    }

    public static ArrayList<Forhindring> getForhindring() {
        return new ArrayList<>(forhindringer);
    }

}
