package Opgave_0;

public class Student extends Person{
    private String hovedfag;

    public Student(String navn, int fødselsår, String hovedfag){
        super (navn, fødselsår);
        this.hovedfag = hovedfag;
    }

    @Override
    public String toString() {return super.toString() + " " + hovedfag;}
}
