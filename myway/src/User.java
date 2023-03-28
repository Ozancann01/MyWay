package src;
public class User {

    private String naam;

    private int leeftijd;
    private double gewicht;
    private double lengte;

    VastenTracker vastenTracker;
    WaterTracker waterTracker;
    Stappenteller stappenteller;
    Trainingsagenda trainingsagenda;

    public User(String naam, int leeftijd, double gewicht, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public void startVastenTracker(int doelUren) {
        this.vastenTracker = new VastenTracker(doelUren);
    }

    public void startWaterTracker(double doelInname) {
        this.waterTracker = new WaterTracker(doelInname);
    }

    public void startStappenteller(int doelStappen) {
        this.stappenteller = new Stappenteller(doelStappen);
    }

    public void startTrainingsagenda() {
        this.trainingsagenda = new Trainingsagenda();
    }

    public double berekenBMI() {
        return gewicht / Math.pow(lengte / 100, 2);
    }

    public void voegVastenUrenToe(int uren) {
        vastenTracker.voegUrenToe(uren);
    }

    public void voegWaterInnameToe(double hoeveelheid) {
        waterTracker.voegWaterToe(hoeveelheid);
    }

    public void voegStappenToe(int stappen) {
        stappenteller.voegStappenToe(stappen);
    }



    public void stopVastenTracker() {
        vastenTracker.stopVastenTracker();
    }

    public void stopWaterTracker() {
        waterTracker.stopWaterTracker();
    }

    public void stopStappenteller() {
        stappenteller.stopStappenteller();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

}