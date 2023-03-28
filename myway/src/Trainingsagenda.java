package src;

import src.trainingSorten.Training;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Trainingsagenda {


    private ArrayList<Training> trainingen = new ArrayList<>();


    public ArrayList<Training> getTrainingen() {
        return trainingen;
    }


    public void voegTrainingToe(Training training) {
        trainingen.add(training);
    }

    public void verwijderTraining(String trainingNaam) {
        trainingen.removeIf(training -> training.getNaam().equals(trainingNaam));
    }

    public List<Training> getAlleTrainingen() {
        return new ArrayList<>(trainingen);
    }


    public void setTrainingen(ArrayList<Training> trainingen) {
        this.trainingen = trainingen;
    }

}
