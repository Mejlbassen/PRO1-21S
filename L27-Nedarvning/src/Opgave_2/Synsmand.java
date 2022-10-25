package Opgave_2;

public class Synsmand extends Mekaniker {
    private int antalSynForUgen;

    public Synsmand(String navn, String adresse, int årForSvendeprøve, double timeLønssats, int antalSynForUgen) {
        super(navn, adresse, årForSvendeprøve, timeLønssats);
        this.antalSynForUgen = antalSynForUgen;
    }

    public int getAntalSynForUgen() {
        return antalSynForUgen;
    }

    public void setAntalSynForUgen(int antalSynForUgen) {
        this.antalSynForUgen = antalSynForUgen;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() + 29 * antalSynForUgen;
    }
}
