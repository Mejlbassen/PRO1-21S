package Opgave_0;

public class Person {
    private String navn;
    private int fødselsår;

    public Person(String navn, int fødselsår){
        this.navn = navn;
        this.fødselsår = fødselsår;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", fødselsår=" + fødselsår +
                '}';
    }
}
