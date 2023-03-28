package src.trainingSorten;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class KrachtTraining extends Training {

    private ArrayList<Oefening> oefeningen;
    private int rustTijd;
    private int sets;
    private int herhalingen;

    public KrachtTraining(String naam, ArrayList<Oefening> oefeningen, int rustTijd, int sets, int herhalingen, Date datum, Time tijd, String beschrijving) {
        super(naam, datum, tijd, beschrijving);
        this.oefeningen = oefeningen;
        this.rustTijd = rustTijd;
        this.sets = sets;
        this.herhalingen = herhalingen;
    }

    @Override
    public String getInformatie() {
        // Retourneer een samenvatting van de intervaltraining sessie (aangepast naar jouw wensen)
        return "Krachttraining sessie met " + oefeningen.size() + " oefeningen.En met rust tijd van "+ rustTijd;
    }
}
