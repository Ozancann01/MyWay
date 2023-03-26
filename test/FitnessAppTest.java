import org.junit.Test;
import src.Stappenteller;
import src.Trainingsagenda;
import src.User;

import static org.junit.Assert.*;


public class FitnessAppTest  {


    @Test
    public void testBerekenBMI() {
        // Arrange
        User user = new Stappenteller("Jan", 30, 75, 180, 10000);
        double expectedBMI = 75 / Math.pow(180 / 100.0, 2);

        // Act
        double actualBMI = user.berekenBMI();

        // Assert
        assertEquals("Fout bij het berekenen van BMI", expectedBMI, actualBMI, 0.001);
    }

    @Test
    public void testStappenteller() {
        // Arrange
        Stappenteller stappenteller = new Stappenteller("Jan", 30, 75, 180, 10000);

        // Act
        stappenteller.registreerStappen(5000);
        stappenteller.registreerStappen(2000);
        String status = stappenteller.getStatus();

        // Assert
        assertTrue("Fout bij het bijhouden van stappen",status.contains("Stappen: 7000"));
    }

    @Test
    public void testTrainingsagenda() {
        // Arrange
        Trainingsagenda trainingsagenda = new Trainingsagenda("Piet", 28, 80, 175);

        // Act
        trainingsagenda.voegTrainingToe("Hardlopen");
        trainingsagenda.voegTrainingToe("Krachttraining");
        String statusNaToevoegen = trainingsagenda.getStatus();
        trainingsagenda.verwijderTraining("Hardlopen");
        String statusNaVerwijderen = trainingsagenda.getStatus();

        // Assert
        assertTrue("Fout bij het toevoegen van trainingen",statusNaToevoegen.contains("Hardlopen") && statusNaToevoegen.contains("Krachttraining") );
        assertTrue("Fout bij het verwijderen van trainingen",!statusNaVerwijderen.contains("Hardlopen") && statusNaVerwijderen.contains("Krachttraining") );
    }
}

