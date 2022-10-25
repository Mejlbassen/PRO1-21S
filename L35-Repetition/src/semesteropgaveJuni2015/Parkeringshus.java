package semesteropgaveJuni2015;

import java.util.ArrayList;

public class Parkeringshus {
    private String adresse;
    // composition: --> 0..* Parkeringsplads
    private final ArrayList<Parkeringsplads> pPladser = new ArrayList<>();

    public Parkeringshus(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public ArrayList<Parkeringsplads> getpPladser() {
        return new ArrayList<>(pPladser);
    }

    public Parkeringsplads createParkeringsplads(int nummer) {
        Parkeringsplads parkeringsplads = new Parkeringsplads(nummer, this);
        pPladser.add(parkeringsplads);
        return parkeringsplads;
    }

    public Parkeringsplads createInvalideplads(int nummer, double areal) {
        Parkeringsplads parkeringsplads = new Parkeringsplads(nummer, this);
        pPladser.add(parkeringsplads);
        return parkeringsplads;
    }

    public void removeParkeringsplads(Parkeringsplads parkeringsplads) {
        if (pPladser.contains(parkeringsplads)) {
            pPladser.remove(parkeringsplads);
        }
    }



    public int antalLedigePladser(){
        int friPlads = 0;
        for (int i = 0; i < pPladser.size(); i++){
            if (pPladser.get(i).getBil() == null){
                friPlads++;
            }
        }
        return friPlads;
    }

    public int findPladsMedBil (String regNummer){
        boolean found = false;
        int i = 0;
        while (!found && i < pPladser.size()) {
            int k = pPladser.get(i).getNummer();
            if (k == regNummer)
                found = true;
            else
                i++;
        }
        return found;
    }
}

