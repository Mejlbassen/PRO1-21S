package Opgave_1;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
	/*
	 * Attributter der beskriver den ansattes tilstand
	 */
	private String name;
	private boolean trainee;
	private int age;	//MAGNUS

	/*
	 * Constructor, når den ansatte oprettes, skal den have et navn. Ved
	 * oprettelse er den ansatte en trainee
	 */
	public Employee(String inputName, int inputAge) {	//MAGNUS
		name = inputName;
		trainee = true;
		age = inputAge;	//MAGNUS
	}


	/*
	 * Den ansattes navn kan ændres ved kald af setName metoden
	 */
	public void setName(String inputName) {
		name = inputName;
	}
	public void setAge(int inputAge){age = inputAge;}	//MAGNUS


	/*
	 * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
	 */
	public String getName() {
		return name;
	}
	public int getAge(){return age;}	//MAGNUS


	/*
	 * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
	 */
	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	/*
	 * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
	 * isTrainee
	 */
	public boolean isTrainee() {
		return trainee;
	}


	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Name " + name);
		System.out.println("Trainee " + trainee);
		System.out.println("Age " + age);	//MAGNUS
	}
}
