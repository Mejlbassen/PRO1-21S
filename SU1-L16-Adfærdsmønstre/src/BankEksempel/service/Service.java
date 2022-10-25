package BankEksempel.service;


import BankEksempel.model.Konto;
import BankEksempel.model.KontoType;
import BankEksempel.model.Tilstand;
import BankEksempel.storage.Storage;

public class Service {

    public static KontoType createKontoType(String navn, String beskrivelse) {

        KontoType kontoType = new KontoType(navn, beskrivelse);
        Storage.addKontoType(kontoType);
        return kontoType;
    }

    public static Konto createKonto(KontoType kontoType) {
        Konto konto = null;

        konto = new Konto(kontoType);


        return konto;
    }

    public static void haevEllerIndsaetBeloeb(Konto konto, int beloeb) {
        try {
            konto.haevEllerIndsaetBeloeb(beloeb);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static Konto setKontoTilstand(Konto konto, Tilstand tilstand) {
        konto.setTilstand(tilstand);

        return konto;
    }

//	public static void closeKonto(Konto konto){
//		if (Storage.getKontoTyper().contains(konto)){
//			Storage.getKonti().
//			//konto.setTilstand(Tilstand.LUKKET);
//			//Storage.getKontoTyper().set(kontoType, Tilstand.LUKKET);
//		}
//	}

}
