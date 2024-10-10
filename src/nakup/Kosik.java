package nakup;

import java.util.ArrayList;
import polozky.Polozka;

/**
 * Trieda Kosik bude slúžiť ako úložný priestor pre potomkov triedy Polozka
 *
 * @author Martin
 */
public class Kosik {

    private int velkost;
    private ArrayList<Polozka> obsah;
    private int miesto;

    /**
     * Konštruktor na základe String parametru nostaví hodnotu atribútu velkost. Atribút miesto sa
     * nastaví na hodnotu atribútu velkost
     *
     * @param druh vybere z ponuky časť inicializácie triedy
     */
    public Kosik(String druh) {
        this.obsah = new ArrayList<Polozka>();
        switch (druh) {
            case "velky":
                this.velkost = 50;
                break;
            case "maly":
                this.velkost = 20;
                break;
            case "stredny":
                this.velkost = 35;
                break;
        }
        this.miesto = this.velkost;
    }

    /**
     * Metóda iba vráti hodnotu atribútu miesto
     *
     * @return atribút miesto
     */
    public int getMiesto() {
        return this.miesto;
    }

    /**
     * Metóda iba vráti hodnotu atribútu velkost
     *
     * @return atribút velkost
     */
    public int getVelkost() {
        return this.velkost;
    }

    /**
     * Metóda vloží parameter typu Polozka do ArrayListu za predpokladu že sa už Polozka nenachádza
     * v ArrayListe toľkokrát aký je jej maximálny počet a tiež za predpokladu že máme na ňu miesto
     * v košíku. Ak máme odpočítame zvyšné miesto
     *
     * @param polozka typu Polozka udáva, ktorý predmet chceme pridať do ArrayListu
     * @return vrátime, či sa parameter Polozka dá vložiť do ArrayListu
     */
    public boolean vlozDoKosika(Polozka polozka) {
        if (polozka == null) {
            return false;
        }
        int pocet = 0;
        for (Polozka p : this.obsah) {
            if (p.equals(polozka)) {
                pocet++;
            }
        }
        if (pocet == polozka.getPocet()) {
            return false;
        }
        if ((this.miesto - polozka.getVelkost()) >= 0) {
            this.miesto = this.miesto - polozka.getVelkost();
            return this.obsah.add(polozka);
        }
        return false;
    }

}
