package Opgave_2;

import model.MethodsArrayList;

import java.util.ArrayList;

public class MethodsArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(35);
		list.add(14);
		list.add(7);
		MethodsArrayList methods = new MethodsArrayList();
		System.out.println(list);
		System.out.println("Summen af tallene i listen med for "
				+ methods.sumListe(list));
		System.out.println("Summen af tallene i listen med forEach "
				+ methods.sumListe2(list));

		System.out.println("Indeks for det første lige tal: "
				+ methods.hasEvenAtIndex(list));


		ArrayList<Integer> min = new ArrayList<>();
		list.add(11);
		list.add(18);
		list.add(8);
		list.add(10);
//		System.out.println("Det mindste tal i listen er: "
//				+ methods.min);
	}

}
