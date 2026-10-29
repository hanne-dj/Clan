package domein;

// een speler van Clash of Clans
public class Speler {
    private final String naam;
    private int trofeeen;
    private final int townhallNiveau;

    public Speler(String naam, int trofeeen, int townhallNiveau) {
        this.naam = naam;
        this.trofeeen = trofeeen;
        this.townhallNiveau = townhallNiveau;
    }

    public String getNaam() {
        return naam;
    }

    public int getTrofeeen() {
        return trofeeen;
    }

    public int getTownhallNiveau() {
        return townhallNiveau;
    }

    public void voegTrofeeenToe(int extraTrofeeen) {
        trofeeen += extraTrofeeen;
    }
}
