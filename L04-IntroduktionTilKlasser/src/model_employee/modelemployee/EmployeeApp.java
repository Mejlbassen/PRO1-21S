package model_employee.modelemployee;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hans Jensen");
		e1.printEmployee();
		e1.setName("Viggo");
		e1.printEmployee();

	}

}
