package Opgave_2_Comparable;

public class Customer implements Comparable<Customer> {
    private String ForNavn;
    private String EftNavn;
    private int alder;

    public Customer(String forNavn, String eftNavn, int alder){
        this.ForNavn = forNavn;
        this.EftNavn = eftNavn;
        this.alder = alder;
    }

    public String getForNavn() {
        return ForNavn;
    }

    public String getEftNavn() {
        return EftNavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setForNavn(String forNavn) {
        ForNavn = forNavn;
    }

    public void setEftNavn(String eftNavn) {
        EftNavn = eftNavn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Customer{" + "ForNavn='" + ForNavn + '\'' +
                ", EftNavn='" + EftNavn + '\'' + ", alder=" + alder + '}';
    }

    @Override
    public int compareTo(Customer c){
        int comp = this.EftNavn.compareTo(c.getEftNavn());
        // if(comp==0){comp=this.fornavn.compareTo(c.getFornavn())
        return comp;
    }
}
