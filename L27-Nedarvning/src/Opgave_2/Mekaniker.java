package Opgave_2;

public class Mekaniker extends Person {
    private int årForSvendeprøve;
    private double timeLønssats;

    public Mekaniker (String navn, String adresse, int årForSvendeprøve, double timeLønssats){
        super (navn, adresse);
        this.årForSvendeprøve = årForSvendeprøve;
        this.timeLønssats = timeLønssats;
    }

    public int getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public double getTimeLønssats() {
        return timeLønssats;
    }

    public void setÅrForSvendeprøve(int årForSvendeprøve) {
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public void setTimeLønssats(double timeLønssats) {
        this.timeLønssats = timeLønssats;
    }

    public double beregnLoen(){
        return timeLønssats * 37;
    }
}
