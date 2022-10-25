package Opgave_5_klassehierarki;

public class Spiritus extends Vare {
    private int alkoholProcent;

    public Spiritus(String navn, double pris, String beskrivelse, int alkoholProcent){
        super(navn, pris, beskrivelse);
        this.alkoholProcent = alkoholProcent;
    }

    public double beregnSalgsprisMoms(){
        if (getPris() <= 90){
            return getPris() * 1.8;
        }
        else return getPris() * 2.2;
    }
}
