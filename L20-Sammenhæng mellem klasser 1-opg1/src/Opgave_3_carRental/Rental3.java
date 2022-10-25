package Opgave_3_carRental;

import java.util.ArrayList;

public class Rental3 {
    public int number;
    public int days;
    public String date;

    // Den er final så man ikke kan give cars en ny værdi et andet sted, den kan kun laves her.
    // Man kan kun add/remove cars.
    private final ArrayList<Car> cars = new ArrayList<>();
    public Rental3(int number, String date, int days){
        this.number = number;
        this.date = date;
        this.days = days;
    }

//    public double getPrice(){return this.getPrice();}

    public void setDays(int days){this.days = days;}

    public String getDate(){return this.date;}

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < cars.size(); i++){
            price += cars.get(i).getPricePerDay() * days;
        }
        return price;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

}
