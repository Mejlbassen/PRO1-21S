package Opgave_3_Abstrakt;

public abstract class Ansat extends Person{
private double timeLønssats;

    public Ansat(String navn, String adresse, double timeLønssats) {
        super(navn, adresse);
        this.timeLønssats = timeLønssats;

    }

    public double getTimeLønssats() {
        return timeLønssats;
    }

    public abstract double beregnLoen();

}
