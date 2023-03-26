package src;

public class Stappenteller extends User {
    private int stappen;
    private int doelstappen;

    public Stappenteller(String naam, int leeftijd, double gewicht, double lengte, int doelstappen) {
        super(naam, leeftijd, gewicht, lengte);
        this.doelstappen = doelstappen;
    }

    public void registreerStappen(int stappen) {
        this.stappen += stappen;
    }

    @Override
    public String getStatus() {
        return "Stappen: " + stappen + ", Doel: " + doelstappen;
    }
}