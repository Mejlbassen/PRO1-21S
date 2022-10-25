package Opgave_4_GeometriskeFigurer;

public class Rektangel extends Kvadrat{
    private double bredde;

    public Rektangel(String navn, double længde, double bredde){
        super(navn, længde);
        this.bredde = bredde;
    }

    @Override
    public double beregnStørrelse() {
        return super.getLængde()*bredde;
    }
}
