package Opgave_2;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RentalApp {
    public static void main(String[] args) {

        Rental r1 = new Rental(66, 44, 100, LocalDate.of(2021, 11, 1));
        Rental r2 = new Rental(77, 25, 10, LocalDate.now().plusMonths(10));

        System.out.println("Rental 1");
        System.out.println("Dagen før udlejning:");
        System.out.println(r1.getStartDate().minusDays(1));
        System.out.println("Slutdagen:");
        System.out.println(r1.getEndDate());
        System.out.println("Expected price: 4400");
        System.out.println("Pris:");
        System.out.println(r1.getTotalPrice());

        System.out.println("------------------------------------------");

        System.out.println("Rental 1");
        System.out.println("Dagen før udlejning:");
        System.out.println(r2.getStartDate().minusDays(1));
        System.out.println("Slutdagen:");
        System.out.println(r2.getEndDate());
        System.out.println("Expected price: 250");
        System.out.println("Pris:");
        System.out.println(r2.getTotalPrice());

        System.out.println("------------------------------------------");

        System.out.println("Tid mellem udlejningerne");
        System.out.println("Forventet: 9 måneder og 24 dage");
        System.out.println(r1.getStartDate().until(r2.getStartDate()));

        System.out.println("Dage imellem udlejning af r1 og r2:");
        System.out.println(ChronoUnit.DAYS.between(r1.getStartDate(), r2.getStartDate()));

    }
}
