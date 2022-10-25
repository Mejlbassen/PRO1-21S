import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] tabel = new int[10];
		tabel[0] = 45;
		tabel[1] = 27;
		tabel[2] = -12;
		tabel[3] = 15;
		tabel[4] = -8;
		tabel[5] = -4;

		// Alternativ intialisering og oprettelse:
		// int[] tabel = {45, 27, -12, 15, -8, -4, 0, 0, 0, 0};
		
		System.out.println(Arrays.toString(tabel));

		// Opdaterer indholdet på plads nummer 3 til værdien 20
		tabel[3] = 20;

		// Indsætter 17 mellem 27 og -12(ryk -12 og andre brugte værdier en plads til højre)
		int tilHøjre = 2;
		for (int i = tabel.length-1; i > tilHøjre; i--){
			tabel[i] = tabel[i-1];
		}
		tabel[2] = 17;
		System.out.println(Arrays.toString(tabel));

		// Sletter elementet på indeks plads 1 (ryk brugte pladser til venstre)
		for (int i = 1; i < tabel.length-1; i++){
			tabel[i] = tabel[i+1];
		}
		System.out.println(Arrays.toString(tabel));

		// Tilføjer 34 forrest (ryk brugte pladser til højre
		for (int i = tabel.length-1; i > 0; i--){
			tabel[i] = tabel[i-1];
		}
		tabel[0] = 34;
		System.out.println(Arrays.toString(tabel));

		// Tilføjer 29 på den første ledige plads
		int counter = 0;
		for (int i = 0; i < tabel.length; i++){
			if (tabel[i] == 0){
				counter++;
			}
			if (counter == 1){
				tabel[i] = 29;
			}
		}
		System.out.println(Arrays.toString(tabel));


	}

	/**
	* Return the sum of all numbers in the list.
	* Return 0 if the list is empty.
	*/
	public static int sum(int[] liste) {
		return -1;
	}
	/**
	* Return the minimum of all numbers in the list.
	* Pre: The list is not empty.
	*/
	public static int minimum(int[] liste){
		return -1;
	}
	/**
	* Return the maximum of all numbers in the list.
	* Pre: The list is not empty.
	*/
	public static int maximum(int[] liste){
		return -1;
	}
	
	/** Return the number of negative numbers in the list. */
	public static int negative(int[] liste){
		return -1;
	}
	/** Return a new array containing the positive numbers in the list. */
	public static int[] positive(int[] liste){
		return null;
	}
}
