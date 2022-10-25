package Opgave_4_GeometriskeFigurer;

public class Ellipse extends Cirkel{
    private double radius2;

    public Ellipse (String navn, double radius, double radius2){
        super(navn, radius);
        this.radius2 = radius2;
    }

    @Override
    public double beregnStørrelse() {
        return super.getRadius()*radius2* Math.PI;
    }
}
