package Opgave_1;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hans Jensen", 10);	//MAGNUS
		e1.printEmployee();
		e1.setName("Viggo");
		e1.printEmployee();
		e1.setAge(32);	//MAGNUS
		e1.printEmployee();	//MAGNUS
// jeg er kommet til opgave 1h
	}

}
