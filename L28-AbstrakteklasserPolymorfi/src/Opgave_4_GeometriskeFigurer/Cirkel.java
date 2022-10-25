package Opgave_4_GeometriskeFigurer;

public class Cirkel extends Figur {
    private double radius;
    public Cirkel(String navn, double radius){
        super(navn);
        this.radius = radius;
    }

    @Override
    public double beregnStørrelse() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
}
