package semesteropgaveJuni2015;

import java.time.LocalTime;

public class Parkeringsplads {
    private int nummer;
    private LocalTime ankomst;
    // association --> 0..1 Group
    private Bil bil;
    private Parkeringshus parkeringshus;


    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        if (this.bil != bil) {
            this.bil = bil;
            ankomst = LocalTime.now();
        }
    }

    Parkeringsplads(int nummer, Parkeringshus parkeringshus) {
        this.nummer = nummer;
        this.ankomst = null;
        this.parkeringshus = parkeringshus;
    }

    public Parkeringshus getParkeringshus() {
        return parkeringshus;
    }

    public void setParkeringshus(Parkeringshus parkeringshus) {
        this.parkeringshus = parkeringshus;
    }

    public int getNummer() {
        return nummer;
    }

    public LocalTime getAnkomst() {
        return ankomst;
    }

    public void removeBil(){
        this.bil = null;
        setBil(null);
    }
}

