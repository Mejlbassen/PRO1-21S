package Opgave_1;

public class Værkfører extends Mekaniker {
    private int årForUdnævnelse;
    private double tillægPerUge;

    public Værkfører (String navn, String adresse, int årForSvendeprøve, double timeLønssats, int årForUdnævnelse, double tillægPerUge){
        super (navn, adresse, årForSvendeprøve, timeLønssats);
        this.årForUdnævnelse = årForUdnævnelse;
        this.tillægPerUge = tillægPerUge;
    }

    public int getÅrForUdnævnelse() {
        return årForUdnævnelse;
    }

    public double getTillægPerUge() {
        return tillægPerUge;
    }

    public void setÅrForUdnævnelse(int årForUdnævnelse) {
        this.årForUdnævnelse = årForUdnævnelse;
    }

    public void setTillægPerUge(double tillægPerUge) {
        this.tillægPerUge = tillægPerUge;
    }
}
