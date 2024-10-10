package obchod;

import java.util.ArrayList;
import polozky.Drogeria;
import polozky.Oblecenie;
import polozky.Polozka;
import polozky.Potraviny;
import polozky.Zabava;

/**
 * Trieda Ulicka bude simulovať uličku v obchode a bude ponúkať produkty nachádzajúce sa v nej
 *
 * @author Martin
 */
public class Ulicka {

    private int cislo;
    private String popis;
    private ArrayList<Polozka> tovar;
    private Polozka vec;

    /**
     * Konštruktor na základe parametru cislo vytvorí produkty typu potomkov triedy Polozka, ktoré
     * potom popíše v atribúte popis a pridá ich do ArrayListu, ktorý bude simulovať ponuku uličky,
     * v prípade posledného čísla nevytvorí žiadne produkty ale iba nastaví hodnotu atribútu popis
     * na "pokladne". Parameter cislo je tiež hodnota atribútu cislo.
     *
     * @param cislo je číslo uličky podľa, ktorého sa určí čo sa bude v Uličke nachádzať
     */
    public Ulicka(int cislo) {
        this.tovar = new ArrayList<Polozka>();
        this.cislo = cislo;
        switch (cislo) {
            case 1:
                this.popis = "Pecivo";
                this.vec = new Potraviny("Chleba", 1, 2, 10, 3);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Rozok", 30, 1, 4, 2);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Sisky", 4, 3, 15, 1);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Bagety", 2, 3, 20, 10);
                this.tovar.add(this.vec);
                break;
            case 2:
                this.popis = "Odevy";
                this.vec = new Oblecenie("Tricko BabkaJama", 1, 2, 30, "Bavlna");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Tricko ALLigator", 1, 2, 30, "Polyester");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Teplaky", 4, 3, 25, "Bavlna");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Leginy", 2, 3, 20, "Latka");
                this.tovar.add(this.vec);
                break;
            case 3:
                this.popis = "Obuv a bundy";
                this.vec = new Oblecenie("Botasky ALLigator", 1, 2, 30, "Latka");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Sandale", 10, 2, 15, "Textil");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Slapky", 2, 2, 15, "Plast");
                this.tovar.add(this.vec);
                this.vec = new Oblecenie("Mikina", 2, 3, 25, "Bavlna");
                this.tovar.add(this.vec);
                break;
            case 4:
                this.popis = "Alkohol";
                this.vec = new Potraviny("Pivo", 1, 2, 35, 356);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Borovicka", 1, 2, 40, 512);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Vino", 4, 3, 50, 666);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Liker", 2, 3, 25, 600);
                this.tovar.add(this.vec);
                break;
            case 5:
                this.popis = "Ochutene vody";
                this.vec = new Potraviny("Oranzada", 2, 2, 15, 95);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("SuperCola", 2, 3, 25, 62);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Hrozinkova", 2, 1, 20, 55);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("MiniCola", 5, 1, 5, 60);
                this.tovar.add(this.vec);
                break;
            case 6:
                this.popis = "Noviny";
                this.vec = new Zabava("DennikZ", 10, 2, 20, "Noviny");
                this.tovar.add(this.vec);
                this.vec = new Zabava("DoKrizovky", 5, 1, 15, "Krizovky");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Ako sa stať milionárom", 3, 3, 20, "Kniha");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Pero", 20, 1, 5, "Pero");
                this.tovar.add(this.vec);
                break;
            case 7:
                this.popis = "Sladke pochutiny";
                this.vec = new Potraviny("Bomboniera", 5, 4, 35, 45);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Ovocna tycinka", 10, 1, 10, 23);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Cipsy", 3, 3, 5, 46);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Cukriky", 4, 2, 15, 88);
                this.tovar.add(this.vec);
                break;
            case 8:
                this.popis = "Kava, Caj";
                this.vec = new Potraviny("Kava Praza", 10, 2, 20, 56);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Venzuelske kakao", 5, 2, 35, 48);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Kava Boba", 15, 3, 10, 61);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Caj", 20, 2, 10, 100);
                this.tovar.add(this.vec);
                break;
            case 9:
                this.popis = "Hry a hracky";
                this.vec = new Zabava("Sedmove karty", 10, 1, 25, "Hra");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Duopoly", 3, 7, 50, "Hra");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Stavebnica Rexo", 4, 5, 45, "Hra");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Clovece", 2, 4, 55, "Hra");
                this.tovar.add(this.vec);
                break;
            case 10:
                this.popis = "Mineralky";
                this.vec = new Potraviny("Dojcenska voda", 10, 2, 5, 130);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Mineralna voda Bazuk", 5, 1, 10, 740);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Mala mineralka", 3, 3, 5, 555);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Mineralna voda Lok", 20, 1, 1, 740);
                this.tovar.add(this.vec);
                break;
            case 11:
                this.popis = "Balene potraviny";
                this.vec = new Potraviny("Fazula", 8, 2, 25, 260);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Paradajky", 5, 2, 35, 285);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Ryza", 12, 2, 20, 156);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Polohruba Muka", 1, 1, 80, 201);
                this.tovar.add(this.vec);
                break;
            case 12:
                this.popis = "Hygiena";
                this.vec = new Zabava("Antibakterialne mydlo", 1, 1, 100, "Mydlo");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Zubex", 10, 1, 30, "Zubna pasta");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Soaper", 5, 1, 45, "Mydlo");
                this.tovar.add(this.vec);
                this.vec = new Zabava("Kartacos", 12, 2, 20, "Kefka");
                this.tovar.add(this.vec);
                break;
            case 13:
                this.popis = "Hygiena 2";
                this.vec = new Drogeria("Leg and Knee", 7, 2, 30, "Sampon");
                this.tovar.add(this.vec);
                this.vec = new Drogeria("NesmrdLes", 21, 1, 10, "Deodorant");
                this.tovar.add(this.vec);
                this.vec = new Drogeria("Papierky", 3, 3, 50, "Vreckovky");
                this.tovar.add(this.vec);
                this.vec = new Drogeria("Gelox", 20, 1, 35, "Prach na pranie");
                this.tovar.add(this.vec);
                break;
            case 14:
                this.popis = "Ovocie a zelenina";
                this.vec = new Potraviny("Zemiaky", 30, 10, 35, 20);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Jablka", 5, 6, 30, 12);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Paprika", 4, 3, 40, 9);
                this.tovar.add(this.vec);
                this.vec = new Potraviny("Mrkva", 5, 3, 35, 11);
                this.tovar.add(this.vec);
                break;
            case 15:
                this.popis = "Pokladne";
                break;
        }
    }

    /**
     * Metóda iba vráti hodnotu atribútu cislo
     *
     * @return atribút cislo
     */
    public int getCislo() {
        return this.cislo;
    }

    /**
     * Metóda iba vráti hodnotu atribútu cislo
     *
     * @return atribút popis
     */
    public String getPopis() {
        return this.popis;
    }

    /**
     * Metóda vráti položku z Arraylistu s takým indexom ako je parameter
     *
     * @param cislo poradie položky v ArrayListe
     * @return inštanciu potomka triedy Polozka
     */
    public Polozka getVec(int cislo) {
        return this.tovar.get(cislo);
    }
}
