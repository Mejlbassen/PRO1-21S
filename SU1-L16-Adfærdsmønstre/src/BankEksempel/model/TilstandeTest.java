package BankEksempel.model;


import BankEksempel.service.Service;

public class TilstandeTest {

	public static void main(String[] args) {

		KontoType kontotype = Service.createKontoType("Ungdomskonto", "En kontotype til unge under 25, som for at beskytte du unge ikke tillader at der haeves paa en konto med saldo under 0");
		KontoType kontoType2 = Service.createKontoType("Hverdags konto","En kontotype til hverdagsbrug, som køb af fødevarer og betaling af regninger");

		Konto k1 = Service.createKonto(kontotype);
		Konto k21 = Service.createKonto(kontoType2);


		Service.haevEllerIndsaetBeloeb(k1, 100);
		Service.haevEllerIndsaetBeloeb(k1,-50);

		Service.haevEllerIndsaetBeloeb(k21, 400);
		Service.haevEllerIndsaetBeloeb(k21, 200);

		Service.setKontoTilstand(k21, Tilstand.LUKKET);
		
		// tilfoej flere transaktioner og se hvad der sker

		System.out.println(k1);
		System.out.println(k21);

		System.out.println("Konto k21 er: ");
		System.out.println(k21.getTilstand());

	}
}
