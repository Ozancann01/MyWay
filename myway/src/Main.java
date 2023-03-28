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

        System.out.println("Hallo, " + user.getNaam() );
        user.printBMICategorie();

        // Voeg hier de logica toe om de rest van het programma uit te voeren
        // bijvoorbeeld het toevoegen van trainingen, het instellen van doelen, enz.
        int keuze;
        do {
            System.out.println("\nKies een optie:");
            System.out.println("1. Stel doelen in voor WaterTracker, Stappenteller en VastenTracker");
            System.out.println("2. Update WaterTracker");
            System.out.println("3. Update Stappenteller");
            System.out.println("4. Start/Stop VastenTracker");
            System.out.println("5. Voeg een training toe");
            System.out.println("6. Verwijder een training");
            System.out.println("7. Bekijk informatie over trainingen");
            System.out.println("8. Bekijk informatie over trackers");
            System.out.println("9. Afsluiten");
            System.out.print("Uw keuze: ");
            keuze = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (keuze) {
                case 1:
                    // Start WaterTracker, Stappenteller of VastenTracker
                    System.out.println("Kies welke tracker u wilt starten:");
                    System.out.println("1. WaterTracker");
                    System.out.println("2. Stappenteller");
                    System.out.println("3. VastenTracker");
                    System.out.print("Uw keuze: ");
                    int trackerType = scanner.nextInt();
                    switch (trackerType) {
                        case 1:
                            // Start WaterTracker
                            System.out.print("Stel een doel in voor de WaterTracker (in ml): ");
                            int waterDoel = scanner.nextInt();
                            user.waterTracker.setDoelInname(waterDoel);
                            System.out.println("WaterTracker doel ingesteld!");
                            break;
                        case 2:
                            // Start Stappenteller
                            System.out.print("Stel een doel in voor de Stappenteller: ");
                            int stappenDoel = scanner.nextInt();
                            user.stappenteller.setDoelStappen(stappenDoel);
                            System.out.println("Stappenteller doel ingesteld!");
                            break;
                        case 3:
                            // Start VastenTracker
                            System.out.print("Stel een doel in voor de VastenTracker (in uren): ");
                            int vastenDoel = scanner.nextInt();
                            user.vastenTracker.setDoelUren(vastenDoel);
                            System.out.println("VastenTracker doel ingesteld!");
                            break;
                        default:
                            System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    }
                    break;

                case 2:
                    // Update WaterTracker
                    System.out.print("Voer de hoeveelheid water in die u heeft gedronken (in ml): ");
                    int waterInname = scanner.nextInt();
                    user.waterTracker.voegWaterToe(waterInname);
                    System.out.println("WaterTracker bijgewerkt!");

                    break;
                case 3:
                    // Update Stappenteller
                    System.out.print("Voer het aantal stappen in dat u heeft gezet: ");
                    int stappen = scanner.nextInt();
                    user.stappenteller.voegStappenToe(stappen);
                    System.out.println("Stappenteller bijgewerkt!");
                    break;
                case 4:
                    // Start/Stop VastenTracker
                    if (user.vastenTracker.isVasten()) {
                        user.vastenTracker.stopVasten();
                        System.out.println("Vasten gestopt!");
                    } else {
                        user.vastenTracker.startVasten();
                        System.out.println("Vasten gestart!");
                    }
                    break;
                case 5:
                    // Voeg een training toe
                    System.out.println("Kies het type training:");
                    System.out.println("1. CardioTraining");
                    System.out.println("2. KrachtTraining");
                    System.out.print("Uw keuze: ");
                    int trainingType = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
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
                case 6:
                    // Verwijder een training
                    System.out.print("Voer de naam van de training in die u wilt verwijderen: ");
                    String trainingNaam = scanner.nextLine();
                    user.trainingsagenda.verwijderTraining(trainingNaam);
                    System.out.println("Training verwijderd!");
                    break;
                case 7:
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

                case 8:

                    System.out.println("Kies resultaaten van  welke tracker u wilt zien:");
                    System.out.println("1. WaterTracker");
                    System.out.println("2. Stappenteller");
                    System.out.println("3. VastenTracker");
                    System.out.print("Uw keuze: ");
                    int trackerType1 = scanner.nextInt();
                    switch (trackerType1){
                        case 1:
                            user.waterTracker.isDoelBereikt();
                            break;
                        case 2:
                            user.stappenteller.isDoelBereikt();
                            break;
                        case 3:
                            user.vastenTracker.isDoelBereikt();
                        default:
                            System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    }

// Bekijk informatie over trainingen



                case 9:
                    // Afsluiten

                    break;
                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
            }
        } while (keuze != 9);

        scanner.close();
        System.out.println("Bedankt voor het gebruiken van de fitness tracker. Tot ziens!");
    }
}