package Opgave_2;

/**
 * Klassen barn er for alle små mennesker.
 */
public class Child {
    /*
     * Attributter der beskriver barnets tilstand
     */
    private int age;
    private boolean boy; // true if the child is a boy

    /*
     * Constructor, barnet skal oprettes, skal den have et navn. Ved
     * oprettelse er barnet en dreng
     */
    public Child(int age, boolean boy) {
        this.age = age;
        this.boy = boy;
    }

    /*
     * Man kan få oplyst barnets alder, ved at kalde metoden getName
     */
    public int getAge() {
        return age;
    }

    /*
     * Barnets alder kan ændres ved kald af setAge metoden
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Man kan få oplyst barnets køn, ved at kalde metoden
     * isBoy
     */
    public boolean isBoy() {
        return boy;
    }

    /*
     * Barnet kan få ændret køn ved at kalde metoden setBoy
     */
    public void setBoy(boolean boy) {
        this.boy = boy;
    }

    public String institution() {
        String result = "";
        if (age < 1) {
            result = "Home";
        } else if (age >= 1 && age < 3) {
            result = "Nursery";
        } else if (age >= 3 && age < 7) {
            result = "Kindergarten";
        } else if (age >= 7 && age < 17) {
            result = "School";
        } else {
            result = "Out of school";

        }
        return result;
    }


}