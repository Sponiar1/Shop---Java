package polozky;

/**
 * Trieda Zabava je potomkom triedy Polozka a bude jedným s druhov tovaru
 * nachádzajúcich sa v obchode
 *
 * @author Martin
 */
public class Zabava extends Polozka {

    private String druh;

    /**
     * Konštruktor vytvorí potomka triedy Polozka s parametrami:
     *
     * @param nazov bude nazov produktu
     * @param pocet bude počet dostupných kusov položky
     * @param velkost je veľkosť akú produkt zaberá
     * @param body je bodové ohodnotenie položky
     * @param druh hovorí o aký druh zábavného produktu sa jedná
     */
    public Zabava(String nazov, int pocet, int velkost, int body, String druh) {
        super(nazov, pocet, velkost, body);
        this.druh = druh;
    }

    /**
     * Metóda doplní metódu toString predka o svoj vlastný atribút
     *
     * @return toString predka o doplnení atribút druh
     */
    @Override
    public String toString() {
        return super.toString() + "-" + this.druh;
    }
}
