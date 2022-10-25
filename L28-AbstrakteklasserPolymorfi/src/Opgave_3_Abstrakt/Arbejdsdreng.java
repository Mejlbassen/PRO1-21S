package Opgave_3_Abstrakt;

public class Arbejdsdreng extends Ansat {
    public Arbejdsdreng(String navn, String adresse, double timeLønssats){
        super(navn, adresse, timeLønssats);
    }

    public double beregnLoen() {
        return getTimeLønssats() * 37;
    }
}
