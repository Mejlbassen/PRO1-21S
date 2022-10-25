package Opgave_5_klassehierarki;

public class ElArtikel extends Vare {
    private double forbrugPerTime;

    public ElArtikel(String navn, double pris, String beskrivelse, double forbrugPerTime){
        super(navn, pris, beskrivelse);
        this.forbrugPerTime = forbrugPerTime;
    }

    public double beregnSalgsprisMoms(){
        if (getPris() >= 10) {
            return getPris() * 1.30;
        }
        else return getPris() + 3;
    }
}
