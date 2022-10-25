package Opgave_3_carRental;

public class Car {
    public String license;
    public double pricePerDay;
    public int purchaseYear;

    public Car(String license, int purchaseYear){
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    public void setPricePerDay(double pricePerDay){this.pricePerDay = pricePerDay;}
    public double getPricePerDay(){return this.pricePerDay;}

    public String getLicense(){return this.license;}

    public int getPurchaseYear(){return this.purchaseYear;}







}
