package pocitadla;

/**
 * Trieda Tahy bude počítať naše zostávajúce ťahy v hre
 *
 * @author Martin
 */
public class Tahy {

    private int tahy;
    private int pociatok;

    /**
     * Konštruktor na základe parametru typu String určí hodnoty atribútov tahy
     * a pociatok
     *
     * @param kosik
     */
    public Tahy(String kosik) {
        switch (kosik) {
            case "velky":
                this.tahy = 25;
                this.pociatok = 25;
                break;
            case "maly":
                this.tahy = 70;
                this.pociatok = 70;
                break;
            case "stredny":
                this.tahy = 45;
                this.pociatok = 45;
                break;
        }
    }

    /**
     * Metóda iba vráti hodnotu atribútu tahy
     *
     * @return hodnota atribútu tahy
     */
    public int getTahy() {
        return this.tahy;
    }

    /**
     * Metóda zmensí hodnotu atribútu tahy o 1 a vráti jeho hodnotu
     *
     * @return hodnota atribútu tahy
     */
    public int posun() {
        this.tahy--;
        return this.tahy;
    }

    /**
     * Metóda iba vráti hodnotu atribútu pociatok
     *
     * @return hodnota atribútu pociatok
     */
    public int getPociatok() {
        return this.pociatok;
    }

}
