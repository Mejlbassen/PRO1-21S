package Opgave_1_whileSøgning;

public class SoegningApp {

	public static void main(String[] args) {
		Soegning s = new Soegning();
		
		// Kode til afprøvning af opgave 1
		System.out.println("******** Opgave 1");
		int[] talArray = {2,4,8,2};
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		talArray[2] = 15;
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

		// Kode til afprøvning af opgave 2
		System.out.println("******** Opgave 2");
		int[] talArray2 = {7, 56, 34, 3, 7, 14, 13, 4};
		System.out.println(s.linearSearchArray(talArray2));

		// Kode til afprøvning af opgave 3
		System.out.println("******** Opgave 3");
		int[] talArray3først = {7, 9, 13, 7, 9, 13};
		int[] talArray3sidst = {7, 9, 13, 13, 9, 7};
		System.out.println("Første array");
		System.out.println(s.toHeltalStårSammen(talArray3først));
		System.out.println("Andet array");
		System.out.println(s.toHeltalStårSammen(talArray3sidst));

	}

}
