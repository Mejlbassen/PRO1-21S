package udleveretKode.model_classes;

import java.util.ArrayList;

public class Ressource {
    private String navn;
    private String beskrivelse;

    // associering --> 0..* Event
    private final ArrayList<Event> events = new ArrayList<>();

    public Ressource(String navn, String beskrivelse) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    //-----------------------------------------------------

    public ArrayList<Event> getEvents() {
        return new ArrayList<>( events);
    }

}
