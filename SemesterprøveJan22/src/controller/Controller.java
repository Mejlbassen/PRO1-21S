package controller;

import model.Forhindring;
import model.Løb;
import model.Tilmelding;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static Løb opretLøb(LocalDate dato, String sted, int normalPris, LocalDate earlyBirdDate, int earlyBirdPris){
        Løb løb = new Løb(dato,sted,normalPris,earlyBirdDate,earlyBirdPris);
        Storage.storeLøb(løb);
        return løb;
    }

    public static Forhindring opretForhindring(int nummer, String navn){
        Forhindring forhindring = new Forhindring(nummer, navn);
        Storage.storeForhindring(forhindring);
        return forhindring;
    }

    public static void initStorage() {
        Løb løb1 = Controller.opretLøb(2022-08-23, "Hasle bakker", 500,2022-06-23, 350);

        Forhindring bak = Controller.opretForhindring(1, "Stejl bakke");
        Forhindring msbak = Controller.opretForhindring(2, "Meget stejl bakke");
        Forhindring mud = Controller.opretForhindring(3, "Mudderpøl");
        Forhindring omur = Controller.opretForhindring(4, "Over mur");
        Forhindring ugit = Controller.opretForhindring(5, "Under gitter");

        Tilmelding Sune = Controller.opretTilmelding("Sune", false, 2022-06-23, 1, -1);

        Controller.addTilmeldingTilLøb()
    }

    //Opgave 10
    public static void resultaterTilFil(Løb løb, String filNavn){
        for (Løb løb1 : Storage.getLøb()) {
            if (løb1.getTilmeldinger().get() == filNavn)
                return løb1;
        }
        return null;
    }
    }


}
