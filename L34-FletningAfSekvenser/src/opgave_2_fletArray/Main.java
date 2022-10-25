package opgave_2_fletArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tal1 = {2, 4, 6, 8, 10, 12, 14};
        int[] tal2 = {1, 2, 4, 5, 6, 9, 12, 17};

        System.out.println(Arrays.toString(fællesTal(tal1, tal2)));

    }

    /**
     * Returnerer et sorteret array der indeholder alle
     * elementer tal1 og tal2 har til fælles
     * Krav: tal1 og tal2 er sorterede, indeholder ikke dubletter og
     * indeholder ikke tomme pladser
     */
    public static int[] fællesTal (int[] tal1, int[] tal2){
        int[] result = new int[tal1.length];
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < tal1.length && i2 < tal2.length) {
            if (tal1[i1] < tal2[i2])
                i1++;
            else if (tal1[i1] > tal2[i2])
                i2++;
            else {
                result[j] = tal1[i1];
                i1++;
                i2++;
                j++;
            }
        }
        return result;
    }
}
