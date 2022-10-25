package udleveretKode.model_classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Arrangement {
    private String navn;
    private String ansvarlig;
    private LocalDate premiereDato;
    private int pris;

    // aggregering --> 0..* Event
    private final ArrayList<Event> events = new ArrayList<>();

    public Arrangement(String navn, String ansvarlig, LocalDate premiereDato, int pris) {
        this.navn = navn;
        this.ansvarlig = ansvarlig;
        this.premiereDato = premiereDato;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAnsvarlig() {
        return ansvarlig;
    }

    public void setAnsvarlig(String ansvarlig) {
        this.ansvarlig = ansvarlig;
    }

    public LocalDate getPremiereDato() {
        return premiereDato;
    }

    public void setPremiereDato(LocalDate premiereDato) {
        this.premiereDato = premiereDato;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    //-----------------------------------------------------

    public ArrayList<Event> getEvents() {
        return new ArrayList<>(events);
    }

    //-----------------------------------------------------

 }

