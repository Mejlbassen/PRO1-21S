package Opgave_1;

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

        ArrayList<String> navne = new ArrayList<String>();
        navne.add("Hans");
        navne.add("Viggo");
        navne.add("Jens");
        navne.add("Børge");
        navne.add("Bent");
        System.out.println(navne.size());
        navne.add(2, "Jane");
        System.out.println(navne);
        navne.remove(1);
        System.out.println(navne);
        navne.add(0, "Pia");
        navne.add("Ib");
        System.out.println(navne);
        System.out.println(navne.size());
        navne.set(2, "Hansi");
        System.out.println(navne.size());
        System.out.println(navne);
        for (int i = 0; i < navne.size(); i++) {
            System.out.println(navne.get(i).length());
        }
        System.out.println("***");
        for (String navn : navne) {
            System.out.println(navn.length());
        }
    }
}


