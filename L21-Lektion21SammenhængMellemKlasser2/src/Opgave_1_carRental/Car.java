package Opgave_1_carRental;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String license, int purchaseYear) {
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }

    public String getLicense() {
        return this.license;
    }

    public int getPurchaseYear() {
        return this.purchaseYear;
    }

    // Opgave 1 fredag 05-11-2021
    public void addRental(Rental rental) {
        if (!rentals.contains(rental)) {
            rentals.add(rental);
            rental.addCar(this);
        }
    }

    public int flestDage() {
        int antalDage = 0;
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.size() > antalDage) {
                antalDage = rentals.get(i).getDays();
            }
        }
        return antalDage;
    }


}
