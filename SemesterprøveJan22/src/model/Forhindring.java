package model;

import java.util.ArrayList;

public class Forhindring {
    private int nummer;
    private String navn;

    public Forhindring(int nummer, String navn) {
        this.nummer = nummer;
        this.navn = navn;
    }

    //Sammenhænge mellem klasser
    private final ArrayList<Løb> løbs = new ArrayList<>();

    public ArrayList<Løb> getLøbs() {
        return new ArrayList<Løb>(løbs);
    }

    public void addLøb(Løb løb) {
        if (!løbs.contains(løb)) {
            løbs.add(løb);
            løb.addForhindring(this);
        }
    }

    public void removeLøb(Løb løb) {
        if (løbs.contains(løb)) {
            løbs.remove(løb);
            løb.removeForhindring(this);
        }
    }


    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }



}
