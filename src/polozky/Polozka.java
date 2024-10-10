package polozky;

/**
 * Trieda Polozka slúži ako predok tried, ktoré budú tovarom v našom obchode
 *
 * @author Martin
 */
public class Polozka {

    private int pocet;
    private String nazov;
    private int velkost;
    private int body;

    /**
     * Konštruktor vytvorí produkt s nasledujúcimi parametrami
     *
     * @param nazov bude nazov produktu
     * @param pocet bude počet dostupných kusov položky
     * @param velkost je veľkosť akú produkt zaberá
     * @param body je bodové ohodnotenie položky
     */
    public Polozka(String nazov, int pocet, int velkost, int body) {
        this.nazov = nazov;
        this.pocet = pocet;
        this.velkost = velkost;
        this.body = body;
    }

    /**
     *
     * @return vráti hodnotu atribútu pocet
     */
    public int getPocet() {
        return this.pocet;
    }

    /**
     * Slúži ako základ pre potomkov
     *
     * @return vráti reťazec toString, teraz len atribút nazov
     */
    public String toString() {
        return this.nazov;
    }

    /**
     *
     * @return vráti hodnotu atribútu velkost
     */
    public int getVelkost() {
        return this.velkost;
    }

    /**
     *
     * @return vráti hodnotu atribútu body
     */
    public int getBody() {
        return this.body;
    }

}
