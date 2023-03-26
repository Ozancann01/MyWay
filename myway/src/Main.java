package src;

public class Main {
    public static void main(String[] args) {
        Stappenteller stappenteller = new Stappenteller("Jan", 30, 75, 180, 10000);
        stappenteller.registreerStappen(4500);
        System.out.println(stappenteller.getStatus());

        Trainingsagenda trainingsagenda = new Trainingsagenda("Piet", 28, 80, 175);
        trainingsagenda.voegTrainingToe("Hardlopen");
        trainingsagenda.voegTrainingToe("Krachttraining");
        System.out.println(trainingsagenda.getStatus());

        WaterTracker waterTracker = new WaterTracker("Kees", 35, 90, 185, 2.5);
        waterTracker.registreerWater(1.2);
        System.out.println(waterTracker.getStatus());

        VastenTracker vastenTracker = new VastenTracker("Sara", 25, 65, 170);
        vastenTracker.startVasten();
        System.out.println(vastenTracker.getStatus());
        vastenTracker.stopVasten();
        System.out.println(vastenTracker.getStatus());
    }

}