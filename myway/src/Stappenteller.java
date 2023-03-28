package src;

public class Stappenteller {


    private int stappen;
    private int doelStappen;

    public Stappenteller(int doelStappen) {
        stappen = 0;
        this.doelStappen = doelStappen;
    }

    public void voegStappenToe(int stappen) {
        this.stappen += stappen;
    }

    public int getStappen() {
        return stappen;
    }

    public boolean isDoelBereikt() {
        return stappen >= doelStappen;
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