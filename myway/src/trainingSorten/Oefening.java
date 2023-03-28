package src.trainingSorten;

public class Oefening {

    private String naam;
    private String beschrijving;

    public Oefening(String naam, String beschrijving) {
        this.naam = naam;
        this.beschrijving = beschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }


}
