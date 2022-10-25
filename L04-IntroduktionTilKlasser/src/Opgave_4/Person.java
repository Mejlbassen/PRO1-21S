package Opgave_4;

/**
 * Klasse der beskriver en given person i klassen person
 */
public class Person {
    /*
     * Attributter der beskriver personens navn, adresse og løn
     */
    private String name;
    private String address;
    private double monthlySalary;

    /*
     * Constructor, når personen skal oprettes, skal han/hun have et navn, en adresse og en månedsløn.
     */
    public Person (String inputName, String inputAddress, double inputSalary){
        name = inputName;
        address = inputAddress;
        monthlySalary = inputSalary;

    }

    /*
     * Personens navn, adresse og løn kan ændres ved kald af setName, setAddress og setMonthlySalary metoden.
     */
    public void setName(String inputName){name = inputName;}
    public void setAddress(String inputAddress){address = inputAddress;}
    public void setMonthlySalary(double inputMonthlySalary){monthlySalary = inputMonthlySalary;}

    /*
     * Man kan få oplyst personens navn, adresse og løn ved at kalde metoden getName, getAddress og getMonthlySalary.
     */
    public String getName(){return name;}
    public String getAddress(){return address;}
    public double getMonthlySalary(){return monthlySalary;}

    public void printPerson(){
        System.out.println("**************");
        System.out.println("name " + name);
        System.out.println("address " + address);
        System.out.println("Monthly salary " + monthlySalary);
        System.out.println();
    }
}
        //Jeg er kommet til f.