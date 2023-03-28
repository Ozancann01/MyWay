package src.trainingSorten;

import java.sql.Time;
import java.util.Date;

public class CardioTraining extends Training {

    private int duur;
    private int aantalIntervallen;

    public CardioTraining(String naam, int duur, int aantalIntervallen, Date datum, Time tijd, String beschrijving) {
        super(naam, datum, tijd, beschrijving);
        this.duur = duur;
        this.aantalIntervallen = aantalIntervallen;
    }

    @Override
    public String getInformatie() {
        // Retourneer een samenvatting van de intervaltraining sessie (aangepast naar jouw wensen)
        return "Intervaltraining sessie met " + aantalIntervallen + " intervallen.En duur van " + duur;
    }
}
