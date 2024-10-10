package polozky;

/**
 * Trieda Oblecenie je potomkom triedy Polozka a bude jedným s druhov tovaru
 * nachádzajúcich sa v obchode
 *
 * @author Martin
 */
public class Oblecenie extends Polozka {

    private String material;

    /**
     * Konštruktor vytvorí potomka triedy Polozka s parametrami:
     *
     * @param nazov bude nazov produktu
     * @param pocet bude počet dostupných kusov položky
     * @param velkost je veľkosť akú produkt zaberá
     * @param body je bodové ohodnotenie položky
     * @param material hovorí z akého materíalu je vyrobené oblečenie
     */
    public Oblecenie(String nazov, int pocet, int velkost, int body, String material) {
        super(nazov, pocet, velkost, body);
        this.material = material;
    }

    /**
     * Metóda doplní metódu toString predka o svoj vlastný atribút
     *
     * @return toString predka o doplnení atribút materiál
     */
    @Override
    public String toString() {
        return super.toString() + " mat.: " + this.material;
    }
}
