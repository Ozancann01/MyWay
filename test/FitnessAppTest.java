import org.junit.Test;
import src.Stappenteller;
import src.Trainingsagenda;
import src.User;
import src.trainingSorten.CardioTraining;
import src.trainingSorten.KrachtTraining;
import src.trainingSorten.Oefening;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;


public class FitnessAppTest  {


    @Test
    public void berekenBMI() {
        // Arrange
        User user = new User("John Doe", 25, 70, 175);

        // Act
        double berekendeBMI = user.berekenBMI();

        // Assert
        assertEquals(22.86, berekendeBMI, 0.01);
    }


    @Test
    public void voegTrainingToeEnVerwijderTraining() {
        // Arrange
        Trainingsagenda trainingsagenda = new Trainingsagenda();
        CardioTraining cardioTraining = new CardioTraining("Cardio1", 30, 5, new Date(), new Time(System.currentTimeMillis()), "Cardio training 1");
        ArrayList<Oefening> oefeningen = new ArrayList<>();
        oefeningen.add(new Oefening("Push-ups", "Push-ups beschrijving"));
        KrachtTraining krachtTraining = new KrachtTraining("Kracht1", oefeningen, 60, 3, 10, new Date(), new Time(System.currentTimeMillis()), "Kracht training 1");

        // Act
        trainingsagenda.voegTrainingToe(cardioTraining);
        trainingsagenda.voegTrainingToe(krachtTraining);
        trainingsagenda.verwijderTraining("Cardio1");

        // Assert
        assertEquals(1, trainingsagenda.getAlleTrainingen().size());
        assertTrue(trainingsagenda.getAlleTrainingen().contains(krachtTraining));
    }

    @Test
    public void testGetInformatie() {
        // Arrange
        CardioTraining cardioTraining = new CardioTraining("Cardio1", 30, 5, new Date(), new Time(System.currentTimeMillis()), "Cardio training 1");
        ArrayList<Oefening> oefeningen = new ArrayList<>();
        oefeningen.add(new Oefening("Push-ups", "Push-ups beschrijving"));
        KrachtTraining krachtTraining = new KrachtTraining("Kracht1", oefeningen, 60, 3, 10, new Date(), new Time(System.currentTimeMillis()), "Kracht training 1");

        // Act
        String cardioInfo = cardioTraining.getInformatie();
        String krachtInfo = krachtTraining.getInformatie();

        // Assert
        assertEquals("Intervaltraining sessie met 5 intervallen.En duur van 30", cardioInfo);
        assertEquals("Krachttraining sessie met 1 oefeningen.En met rust tijd van 60", krachtInfo);
    }


}

