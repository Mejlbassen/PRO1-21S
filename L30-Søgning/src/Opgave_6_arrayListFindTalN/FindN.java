package Opgave_6_arrayListFindTalN;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindN {

    public int find(ArrayList<Integer> list, int n) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < list.size()) {
            int z = list.get(i);
            if (z == n) {
                Collections.swap(list, i, i-1);
                indeks = i;
            }else{
                i++;
            }
        }
        return indeks;
    }


}
