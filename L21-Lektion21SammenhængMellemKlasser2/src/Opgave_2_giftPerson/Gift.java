package Opgave_2_giftPerson;

import java.util.ArrayList;

public class Gift {
    private String description;
    private double price;

    public final ArrayList<Person> person = new ArrayList<>();

    public Gift (String description){
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
