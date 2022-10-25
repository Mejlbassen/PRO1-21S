package Opgave_2;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(4, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old
		Child c3 = new Child(10, true);

		System.out.println("Et barn på " + c1.getAge());
		System.out.println(c1.getAge() + " : " + c1.institution());
		System.out.println();

		System.out.println("Et barn på " + c2.getAge());
		System.out.println(c2.getAge() + " : " + c2.institution());
		System.out.println();

		System.out.println("Et barn på " + c3.getAge());
		System.out.println(c3.getAge() + " : " + c3.institution());
		System.out.println();
	}

}
