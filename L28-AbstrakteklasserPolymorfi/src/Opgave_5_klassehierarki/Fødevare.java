package Opgave_5_klassehierarki;

public class Fødevare extends Vare {
    private int holdbarhedsperiode;

    public Fødevare(String navn, double pris, String beskrivelse, int holdbarhedsperiode){
        super(navn, pris, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

    public double beregnSalgsprisMoms(){
        return getPris() * 1.05;
    }
}
