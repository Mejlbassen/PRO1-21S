package Opgave_3_Abstrakt;

public class Synsmand extends Mekaniker {
    private int antalSynForUgen;

    public Synsmand(String navn, String adresse, double timeLønssats, int årForSvendeprøve, int antalSynForUgen) {
        super(navn, adresse, timeLønssats, årForSvendeprøve);
        this.antalSynForUgen = antalSynForUgen;
    }

    public int getAntalSynForUgen() {
        return antalSynForUgen;
    }

    public void setAntalSynForUgen(int antalSynForUgen) {
        this.antalSynForUgen = antalSynForUgen;
    }

    public double beregnLoen() {
        return getTimeLønssats() * 37;
    }
}
