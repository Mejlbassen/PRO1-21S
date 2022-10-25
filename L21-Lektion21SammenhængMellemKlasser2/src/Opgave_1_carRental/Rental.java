package Opgave_1_carRental;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;

    // Den er final så man ikke kan give cars en ny værdi et andet sted, den kan kun laves her.
    // Man kan kun add/remove cars.
    private final ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, String date, int days) {
        this.number = number;
        this.date = date;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    // Opgave 1 fredag 05-11-2021
    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
            car.addRental(this);
        }
    }

//    public double getPrice(){return this.getPrice();}

    public void setDays(int days) {
        this.days = days;
    }

    public String getDate() {
        return this.date;
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < cars.size(); i++) {
            price += cars.get(i).getPricePerDay() * days;
        }
        return price;
    }


}
