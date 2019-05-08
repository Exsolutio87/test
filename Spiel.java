package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Florian Leistner
 */
public class Spiel {

    public static void main(String[] args) {

        Spielfeld spielfeld = new Spielfeld();

        Spieler aktuellerSpieler;
        Spieler spielerX = new SpielerX("Spieler 1,");
        Spieler spielerO = new SpielerO("Spieler 2,");
        aktuellerSpieler = spielerX;

        int feldwahl;

        for (int i = 0; i < 18; i++) {
            spielfeld.draw();
            System.out.println(aktuellerSpieler.getName() + " machen Sie ihre Eingabe: ");
            feldwahl = readInt();

            while (!spielfeld.set(aktuellerSpieler, feldwahl)) {
                System.out.println(aktuellerSpieler.getName() + " erneut eingeben: ");
                feldwahl = readInt();
            }
//                return feldwahl;

            if (feldwahl <= 9) {
                System.out.println("Danke für die Eingabe.");

                if (!spielfeld.set(aktuellerSpieler, feldwahl)) {
                    System.out.println("Feld belegt.");
                }

            } else {
                System.out.println("Feld nicht verfügbar.");
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
