package Opgave_1_Measurable;

public class Chili implements Measurable{
    private String navn;
    private int styrke;

    public Chili(String navn, int styrke){
        this.navn = navn;
        this.styrke = styrke;
    }

    @Override
    public double getMeasure(){
        return styrke;
    }

    public String getNavn() {
        return navn;
    }

    public int getStyrke() {
        return styrke;
    }
}
