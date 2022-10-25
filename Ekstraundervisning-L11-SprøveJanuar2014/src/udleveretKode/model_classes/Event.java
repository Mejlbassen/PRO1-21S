package udleveretKode.model_classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    // aggregering --> 1 Arrangement
    private Arrangement arrangement;

    // associering --> 0..* Ressource
    private final ArrayList<Ressource> ressourcer = new ArrayList<>();

    public Event(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public void setSlutDato(LocalDate slutDato) {
        this.slutDato = slutDato;
    }

    //-----------------------------------------------------

    public Arrangement getArrangement() {
        return arrangement;
    }

    //-----------------------------------------------------


    public ArrayList<Ressource> getRessourcer() {
        return new ArrayList<>(ressourcer);
    }

    //-----------------------------------------------------

}
