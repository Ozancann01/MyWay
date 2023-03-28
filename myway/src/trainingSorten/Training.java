package src.trainingSorten;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Training {

    private Date datum;
    private Time tijd;
    private String beschrijving;
    private String naam; // Voeg het 'naam' veld toe

    public Training(String naam, Date datum, Time tijd, String beschrijving) {
        this.naam = naam;
        this.datum = datum;
        this.tijd = tijd;
        this.beschrijving = beschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public abstract String getInformatie();
}
