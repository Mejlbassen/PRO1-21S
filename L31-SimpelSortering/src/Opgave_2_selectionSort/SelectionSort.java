package Opgave_2_selectionSort;

import java.util.ArrayList;

public class SelectionSort {

    //Opgave 2
    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    
    public static void selectionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j;
                }
                
            }
            swap(list, i, minPos);
        }
    }

    //selectionSort til arrayList
    private static void swap2(ArrayList<Customer> list2, int i, int j) {
        Customer temp = list2.get(i);
        list2.set(i, list2.get(j));
        list2.set(j, temp);
    }

    public static void selectionSort2(ArrayList<Customer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            int minPos = i;
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(j).compareTo(list2.get(minPos)) < 0) {
                    minPos = j;
                }

            }
            swap2(list2, i, minPos);
        }
    }

//    public static void selectionSort2(ArrayList<Customer> list2) {
//        for (int i = 0; i < list2.size(); i++) {
//            int minPos = i;
//            for (int j = i + 1; j < list2.size(); j++) {
//                if (list2.get(j).equals(list2.get(minPos))) {
//                    minPos = j;
//                }
//
//            }
//            swap2(list2, i, minPos);
//        }
//    }

    
}
