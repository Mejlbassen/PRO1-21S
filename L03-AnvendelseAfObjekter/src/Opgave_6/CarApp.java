package Opgave_6;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car("VW UP", "White");
		System.out.println(myCar.getBrand());
		myCar.setRegistrationNumber("AB 11 123");
		System.out.println(myCar.getRegistrationNumber());
		System.out.println(myCar.getKm());
		System.out.println(" ");

		Car myCar2 = new Car("Skoda", "Black");
		System.out.print("Color: ");
		System.out.println(myCar2.getColor());
		System.out.print("Brand: ");
		System.out.println(myCar2.getBrand());
		System.out.print("Reg. number: ");
		myCar2.setRegistrationNumber("CD 22 456");
		System.out.println(myCar2.getRegistrationNumber());
		System.out.print("Driven: ");
		System.out.print(myCar2.getKm());
		System.out.println(" km.");


	}

}
