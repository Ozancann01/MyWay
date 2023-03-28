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

    public void isDoelBereikt() {

        if (vastenUren >= doelUren&& doelUren>0){
            System.out.println("Doel is bereikt.");
        }
        else {
            if (doelUren==0){
                System.out.println("Doel is   nog niet ingesteld.");
            }else {
                System.out.println("Doel is  niet  bereikt.");
            }

        }


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
