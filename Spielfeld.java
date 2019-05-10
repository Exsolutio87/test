package game;

/**
 *
 * @author Exsolutio87
 */
public class Spielfeld {

    public char[][] spielFeldMatrix;
    boolean check = true;

    public Spielfeld() {
        init();
    }

    private void init() {

        spielFeldMatrix = new char[3][3];
        spielFeldMatrix[0][0] = '1';
        spielFeldMatrix[0][1] = '2';
        spielFeldMatrix[0][2] = '3';
        spielFeldMatrix[1][0] = '4';
        spielFeldMatrix[1][1] = '5';
        spielFeldMatrix[1][2] = '6';
        spielFeldMatrix[2][0] = '7';
        spielFeldMatrix[2][1] = '8';
        spielFeldMatrix[2][2] = '9';
    }

    public void draw() {
        System.out.println();
        System.out.println(spielFeldMatrix[0][0] + "|" + spielFeldMatrix[0][1] + "|" + spielFeldMatrix[0][2]);
        System.out.println(spielFeldMatrix[1][0] + "|" + spielFeldMatrix[1][1] + "|" + spielFeldMatrix[1][2]);
        System.out.println(spielFeldMatrix[2][0] + "|" + spielFeldMatrix[2][1] + "|" + spielFeldMatrix[2][2]);
        System.out.println();
    }

    public boolean set(Spieler s, int p) {
        p--;
        int row = p / 3;
        int col = p % 3;
        if (spielFeldMatrix[row][col] <= '9') {
            spielFeldMatrix[row][col] = s.getSign();
            return true;
        }
        return false;
    }

    public boolean check() {
        return checkRow(spielFeldMatrix[0])
                || checkRow(spielFeldMatrix[1])
                || checkRow(spielFeldMatrix[2])
                || checkRow(spielFeldMatrix[0][0], spielFeldMatrix[1][0], spielFeldMatrix[2][0])
                || checkRow(spielFeldMatrix[0][1], spielFeldMatrix[1][1], spielFeldMatrix[2][1])
                || checkRow(spielFeldMatrix[0][2], spielFeldMatrix[1][2], spielFeldMatrix[2][2])
                || checkRow(spielFeldMatrix[0][0], spielFeldMatrix[1][1], spielFeldMatrix[2][2])
                || checkRow(spielFeldMatrix[0][2], spielFeldMatrix[1][1], spielFeldMatrix[2][0]);

    }

    private boolean checkRow(char... row) { //var-arg (Variable Argumentliste)
        return (row[0] == row[1] && row[0] == row[2]);
    }
}
