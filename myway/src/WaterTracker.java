package src;

public class WaterTracker extends User {
    private double waterinname;
    private double waterinnameDoel;

    public WaterTracker(String naam, int leeftijd, double gewicht, double lengte, double waterinnameDoel) {
        super(naam, leeftijd, gewicht, lengte);
        this.waterinnameDoel = waterinnameDoel;
    }

    public void registreerWater(double water) {
        this.waterinname += water;
    }

    @Override
    public String getStatus() {
        return "Waterinname: " + waterinname + "L, Doel: " + waterinnameDoel + "L";
    }
}