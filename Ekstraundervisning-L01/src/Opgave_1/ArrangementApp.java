package Opgave_1;

import java.util.ArrayList;

public class ArrangementApp {
    public static void main(String[] args) {
        // Opgave 1.4
        Arrangement fest = new Arrangement("wup wup", true, 100, 15);
        fest.addDeltager("Magnus");
        fest.addDeltager("Magnus");
        fest.addDeltager("Magnus");
        fest.addDeltager("Magnus");
        fest.addDeltager("mor");

        Arrangement party = new Arrangement("fælles oprydning", false, 0, 99);
        party.addDeltager("Magnus");
        party.addDeltager("John");
        party.addDeltager("Karl");
        party.addDeltager("Jimmy");
        party.addDeltager("Tim");
        party.addDeltager("Tag Mus");

        Arrangement pop = new Arrangement("pop", true, 9999, 3);
        pop.addDeltager("Professor Chaos");
        pop.addDeltager("Leopold Stotch");
        pop.addDeltager("Mr. Biggles");

        fest.antalTilmeldte();
        party.antalTilmeldte();
        pop.antalTilmeldte();


        ArrayList<Arrangement> arrangementer = new ArrayList<>();
        arrangementer.add(fest);
        arrangementer.add(party);
        arrangementer.add(pop);

        for (int i = 0; i < arrangementer.size(); i++) {
            System.out.print("Arrangement: ");
            System.out.println(arrangementer.get(i).navn + " \nAntal deltagere " + arrangementer.get(i).antalTilmeldte() + "\n***");
        }

        // Opgave 1.8                   HVORDAN GØR JEG DET?

    }
}
