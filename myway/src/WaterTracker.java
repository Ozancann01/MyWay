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

    public void isDoelBereikt() {

        if (waterInname >= doelInname&& doelInname>0){
            System.out.println("Doel is bereikt.");
        }
        else {
            if (doelInname==0){
                System.out.println("Doel is   nog niet ingesteld.");
            }else {
                System.out.println("Doel is  niet  bereikt.");
            }

        }
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