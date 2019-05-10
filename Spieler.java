package game;

/**
 *
 * @author Exsolutio87
 */
public class Spieler {

    public final String name;
    public final char sign;

    public Spieler(String name, char sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public char getSign() {
        return sign;
    }

}
