package Opgave_2_Comparable;

import Opgave_1_Measurable.Chili;
import Opgave_1_Measurable.Measurable;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Magnus", "Mejlgaard", 23);
        Customer c2 = new Customer("Jens","Jensen",45);
        Customer c3 = new Customer("Bo","Kjøller",64);

        Customer[] customers = new Customer[3];

        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        System.out.println("Last customer");
        System.out.println(lastCustomer(customers).toString());
    }

    public static Customer lastCustomer(Customer[] customers){
        Customer result = customers[0];
        for ( Customer c : customers){
            if (c.compareTo(result) > 0){
                result = c;
            }
        }
        return result;
    }


    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        Customer[] customers2 = new Customer[customers.length];
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(customer) < 0) {
                customers2[i] = customers[i + 1];
                j++;
            }
        }
        return Arrays.copyOf(customers2,j);
        //return arrays.copyOf(afters, i);}
    }
}
