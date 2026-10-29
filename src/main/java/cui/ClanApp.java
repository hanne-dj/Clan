package cui;

import domein.Clan;
import domein.Speler;
import java.util.List;

public class ClanApp {

    void main() {
        new ClanApp().beheerClan();
    }

    private void beheerClan() {
        Clan clan = new Clan("Dragon Slayers");

        // STAP 1: probeer de spelers toe te voegen en toon telkens het resultaat
        voegToeEnMeld(clan, new Speler("Thor", 4200, 14));
        voegToeEnMeld(clan, new Speler("Lena", 3100, 12));
        voegToeEnMeld(clan, new Speler("Mo", 5300, 15));
        voegToeEnMeld(clan, new Speler("Yaro", 2800, 11));
        voegToeEnMeld(clan, new Speler("Ayana", 3900, 13));
        voegToeEnMeld(clan, new Speler("Mo", 1000, 5));
        voegToeEnMeld(clan, new Speler("Jin", 1500, 9));
        voegToeEnMeld(clan, new Speler("Sem", 2000, 10));

        // STAP 2: overzicht, totaal,  en topspeler
        toonOverzicht(clan);

        // STAP 3: toon de namen van alle spelers met meer dan 3500 trofeeen
        // TODO: roep geefSpelersMetMinstens(3500) aan en overloop het resultaat

        // STAP 4: Jin verlaat de clan, Bob (zit er niet in) probeert te vertrekken
        // TODO

        // STAP 5: Sem probeert opnieuw toe te treden, toon daarna opnieuw het overzicht
        // TODO
    }

    // Probeert de speler toe te voegen en toont of dit gelukt is
    private void voegToeEnMeld(Clan clan, Speler speler) {
        if (clan.voegToe(speler))
            IO.println(speler.getNaam() + " toegevoegd.");
        else
            IO.println(speler.getNaam() + " kon niet toegevoegd worden.");
    }

    // Toont het overzicht van de clan, het totaal aantal trofeeen
    // en het gemiddelde aantal trofeeen per speler
    private void toonOverzicht(Clan clan) {
        IO.println();
        IO.println(clan);

        // TODO: toon het totaal aantal trofeeen

        // TODO: toon de topspeler (let op: kan null zijn)


    }
}
