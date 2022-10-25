package Opgave_3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(99, "Lædersko", 299.5);
        Product p2 = new Product(42, "Svaret på alt", 0.1);
        Product p3 = new Product(420, "Ukrudt", 4.20);
        Product p4 = new Product(720, "TV", 999.9);
        Product p5 = new Product(1, "Mælk", 10.5);

        Customer c1 = new Customer("John", LocalDate.of(2000, 01, 01));
        Customer c2 = new Customer("Steve", LocalDate.of(1991, 12, 12));

        // Første kunde
        Order o1 = new Order(2222);
        Order o2 = new Order(3333);
        c1.addOrder(o1);
        c1.addOrder(o2);
        o1.createOrderLine(1, p1);
        o2.createOrderLine(1, p2);

        // Anden kunde
        Order o3 = new Order(4444);
        Order o4 = new Order(5555);
        Order o5 = new Order(6666);
        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        o3.createOrderLine(1, p3);
        o4.createOrderLine(1, p4);
        o5.createOrderLine(3, p5);
        System.out.println("***************");

        // d
//        c2.setDiscount(FixedDiscount 10);
        System.out.println(c1.totalBuyWithDiscount());

    }
}
