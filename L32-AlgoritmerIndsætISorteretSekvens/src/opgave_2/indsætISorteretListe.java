package opgave_2;

import java.util.Arrays;

public class indsætISorteretListe {

    /**
     * Indsætter kunde i kunder. Arrayet kunder er sorteret
     * Krav: kunder er sorteret
     */
    public static void indsætKunde(Customer[] customers, Customer customer) {
        int j = customers.length - 1;
        while (j >= 0 && customers[j] == null) { //Det er vigtigt at j>=0 står først
            j--;
        }
        j++;
        boolean found = false;
        while (!found && j > 0) {
            if (customer.compareTo(customers[j - 1]) > 0) {
                found = true;
            } else {
                customers[j] = customers[j - 1];
                j--;
            }
        }
        customers[j] = customer;
    }

    public static void main(String[] args) {

        Customer[] customers = new Customer[6];

        Customer c1 = new Customer("Andersen", "Anders", 25);
        Customer c2 = new Customer("Brian", "Briansen", 28);
        Customer c3 = new Customer("John", "Jo", 35);
        Customer c4 = new Customer("Culasen", "Coug", 26);
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        System.out.println(Arrays.toString(customers));
        indsætKunde(customers, c4);
        System.out.println("************");
        System.out.println(Arrays.toString(customers));

    }
}
