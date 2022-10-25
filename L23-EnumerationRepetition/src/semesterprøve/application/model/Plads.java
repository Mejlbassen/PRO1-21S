package semesterprøve.application.model;

import java.util.ArrayList;

public class Plads {
    private int nr;
    private Område område;
    private static double standardTimePris = 50;

    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Plads(int nr, Område område) {
        this.nr = nr;
        this.område = område;
    }

    public ArrayList<Reservation> getReservationer() {
        return new ArrayList<Reservation>(reservationer);
    }

    public void addReservation(Reservation reservation) {
        if (!reservationer.contains(reservation)) {
            reservationer.add(reservation);
            reservation.addPlads(this);
        }
    }

    public void removeReservation(Reservation reservation) {
        if (reservationer.contains(reservation)) {
            reservationer.remove(reservation);
            reservation.removePlads(this);
        }
    }

    public int getNr() {
        return nr;
    }

    public Område getOmråde() {
        return område;
    }

    public static double getStandardTimePris() {
        return standardTimePris;
    }

    public static void setStandardTimePris(double standardTimePris) {
        Plads.standardTimePris = standardTimePris;
    }

    public double pris(int timer) {
        double resultat = 0;
        if (område == Område.STANDARD) {
            resultat = standardTimePris;
        } else if (område == Område.BØRNE) {
            resultat = standardTimePris * 0.8;
        } else if (område == Område.TURNERING) {
            resultat = standardTimePris * 1.1;
        } else {
            resultat = standardTimePris * 1.25;
        }
        return resultat;
    }
}
