package src;


public class VastenTracker{


    private int vastenUren;
    private int doelUren;

    private boolean vastenBezig;


    public void startVasten() {
        if (!vastenBezig) {
            vastenBezig = true;
        }
    }

    public void stopVasten() {
        if (vastenBezig) {
            vastenBezig = false;
        }
    }

    public boolean isVasten() {
        return vastenBezig;
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
