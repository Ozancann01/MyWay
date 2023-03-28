package src;

public class Stappenteller {


    private int stappen;
    private int doelStappen;


    public void voegStappenToe(int stappen) {
        this.stappen += stappen;
    }

    public int getStappen() {
        return stappen;
    }

    public void isDoelBereikt() {

        if (stappen >= doelStappen&& doelStappen>0){
            System.out.println("Doel is bereikt.");
        }
        else {
            if (doelStappen==0){
                System.out.println("Doel is   nog niet ingesteld.");
            }else {
                System.out.println("Doel is  niet  bereikt.");
            }

        }

    }

    public void stopStappenteller() {
        stappen = 0;
    }


    public int getDoelStappen() {
        return doelStappen;
    }

    public void setDoelStappen(int doelStappen) {
        this.doelStappen = doelStappen;
    }



}