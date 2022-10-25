package konto;

public class KontoApp {

    public static void main(String[] args) {
        Konto magnus = new Konto(1, "Primær konto");
        System.out.println(magnus.getNr() + ", " + magnus.getKontoType() + ", " + magnus.getStatus() + ", " + magnus.getSaldo());
        magnus.indsætBeløb(200);
        System.out.println(magnus.getSaldo());
        magnus.hævBeløb(100);
        System.out.println(magnus.getSaldo());
        magnus.lukKonto();
        System.out.println(magnus.getSaldo());
        magnus.indsætBeløb(200);
        System.out.println(magnus.getSaldo());
        System.out.println(magnus.getStatus());

    }
}
