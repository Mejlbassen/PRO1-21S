package Opgave_3_Abstrakt;

public class Mekaniker extends Ansat {
    private int årForSvendeprøve;

    public Mekaniker (String navn, String adresse, double timeLønssats, int årForSvendeprøve){
        super (navn, adresse, timeLønssats);
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public int getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public void setÅrForSvendeprøve(int årForSvendeprøve) {
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public double beregnLoen() {
        return getTimeLønssats() * 37;
    }
}
