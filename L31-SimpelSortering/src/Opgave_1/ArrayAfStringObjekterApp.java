package Opgave_1;

import java.util.Arrays;

public class ArrayAfStringObjekterApp {

    public static void main(String[] args) {

        //Opgave 1
        String[] s = {"Erna", "Elly", "Rikke", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};
        ArrayAfStringObjekter.bubbleSort(s);
        System.out.println(Arrays.toString(s));
    }
}
