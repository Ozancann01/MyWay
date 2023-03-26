package src;


import java.time.LocalDateTime;

public class VastenTracker extends User {
    private boolean vastenStatus;
    private LocalDateTime starttijd;
    private LocalDateTime eindtijd;

    public VastenTracker(String naam, int leeftijd, double gewicht, double lengte) {
        super(naam, leeftijd, gewicht, lengte);
    }

    public void startVasten() {
        vastenStatus = true;
        starttijd = LocalDateTime.now();
    }

    public void stopVasten() {
        vastenStatus = false;
        eindtijd = LocalDateTime.now();
    }

    @Override
    public String getStatus() {
        if (vastenStatus) {
            return "Vasten gestart op: " + starttijd;
        } else {
            return "Vasten gestopt op: " + eindtijd;
        }
    }
}