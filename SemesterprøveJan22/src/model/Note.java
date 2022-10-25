package model;

public class Note {
    private int strafSekunder;

    //Sammenhæng til Forhindring
    private Forhindring forhindring;

    public Note(int strafSekunder, Forhindring forhindring){
        this.strafSekunder = strafSekunder;
        this.forhindring = forhindring;
    }

    public Forhindring getForhindring(){
        return forhindring;
    }

    public int getStrafSekunder() {
        return strafSekunder;
    }

    public void setStrafSekunder(int strafSekunder) {
        this.strafSekunder = strafSekunder;
    }
}
