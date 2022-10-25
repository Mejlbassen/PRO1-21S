package BankEksempel.storage;

import java.util.ArrayList;


import BankEksempel.model.KontoType;
import BankEksempel.model.Konto;
import BankEksempel.model.Tilstand;

public class Storage {

	private static ArrayList<KontoType> kontoTyper = new ArrayList<KontoType>();

	public static void addKontoType(KontoType kontoType) {
		if (!kontoTyper.contains(kontoType)) {
			kontoTyper.add(kontoType);
		}
	}

	public static ArrayList<KontoType> getKontoTyper() {
		return kontoTyper;
	}


//	public Konto lukTilstand(Konto konto){
//		if (kontoTyper.contains(konto)){
//			konto.setTilstand(Tilstand.LUKKET);
//		}
//		return konto;
//	}
}
