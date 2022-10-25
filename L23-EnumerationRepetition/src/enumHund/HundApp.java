package enumHund;

import java.util.ArrayList;

public class HundApp {
    public static void main(String[] args) {
        ArrayList<Hund> hunde;
        hunde = new ArrayList<>();

        Hund h1 = new Hund("John", true, 2000, Race.PUDDEL);
        Hund h2 = new Hund("Brian", false, 10, Race.TERRIER);
        Hund h3 = new Hund("Princess", true, 10000, Race.BOKSER);
        Hund h4 = new Hund("Jimmy", false, 1500, Race.PUDDEL);
        Hund h5 = new Hund("Magnus", true, 1000000, Race.TERRIER);

        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);

        System.out.println(samletPris(hunde, Race.PUDDEL));
    }

    public static int samletPris(ArrayList<Hund> hunde, Race race) {
        int resultat = 0;
        for (Hund h: hunde){
            if (h.getRace() == race){
                resultat = h.getPris() + resultat;
            }
        }
        return resultat;
    }
}