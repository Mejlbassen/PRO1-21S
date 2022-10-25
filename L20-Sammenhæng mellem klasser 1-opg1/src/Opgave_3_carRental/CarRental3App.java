package Opgave_3_carRental;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class CarRental3App {
    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<>();
//        cars.add(00000000, 1991);
//        cars.add(11111111, 2001);
//        cars.add(22222222, 2011);
//        cars.add(33333333, 2021);
//        cars.add(44444444, 2007);
//
//        ArrayList<udlejninger> udlejningerere = new arraylist<>();
//        udlejningerere.;
//
//
    Car c1 = new Car("00000000", 1981);
    c1.setPricePerDay(50);
    Car c2 = new Car("11111111", 1991);
    c2.setPricePerDay(50);
    Car c3 = new Car("22222222", 2001);
    c3.setPricePerDay(150);
    Car c4 = new Car("33333333", 2011);
    c4.setPricePerDay(250);
    Car c5 = new Car("44444444", 2021);
    c5.setPricePerDay(500);

    Rental3 r1 = new Rental3(100, "03-11-2021", 11);
    r1.addCar(c1);

    Rental3 r2 = new Rental3(101, "09-11-2021", 5);
    r2.addCar(c4);


    }
}
