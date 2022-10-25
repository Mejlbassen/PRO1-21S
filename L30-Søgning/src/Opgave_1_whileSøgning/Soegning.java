package Opgave_1_whileSøgning;

public class Soegning {

    //Opgave 1
    public boolean findUlige(int[] tabel) {
        boolean found = false;
        int i = 0;
        while (!found && i < tabel.length) {
            int k = tabel[i];
            if (k % 2 == 1)
                found = true;
            else
                i++;
        }
        return found;
    }

    //Opgave 2
    public int linearSearchArray(int[] arr) {
        int result = -1;
        int i = 0;
        while (result == -1 && i < arr.length) {
            int k = arr[i];
            if (k > 10 && k < 15)
                result = k;
            else
                i++;
        }
        return result;
    }

    //Opgave 3
    public boolean toHeltalStårSammen(int[] tabel) {
        boolean found = false;
        int i = 0;
        while (!found && i < tabel.length-1) {
            int k = tabel[i];
            if (tabel[i] == tabel[i+1])
                found = true;
            else
                i++;
        }
        return found;
    }

}