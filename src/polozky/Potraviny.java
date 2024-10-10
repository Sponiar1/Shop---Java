package polozky;

/**
 * Trieda Potraviny je potomkom triedy Polozka a bude jedným s druhov tovaru
 * nachádzajúcich sa v obchode
 *
 * @author Martin
 */
public class Potraviny extends Polozka {

    private int trvanlivost;

    /**
     * Konštruktor vytvorí potomka triedy Polozka s parametrami:
     *
     * @param nazov bude nazov produktu
     * @param pocet bude počet dostupných kusov položky
     * @param velkost je veľkosť akú produkt zaberá
     * @param body je bodové ohodnotenie položky
     * @param trvanlivost hovorí akú trvanlivosť má daný produkt
     */
    public Potraviny(String nazov, int pocet, int velkost, int body, int trvanlivost) {
        super(nazov, pocet, velkost, body);
        this.trvanlivost = trvanlivost;
    }

    /**
     * Metóda doplní metódu toString predka o svoj vlastný atribút
     *
     * @return toString predka o doplnení atribút druh a jeho popis
     */
    @Override
    public String toString() {
        return super.toString() + " trvan.-" + this.trvanlivost + " dni";
    }
}
