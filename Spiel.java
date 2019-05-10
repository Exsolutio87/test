package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Exsolutio87
 */
public class Spiel {

    public static void main(String[] args) {

        Spielfeld spielfeld = new Spielfeld();

        Spieler aktuellerSpieler;
        Spieler spielerX = new SpielerX("Spieler 1,");
        Spieler spielerO = new SpielerO("Spieler 2,");
        aktuellerSpieler = spielerX;

        int feldwahl;

        for (int i = 0; i < 9; i++) {
            spielfeld.draw();
            System.out.println(aktuellerSpieler.getName() + " machen Sie ihre Eingabe: ");
            feldwahl = readInt();

            if (feldwahl <= 9) {
                System.out.println("Danke für die Eingabe.");

                if (!spielfeld.set(aktuellerSpieler, feldwahl)) {
                    System.out.println("Feld belegt, bitte erneut eingeben.");
                    i--;
                    continue;
                }

            } else {
                System.out.println("Feld nicht verfügbar, bitte erneut eingeben");
                i--;
                continue;
            }

            if (spielfeld.check() == true) {
                System.out.println("Gewinner ermittelt!");
                System.out.println(aktuellerSpieler.getName() + ("Herzlichen Glückwunsch"));
                break;
            }

            if (aktuellerSpieler == spielerX) {
                aktuellerSpieler = spielerO;
            } else {
                aktuellerSpieler = spielerX;
            }

        }
    }

    public static String readString() {
        return readString("");
    }

    public static String readString(String prompt) {
        System.out.print(prompt.length() == 0 ? "" : prompt + ": ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException ex) {
            return "";
        }
    }

    public static int readInt() {
        return readInt("");
    }

    public static int readInt(String prompt) {
        try {
            return Integer.parseInt(readString(prompt));
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}
