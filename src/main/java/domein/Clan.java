package domein;

import java.util.ArrayList;
import java.util.List;

public class Clan {
    private static final int MAX_LEDEN = 6;

    private final String naam;
    private final List<Speler> spelers = new ArrayList<>();

    public Clan(String naam) {
        this.naam = naam;
    }

    // Voegt de speler toe als de clan niet vol is
    // EN er nog geen speler met dezelfde naam in de clan zit.
    // Retourneert true bij toevoegen, anders false.
    public boolean voegToe(Speler speler) {
        // TODO
        return false;
    }

    // Retourneert de speler met de gegeven naam, of null als die niet in de clan zit.
    // Tip: gebruik equals om Strings te vergelijken!
    public Speler zoek(String naam) {
        // TODO
        return null;
    }

    // Verwijdert de speler met de gegeven naam.
    // Retourneert true als de speler verwijderd werd, anders false.
    public boolean verlaat(String naam) {
        // TODO
        return false;
    }

    // Retourneert de som van de trofeeen van alle spelers.
    public int geefTotaalTrofeeen() {
        // TODO
        return 0;
    }

    // Retourneert de speler met de meeste trofeeen, of null voor een lege clan.
    public Speler geefTopSpeler() {
        // TODO
        return null;
    }

    // Retourneert een NIEUWE lijst met alle spelers met strikt meer dan het
    // opgegeven aantal trofeeen
    public List<Speler> geefSpelersMetMinstens(int trofeeen) {
        // TODO
        return new ArrayList<>();
    }

    public int geefAantalSpelers() {
        return spelers.size();
    }

    // Bouwt het overzicht van de clan, zie voorbeeld uitvoer:
    //   Clan Dragon Slayers (6 van 6 leden)
    //1. Thor - 4200 trofeeën (TH14)
    //2. Lena - 3100 trofeeën (TH12)
    //3. Mo - 5300 trofeeën (TH15)
    //4. Yaro - 2800 trofeeën (TH11)
    //5. Ayana - 3900 trofeeën (TH13)
    //6. Sem - 2000 trofeeën (TH10)
    @Override
    public String toString() {
        String tekst = "";
        tekst += this.naam + "(" + spelers.size() + " van " + MAX_LEDEN + "leden)\n";

        for(int i = 0; i<spelers.size(); i++){
            Speler speler = spelers.get(i);
            tekst += String.format("%d. %s - %d trofeeën (%s)\n", i, speler.getNaam(), speler.getTrofeeen(), speler.getTownhallNiveau());
        }
        return "";
    }
}
