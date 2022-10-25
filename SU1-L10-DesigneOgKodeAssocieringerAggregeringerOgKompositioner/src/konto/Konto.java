package konto;

import java.time.LocalDate;

/*
 * Attributter der beskriver den kontoens tilstand
 */
public class Konto {
    private int nr;
    private int saldo;
    private String kontoType;
    private String status;



    /*
     * Constructor, når kontoen oprettes, skal den have nogle værdier.
     */
    public Konto(int nr, String kontoType) {
        this.nr = nr;
        this.saldo = 0;
        this.kontoType = kontoType;
        this.status = "åben";
    }


    /*
     * kontoens informationer kan ændres ved kald af set metoden.
     */

    //Kod metoden indsætBeløb, et beløb kan kun indsættes på en ”åben” konto.
    public void indsætBeløb(int beløb) {
        if (status.equals("åben")) {
            this.saldo = saldo + beløb;
        } else {
            System.out.println("Konto er lukket");
        }
    }

    //Kod metoden hævBeløb, et beløb kan kun hæves fra en ”åben” konto.
    public void hævBeløb(int beløb) {
        if (status.equals("åben")) {
            this.saldo = saldo - beløb;
        } else {
            System.out.println("Konto er lukket");
        }
    }

    public  void lukKonto(){
        status = "lukket";
    }

    public void setKontoType(String kontoType) {
        this.kontoType = kontoType;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    // public void setName(String inputName) {name = inputName;} //skal fjernes

    /*
     * Man kan få oplyst kontoens værdier, ved at kalde metoden get.
     */
    public int getNr() {
        return nr;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getKontoType() {
        return kontoType;
    }

    public String getStatus() {
        return status;
    }



}
