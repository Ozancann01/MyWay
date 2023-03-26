package src;

public abstract class User {
    private String naam;
    private int leeftijd;
    private double gewicht;
    private double lengte;

    public User(String naam, int leeftijd, double gewicht, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public double berekenBMI() {
        return gewicht / Math.pow(lengte / 100, 2);
    }

    public abstract String getStatus();
}