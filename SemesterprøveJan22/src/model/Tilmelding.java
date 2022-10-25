package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tilmelding {
    private String navn;
    private boolean kvinde;
    private LocalDate tilmeldingsdato;
    private int løbeNummer;
    private int løbstid;

    public Tilmelding(String navn, boolean kvinde, LocalDate tilmeldingsdato, int løbeNummer, int løbstid) {
        this.navn = navn;
        this.kvinde = kvinde;
        this.tilmeldingsdato = tilmeldingsdato;
        this.løbeNummer = løbeNummer;
        this.løbstid = løbstid;
    }

    // Sammenhæng til Note
    private final ArrayList<Note> notes = new ArrayList<>();
    public ArrayList<Note> getNotes() {
        return new ArrayList<>(notes);
    }
    public Note createNote(int strafSekunder, Forhindring forhindring) {
        Note note = new Note(strafSekunder, forhindring);
        notes.add(note);
        return note;
    }

    public String getNavn() {
        return navn;
    }

    public boolean isKvinde() {
        return kvinde;
    }

    public LocalDate getTilmeldingsdato() {
        return tilmeldingsdato;
    }

    public int getLøbeNummer() {
        return løbeNummer;
    }

    public void setLøbeNummer(int løbeNummer) {
        this.løbeNummer = løbeNummer;
    }

    public int getLøbstid() {
        return løbstid;
    }

    public void setLøbstid(int løbstid) {
        this.løbstid = løbstid;
    }

    //Opgave 3
    public void registrerStrafPåForhindring(String navnForhindring, int strafSekunder){
//        super(navnForhindring, strafSekunder);
//        navnForhindring = createNote().getForhindring();
//        strafSekunder = createNote().getStrafSekunder();
//        navnForhindring = notes.get(Forhindring);
//        createNote();
//        createNote new Forhindring(2, "Mur");
    }

    //Opgave 4
    public int resultatTid(){
        return løbstid;
    }



}
