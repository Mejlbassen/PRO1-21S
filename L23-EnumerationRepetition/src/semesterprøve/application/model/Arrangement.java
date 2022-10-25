package semesterprøve.application.model;

import java.util.ArrayList;

public class Arrangement {
    private String navn;
    private boolean offentlig;

    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public ArrayList<Reservation> getReservationer() {
        return new ArrayList<>(reservationer);
    }

    public void addReservation(Reservation reservation) {
        if (!reservationer.contains(reservation)) {
            reservationer.add(reservation);
        }
    }

    public void removeReservation(Reservation reservation) {
        if (reservationer.contains(reservation)) {
            reservationer.remove(reservation);
        }
    }

    public Arrangement(String navn, boolean offentlig) {
        this.navn = navn;
        this.offentlig = offentlig;
    }

    public String getNavn() {
        return navn;
    }

    //                                          MÅSKE FORKERT??
    public int antalReserveredePladser() {
        int resultat = 0;
//        for (Reservation r : reservationer){
//            if (r.getPladser() == plads){
//
//            }
        for (int i = 0; i < reservationer.size(); i++) {
            Reservation rs = reservationer.get(i);
            resultat = resultat + rs.getPladser().size();
        }
        return resultat;
    }


}
