package Opgave_4_GeometriskeFigurer;

public abstract class Figur {
    private String navn;

    public Figur(String navn){
        this.navn = navn;
    }


    public String getNavn() {
        return navn;
    }

    public abstract double beregnStørrelse();
}


