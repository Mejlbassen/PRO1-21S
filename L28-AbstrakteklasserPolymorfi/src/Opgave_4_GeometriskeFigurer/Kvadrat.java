package Opgave_4_GeometriskeFigurer;

public class Kvadrat extends Figur{
    private double længde;

    public Kvadrat (String navn, double længde){
        super(navn);
        this.længde = længde;
    }

    @Override
    public double beregnStørrelse() {
        return længde*længde;
    }

    public double getLængde() {
        return længde;
    }
}
