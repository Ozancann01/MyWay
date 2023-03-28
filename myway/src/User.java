package src;
public class User {

    private String naam;

    private int leeftijd;
    private double gewicht;
    private double lengte;

    VastenTracker vastenTracker = new VastenTracker();
    WaterTracker waterTracker = new WaterTracker();
    Stappenteller stappenteller = new Stappenteller();
    Trainingsagenda trainingsagenda =  new Trainingsagenda();

    public User(String naam, int leeftijd, double gewicht, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;


    }

    public double berekenBMI() {
        return gewicht / Math.pow(lengte / 100, 2);
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