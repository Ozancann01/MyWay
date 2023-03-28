package src;


import java.time.LocalDateTime;

public class VastenTracker {


    private int vastenUren;
    private int doelUren;

    public VastenTracker(int doelUren) {
        vastenUren = 0;
        this.doelUren = doelUren;
    }

    public void voegUrenToe(int uren) {
        vastenUren += uren;
    }

    public int getVastenUren() {
        return vastenUren;
    }

    public boolean isDoelBereikt() {
        return vastenUren >= doelUren;
    }

    public void stopVastenTracker() {
        vastenUren = 0;
    }

    public void setVastenUren(int vastenUren) {
        this.vastenUren = vastenUren;
    }

    public int getDoelUren() {
        return doelUren;
    }

    public void setDoelUren(int doelUren) {
        this.doelUren = doelUren;
    }

}
