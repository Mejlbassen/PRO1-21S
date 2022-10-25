package Opgave_3;

import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		Scanner in = new Scanner(System.in);
		System.out.println("Hello. Our prices are as follows:");
		theater.udskrivArray(theater.seats);
		System.out.println(" ");
		System.out.println("Vil du købe en billet? (ja/nej) ");
		String billet = in.nextLine();
	}
}
