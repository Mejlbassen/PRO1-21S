package Opgave_5_heltalskvadratroden;

public class Kvadrat {

    public int findKvadrat(int n) {
        int i = 1;
        boolean found = false;
        while (i <= n && !found) {
            if ((i * i <= n && n < (i + 1) * (i + 1))){
                found = true;
            }
            else
            i++;
        }
        return i;
    }

}
