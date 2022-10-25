package Opgave_5_klassehierarki;

public abstract class Vare {
    private String navn;
    private double pris;
    private String beskrivelse;

    public Vare(String navn, double pris, String beskrivelse){
        this.navn = navn;
        this.pris = pris;
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return navn;
    }

    public abstract double beregnSalgsprisMoms();
}
