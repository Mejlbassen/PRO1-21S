package semesteropgaveJuni2015;

public class Invalideplads extends Parkeringsplads {
    private double areal;

    public Invalideplads(int nummer, Parkeringshus parkeringshus, double areal) {
        super(nummer, parkeringshus);
        this.areal = areal;
    }

    public double getAreal() {
        return areal;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }
}
