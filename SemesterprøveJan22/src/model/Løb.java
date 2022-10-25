package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Løb {
    private LocalDate dato;
    private String sted;
    private int normalPris;
    private LocalDate earlyBirdDate;
    private int earlyBirdPris;

    //Sammenhænge mellem klasser
    private final ArrayList<Forhindring> forhindringer = new ArrayList<>();
    private final ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();

    public ArrayList<Forhindring> getForhindringer() {
        return new ArrayList<>(forhindringer);
    }
    public ArrayList<Tilmelding> getTilmeldinger() {
        return new ArrayList<>(tilmeldinger);
    }

    public void addForhindring(Forhindring forhindring) {
        if (!forhindringer.contains(forhindring)) {
            forhindringer.add(forhindring);
            forhindring.addLøb(this);
        }
    }
    public Tilmelding createTilmelding(String navn, boolean kvinde, LocalDate tilmeldingsdato, int løbeNummer, int løbstid) {
        Tilmelding tilmelding = new Tilmelding(navn, kvinde, tilmeldingsdato, løbeNummer, løbstid);
        tilmeldinger.add(tilmelding);
        return tilmelding;
    }


        public void removeForhindring (Forhindring forhindring){
            if (forhindringer.contains(forhindring)) {
                forhindringer.remove(forhindring);
                forhindring.removeLøb(this);
            }
        }

    public Løb(LocalDate dato, String sted, int normalPris, LocalDate earlyBirdDate,int earlyBirdPris){
                this.dato = dato;
                this.sted = sted;
                this.normalPris = normalPris;
                this.earlyBirdDate = earlyBirdDate;
                this.earlyBirdPris = earlyBirdPris;
            }

            public LocalDate getDato () {
                return dato;
            }

            public String getSted () {
                return sted;
            }

            public int getNormalPris () {
                return normalPris;
            }

            public LocalDate getEarlyBirdDate () {
                return earlyBirdDate;
            }

            public int getEarlyBirdPris () {
                return earlyBirdPris;
            }
    //Opgave 2
    public int earlyBirdIndtjening(){
        int gebyr = earlyBirdPris;
        int antal = 0;
        for (int i = 0; i < tilmeldinger.size(); i++){
            if (tilmeldinger.get(i).getTilmeldingsdato().isBefore(earlyBirdDate))
                antal++;
            }
        return antal * gebyr;
    }

    //Opgave 5
    public double gennemsnitStrafSekunder(Forhindring forhindring){
        int strafTid = 0;
//        for (Tilmelding tilmelding : tilmeldinger){
//            strafTid += tilmelding.getNotes().get().getStrafSekunder();
        return strafTid;
        }

    //Opgave 8
//    @Override
//    public String vinder(Tilmelding tilmelding) {
//
//    }


}

