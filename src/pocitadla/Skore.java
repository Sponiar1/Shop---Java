package pocitadla;

/**
 * Trieda Skore bude počítať naše skóre v hre
 *
 * @author Martin
 */
public class Skore {

    private int body;
    private int nasobic;

    /**
     * Konštruktor nastaví hodnotu atribútu body na 0 a hodnotu atribútu násobič
     * na 1
     */
    public Skore() {
        this.body = 0;
        this.nasobic = 1;
    }

    /**
     * Metóda iba vráti hodnotu atribútu body
     *
     * @return hodnota atribútu body
     */
    public int getBody() {
        return this.body;
    }

    /**
     * Metóda podľa parametra nastaví novú hodnotu atribútu nasobic
     *
     * @param nasobic je nová hodnota, ktorou nahradíme pôvodnú hodnotu atribútu
     * nasobic
     */
    public void setNasobic(int nasobic) {
        this.nasobic = nasobic;
    }

    /**
     * Metóda vypočíta novú hodnotu atribútu body tak, že k pôvodnej pripočíta
     * parameter vynásobený o atribút nasobic
     *
     * @param kolko
     */
    public void pripocitaj(int kolko) {
        this.body = this.body + (this.nasobic * kolko);
    }
}
