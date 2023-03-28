package src;

public class WaterTracker{


    private double waterInname;
    private double doelInname;


    public void voegWaterToe(double hoeveelheid) {
        waterInname += hoeveelheid;
    }

    public double getWaterInname() {
        return waterInname;
    }

    public boolean isDoelBereikt() {
        return waterInname >= doelInname;
    }

    public void stopWaterTracker() {
        waterInname = 0;
    }
    public void setWaterInname(double waterInname) {
        this.waterInname = waterInname;
    }

    public double getDoelInname() {
        return doelInname;
    }

    public void setDoelInname(double doelInname) {
        this.doelInname = doelInname;
    }


}