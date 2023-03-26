package myway.src;

import java.util.ArrayList;
import java.util.List;

public class Trainingsagenda extends User {
    private List<String> trainingen;

    public Trainingsagenda(String naam, int leeftijd, double gewicht, double lengte) {
        super(naam, leeftijd, gewicht, lengte);
        this.trainingen = new ArrayList<>();
    }

    public void voegTrainingToe(String training) {
        trainingen.add(training);
    }

    public void verwijderTraining(String training) {
        trainingen.remove(training);
    }

    @Override
    public String getStatus() {
        return "Trainingen: " + String.join(", ", trainingen);
    }
}