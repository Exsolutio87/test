package game;

/**
 *
 * @author Florian Leistner
 */
public class Spielfeld {

    public char[][] spielFeldMatrix;

    public Spielfeld() {
        init();
    }

    private void init() {
        /**
         * Spielfeld wird aufgeteilt in 9 Felder von horizontal 0-2 (3) und
         * vertikal 0-2 (3). Eingabe erfolgt mit Hilfe von 1-9 über die Nummerneingabe.
         *
         * Beispiel:
         *
         * TIC TAC TOE 
         * [1][2][3] 
         * [4][O][6] 5 (Zweite Spalte, Zweites Feld)(double) 
         * [X][8][9] 7 (Erste Spalte, Drittes Feld)
         */

        //Array
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
   
    public void set(Spieler s, int p){
        
        
        p--; 
        int row = p/3;
        int col = p%3;
//        System.out.println("row=" + row + " col=" + col);
        spielFeldMatrix[row][col]=s.getSign();
    }
    
    

    
    
    
    
    
    
    
    
//    public void draw(){ 
//        System.out.println("TIC---TAC---TOE" );
//        System.out.println("[ 1 ][ 2 ][ 3 ]" );
//        System.out.println(" ---||---||--- " );
//        System.out.println("[ 4 ][ 5 ][ 6 ]" );               Wunschdesign
//        System.out.println(" ---||---||--- " );
//        System.out.println("[ 7 ][ 8 ][ 9 ]" );
//        System.out.println(" ---||---||--- " );
//    }
    
}




