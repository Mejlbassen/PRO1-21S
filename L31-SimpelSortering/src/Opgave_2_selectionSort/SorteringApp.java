package Opgave_2_selectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class SorteringApp {

    public static void main(String[] args) {

        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        System.out.println("Selectionsortering");
        System.out.println(Arrays.toString(s));
        SelectionSort.selectionSort(s);
        System.out.println(Arrays.toString(s));
        System.out.println("************************");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Johnson", "John", 20));
        customers.add(new Customer("Lordsen", "Lord", 35));
        customers.add(new Customer("Bowen", "Jarrod", 24));
        customers.add(new Customer("Mejlgaard", "Magnus", 30));
        customers.add(new Customer("Johnson", "Jimmy", 34));
        customers.add(new Customer("Pedersen", "Magnus", 67));

        System.out.println("Selectionsortering for ArrayList");
        System.out.println(customers);
        SelectionSort.selectionSort2(customers);
        System.out.println(customers);


    }

}
