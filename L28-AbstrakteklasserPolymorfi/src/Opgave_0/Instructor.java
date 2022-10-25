package Opgave_0;

public class Instructor extends Person{
    private double månedsløn;

    public Instructor(String navn, int fødselsår, double månedsløn){
        super (navn, fødselsår);
        this.månedsløn = månedsløn;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "månedsløn=" + månedsløn +
                '}';
    }
}
