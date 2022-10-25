package controller;

import model.Facilitet;
import model.Gruppe;
import model.PersonChip;
import storage.Storage;

import java.util.ArrayList;

public class Controller {

    public static Gruppe opretGruppe(int nr) {
        Gruppe gruppe = new Gruppe(nr);
        Storage.storeGruppe(gruppe);
        return gruppe;
    }

    public static PersonChip opretPerson(int nr, String navn, int maxSaldo, int alder, Gruppe gruppe) {
        PersonChip person = gruppe.opretPerson(nr, navn, maxSaldo, alder);
        Storage.storePerson(person);
        return person;
    }

    public static Facilitet opretFacilitet(String navn, int minimumsalder, int pris) {
        Facilitet facilitet = new Facilitet(navn, minimumsalder, pris);
        Storage.storeFacilitet(facilitet);
        return facilitet;
    }

    public static  void addPersonTilFacilitet(PersonChip person, Facilitet facilitet) {
        facilitet.addPerson(person);
    }

    public static void createSomeObjects() {
        Gruppe gr1 = Controller.opretGruppe(1);

        PersonChip peter = Controller.opretPerson(1,"Peter",200,12, gr1);
        PersonChip soeren = Controller.opretPerson(2,"Søren",0,35, gr1);
        PersonChip camilla = Controller.opretPerson(3,"Camilla",300,15, gr1);

        Facilitet badeland = Controller.opretFacilitet("Badeland", 3, 0);
        Facilitet bowling = Controller.opretFacilitet("Bowling", 10, 50);
        Facilitet billard = Controller.opretFacilitet("Billard", 15, 75);

        Controller.addPersonTilFacilitet(peter, badeland);
        Controller.addPersonTilFacilitet(peter, billard);

        Controller.addPersonTilFacilitet(soeren, badeland);

        Controller.addPersonTilFacilitet(camilla, badeland);
        Controller.addPersonTilFacilitet(camilla, bowling);
        Controller.addPersonTilFacilitet(camilla, billard);
    }

    public static ArrayList<PersonChip> getPersoner() {
        return Storage.getPersoner();
    }

    public static ArrayList<Facilitet> getFaciliteter() {
        return Storage.getFaciliteter();
    }

    public static Gruppe findGruppe(int gruppeNr) {
        for (Gruppe gruppe : Storage.getGrupper()) {
            if (gruppe.getNr() == gruppeNr)
                return gruppe;
        }
        return null;
    }
}
