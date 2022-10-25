package opgave_1;

import java.util.ArrayList;

public class indsætISorteretListe {

    /**
     * Indsætter kunde i kunder. Listen kunder er sorteret
     * Krav: kunder er sorteret
     */
    public static void indsætKunde(ArrayList<Customer> customers, Customer customer) {
        boolean found = false;
        int i = 0;
        while (!found && i < customers.size()) {
            if (customers.get(i).compareTo(customer) > 0) {
                found = true;
            } else {
                i++;
            }
        }
        customers.add(i, customer);
    }

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer("Andersen", "Anders", 25);
        Customer c2 = new Customer("Brian", "Briansen", 28);
        Customer c3 = new Customer("John", "Jo", 35);
        Customer c4 = new Customer("Culasen", "Coug", 26);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        System.out.println(customers);
        indsætKunde(customers, c4);
        System.out.println("************");
        System.out.println(customers);

    }
}
