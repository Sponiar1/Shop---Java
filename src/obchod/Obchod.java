package obchod;

/**
 * Trieda Obchod bude sústava inštancií triedy Ulicka
 *
 * @author Martin
 */
public class Obchod {

    private Ulicka[][] rozlozenie;

    /**
     * Konštruktor vytvorí pole typu Ulicka a vyplní ho v rozmedzí aké sme definovali v triede
     * Ulicka
     *
     */
    public Obchod() {
        this.rozlozenie = new Ulicka[5][3];
        int r = 1;
        for (int i = 0; i < this.rozlozenie.length; i++) {
            for (int j = 0; j < this.rozlozenie[i].length; j++) {
                this.rozlozenie[i][j] = new Ulicka(r);
                r++;
            }
        }
    }

    /**
     * Metóda na základe parametrov vráti inštanciu typu Ulicka nechádzajúca sa v atribúte
     * rozlozenie
     *
     * @param bok je 1.súradnica poľa
     * @param smer je 2.súradnica poľa
     * @return Ulicka z poľa rozloženie
     */
    public Ulicka getUlicka(int bok, int smer) {
        if ((bok >= 0) && (bok < 5) && (smer >= 0) && (smer < 3)) {
            return this.rozlozenie[bok][smer];
        } else {
            return null;
        }
    }

}
