package src;

import src.trainingSorten.CardioTraining;
import src.trainingSorten.KrachtTraining;
import src.trainingSorten.Oefening;
import src.trainingSorten.Training;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij de fitness tracker!");

        System.out.print("Voer uw naam in: ");
        String naam = scanner.nextLine();

        System.out.print("Voer uw leeftijd in: ");
        int leeftijd = scanner.nextInt();

        System.out.print("Voer uw gewicht in (in kg): ");
        double gewicht = scanner.nextDouble();

        System.out.print("Voer uw lengte in (in cm): ");
        double lengte = scanner.nextDouble();

        User user = new User(naam, leeftijd, gewicht, lengte);

        System.out.println("Hallo, " + user.getNaam() + "! Uw BMI is: " + user.berekenBMI());

        // Voeg hier de logica toe om de rest van het programma uit te voeren
        // bijvoorbeeld het toevoegen van trainingen, het instellen van doelen, enz.
        int keuze;
        do {
            System.out.println("\nKies een optie:");
            System.out.println("1. Stel doelen in voor WaterTracker, Stappenteller en VastenTracker");
            System.out.println("2. Voeg een training toe");
            System.out.println("3. Verwijder een training");
            System.out.println("4. Bekijk informatie over trainingen");
            System.out.println("5. Afsluiten");
            System.out.print("Uw keuze: ");
            keuze = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (keuze) {
                case 1:
                    // Stel doelen in voor WaterTracker, Stappenteller en VastenTracker
                    System.out.print("Stel een doel in voor de WaterTracker (in ml): ");
                    int waterDoel = scanner.nextInt();
                    user.startWaterTracker(waterDoel);

                    System.out.print("Stel een doel in voor de Stappenteller: ");
                    int stappenDoel = scanner.nextInt();
                    user.startStappenteller(stappenDoel);

                    System.out.print("Stel een doel in voor de VastenTracker (in uren): ");
                    int vastenDoel = scanner.nextInt();
                    user.startVastenTracker(vastenDoel);

                    System.out.println("Doelen ingesteld!");
                    break;
                case 2:
                    // Voeg een training toe
                    System.out.println("Kies het type training:");
                    System.out.println("1. CardioTraining");
                    System.out.println("2. KrachtTraining");
                    System.out.print("Uw keuze: ");
                    int trainingType = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    user.startTrainingsagenda();
                    if (trainingType == 1) {
                        // CardioTraining
                        System.out.print("Voer de naam van training in: ");
                        String naamCardio= scanner.nextLine();

                        System.out.print("Voer de duur van de training in (in minuten): ");
                        int duur = scanner.nextInt();
                        System.out.print("Voer het aantal intervallen in: ");
                        int aantalIntervallen = scanner.nextInt();
                        scanner.nextLine(); // consume newline character
                        System.out.print("Voer een beschrijving in voor de training: ");
                        String beschrijving = scanner.nextLine();
                        CardioTraining cardioTraining = new CardioTraining(naamCardio,duur, aantalIntervallen, new Date(), new Time(System.currentTimeMillis()), beschrijving);
                        user.trainingsagenda.voegTrainingToe(cardioTraining);
                        System.out.println("CardioTraining toegevoegd!");
                    } else if (trainingType == 2) {
// KrachtTraining
                        System.out.println("Voeg oefeningen toe:");
                        ArrayList<Oefening> oefeningen = new ArrayList<>();
                        String oefeningNaam;
                        do {
                            System.out.print("Voer de naam van de oefening in (of 'stop' om te stoppen): ");
                            oefeningNaam = scanner.nextLine();
                            if (!oefeningNaam.equalsIgnoreCase("stop")) {
                                System.out.print("Voer een beschrijving in voor de oefening: ");
                                String oefeningBeschrijving = scanner.nextLine();
                                oefeningen.add(new Oefening(oefeningNaam, oefeningBeschrijving));
                            }
                        } while (!oefeningNaam.equalsIgnoreCase("stop"));
                        System.out.print("Voer de rusttijd in (in seconden): ");
                        int rustTijd = scanner.nextInt();
                        System.out.print("Voer het aantal sets in: ");
                        int sets = scanner.nextInt();
                        System.out.print("Voer het aantal herhalingen in: ");
                        int herhalingen = scanner.nextInt();
                        scanner.nextLine(); // consume newline character
                        System.out.print("Voer een beschrijving in voor de training: ");
                        String beschrijving = scanner.nextLine();

                        System.out.print("Voer de naam van de krachttraining: ");
                        String naamKracht= scanner.nextLine();

                        KrachtTraining krachtTraining = new KrachtTraining(naamKracht,oefeningen, rustTijd, sets, herhalingen, new Date(), new Time(System.currentTimeMillis()), beschrijving);

                        user.trainingsagenda.voegTrainingToe(krachtTraining);
                        System.out.println("KrachtTraining toegevoegd!");
                    } else {
                        System.out.println("Ongeldige keuze.");
                    }
                    break;
                case 3:
                    // Verwijder een training
                    System.out.print("Voer de naam van de training in die u wilt verwijderen: ");
                    String trainingNaam = scanner.nextLine();
                    user.trainingsagenda.verwijderTraining(trainingNaam);
                    System.out.println("Training verwijderd!");
                    break;
                case 4:
                    // Bekijk informatie over trainingen
                    ArrayList<Training> trainingen = user.trainingsagenda.getTrainingen();
                    if (trainingen.isEmpty()) {
                        System.out.println("Er zijn geen trainingen om weer te geven.");
                    } else {
                        System.out.println("Informatie over trainingen:");
                        for (int i = 0; i < trainingen.size(); i++) {
                            System.out.println("Training " + (i + 1) + ": " + trainingen.get(i).getInformatie());
                        }
                    }
                    break;

                case 5:
                    // Afsluiten
                    System.out.println("Bedankt voor het gebruiken van de fitness tracker. Tot ziens!");
                    break;
                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
            }
        } while (keuze != 4);

        scanner.close();
    }
}
