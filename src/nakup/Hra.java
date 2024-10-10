package nakup;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import obchod.Obchod;
import obchod.Ulicka;
import pocitadla.Skore;
import pocitadla.Tahy;
import pocitadla.Zapisovac;

/**
 * Trieda Hra slúži na riadenie hry a jej grafické spracovanie
 *
 * @author Martin
 */
public class Hra {

    private JFrame okno;
    private JPanel nazovP;
    private JLabel nazov;
    private JButton tlac1;
    private JButton tlac2;
    private JButton tlac3;
    private JButton tlac4;
    private JButton tlac5;
    private JLabel tlac1text;
    private JLabel tlac2text;
    private JLabel tlac3text;
    private JLabel tlac4text;
    private JLabel tlac5text;
    private Skore skore;
    private Tahy tahy;
    private Kosik inventar;
    private int postup;
    private Obchod obchod;
    private int rovnobezka;
    private int poludnik;
    private ImageIcon obr;
    private JLabel obrP;
    private JLabel obrP2;
    private JLabel obrP3;
    private JPanel cisloP;
    private JLabel cislo;
    private JPanel zoznamP;
    private JTextPane zoznam;
    private String zoznamS;
    private JLabel pocetTahov;
    private JPanel pocetTahovP;
    private JLabel body;
    private JPanel bodyP;
    private Zapisovac subor;

    /**
     * Konštruktor vytvorí hlavné menu hry, inicializuje triedy, priradí akciu tlačidlám a hodnota
     * atribútu postup sa nastaví na 0
     *
     * @throws IOException
     */
    public Hra() throws IOException {
        this.zoznamS = "Kosik obsahuje: " + "\n";
        this.okno = new JFrame();
        this.okno.setSize(1200, 700);
        this.okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.okno.setLayout(null);
        this.okno.setVisible(true);
        this.okno.getContentPane().setBackground(Color.black);
        this.okno.setTitle("Nakup");

        this.nazov = new JLabel("Vyber kosik");
        this.nazov.setFont(new Font("Courier New", Font.BOLD, 50));
        this.nazov.setVisible(true);

        this.nazovP = new JPanel();
        this.nazovP.setBounds(350, 55, 500, 55);
        this.nazovP.setVisible(true);
        this.nazovP.setBackground(Color.YELLOW);
        this.nazovP.add(this.nazov);
        this.okno.add(this.nazovP);

        this.cislo = new JLabel(" ");
        this.cislo.setFont(new Font("Courier New", Font.BOLD, 40));
        this.cislo.setVisible(true);
        this.cisloP = new JPanel();
        this.cisloP.setBounds(100, 55, 100, 55);
        this.cisloP.setVisible(false);
        this.cisloP.add(this.cislo);
        this.cisloP.setBackground(Color.RED);
        this.okno.add(this.cisloP);

        this.tlac1 = new JButton();
        this.tlac2 = new JButton();
        this.tlac3 = new JButton();
        this.tlac4 = new JButton();
        this.tlac5 = new JButton();
        this.tlac1text = new JLabel();
        this.tlac2text = new JLabel();
        this.tlac3text = new JLabel();
        this.tlac4text = new JLabel();
        this.tlac5text = new JLabel();
        this.tlac1text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        this.tlac2text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        this.tlac3text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        this.tlac4text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        this.tlac5text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        this.tlac1text.setText("Maly kosik");
        this.tlac2text.setText("Stredny kosik");
        this.tlac3text.setText("Velky kosik");
        this.tlac1.add(this.tlac1text);
        this.tlac2.add(this.tlac2text);
        this.tlac3.add(this.tlac3text);
        this.tlac4.add(this.tlac4text);
        this.tlac5.add(this.tlac5text);
        this.tlac1.setBounds(100, 420, 250, 50);
        this.tlac1.setBackground(Color.WHITE);
        this.tlac2.setBounds(475, 420, 250, 50);
        this.tlac2.setBackground(Color.WHITE);
        this.tlac3.setBounds(850, 420, 250, 50);
        this.tlac3.setBackground(Color.WHITE);
        this.tlac4.setBounds(0, 420, 250, 50);
        this.tlac4.setBackground(Color.WHITE);
        this.tlac4.setBounds(0, 420, 250, 50);
        this.tlac4.setBackground(Color.WHITE);
        this.tlac5.setBounds(0, 420, 250, 50);
        this.tlac5.setBackground(Color.WHITE);

        this.tlac4.setVisible(false);
        this.tlac5.setVisible(false);

        this.okno.add(this.tlac1);
        this.okno.add(this.tlac2);
        this.okno.add(this.tlac3);
        this.okno.add(this.tlac4);
        this.okno.add(this.tlac5);

        Event e = new Event();
        this.tlac1.addActionListener(e);

        Event2 ev = new Event2();
        this.tlac2.addActionListener(ev);

        Event3 eve = new Event3();
        this.tlac3.addActionListener(eve);

        Event4 even = new Event4();
        this.tlac4.addActionListener(even);

        Event5 event = new Event5();
        this.tlac5.addActionListener(event);

        this.obr = new ImageIcon("MalyKosik.jpg");
        this.obrP = new JLabel(this.obr);
        this.obrP.setBounds(100, 250, 250, 200);
        this.okno.add(this.obrP);
        this.obrP.setVisible(true);

        this.obr = new ImageIcon("StrednyKosik.jpg");
        this.obrP2 = new JLabel(this.obr);
        this.obrP2.setBounds(475, 250, 250, 200);
        this.okno.add(this.obrP2);
        this.obrP2.setVisible(true);

        this.obr = new ImageIcon("VelkyKosik.jpg");
        this.obrP3 = new JLabel(this.obr);
        this.obrP3.setBounds(850, 250, 250, 200);
        this.okno.add(this.obrP3);
        this.obrP3.setVisible(true);

        this.obchod = new Obchod();
        this.postup = 0;

        this.skore = new Skore();

        this.rovnobezka = 0;
        this.poludnik = 0;
    }

    /**
     * Metóda odpočíta hodnotu jedna od atribútu rovnobezka
     *
     * @return nová hodnota atribútu rovnobezka
     */
    public int chodVlavo() {
        this.rovnobezka--;
        return this.rovnobezka;
    }

    /**
     * Metóda pripočíta hodnotu jedna od atribútu poludnik
     *
     * @return nová hodnota atribútu poludnik
     */
    public int chodDopredu() {
        this.poludnik++;
        return this.poludnik;
    }

    /**
     * Metóda pripočíta hodnotu jedna od atribútu rovnobezka
     *
     * @return nová hodnota atribútu rovnobezka
     */
    public int chodVpravo() {
        this.rovnobezka++;
        return this.rovnobezka;
    }

    /**
     * Metóda odpočíta hodnotu jedna od atribútu poludnik
     *
     * @return nová hodnota atribútu poludnik
     */
    public int chodVzad() {
        this.poludnik--;
        return this.poludnik;
    }

    /**
     * Metóda pridá hodnotu String parametra nakoniec atribútu zoznamS a nastaví sa na nový riadok
     *
     * @param popis String, ktorý sa pridá nakoniec atribútu zoznamS
     * @return novú hodnotu parametra zoznamS
     */
    public String pridajPopis(String popis) {
        this.zoznamS = this.zoznamS + popis + "\n";
        return this.zoznamS;
    }

    /**
     * Metóda vráti inštanciu typu Ulicka na základe parametrov
     *
     * @param rovnobezka 1.súradnica poľa
     * @param poludnik 2.súradnica poľa
     * @return príslušná Ulicka na základe parametrov
     */
    public Ulicka dajUlicku(int rovnobezka, int poludnik) {
        return this.obchod.getUlicka(rovnobezka, poludnik);
    }

    /**
     * Metóda vytvorí začiatok hry a nastaví hodnotu atribútu postup na 1
     *
     */
    public void nastavZaciatok() {
        this.tlac1.setBounds(475, 490, 250, 50);
        this.tlac1text.setText("Chod dopredu");

        this.tlac2.setBounds(225, 540, 250, 50);
        this.tlac2text.setText("Chod vlavo");

        this.tlac3.setBounds(725, 540, 250, 50);
        this.tlac3text.setText("Chod vpravo");

        this.tlac4.setBounds(475, 590, 250, 50);
        this.tlac4text.setText("Chod dozadu");

        this.tlac5.setBounds(0, 600, 225, 50);
        this.tlac5text.setText("Prepnut do nakupu/pohybu");
        this.tlac4.setVisible(true);
        this.tlac5.setVisible(true);

        this.nazovP.setBounds(300, 100, 600, 50);
        this.cisloP.setBounds(575, 50, 50, 50);
        this.cisloP.setVisible(true);
        this.setObchod();

        this.postup = 1;

        this.zoznam = new JTextPane();
        this.zoznam.setFont(new Font("Courier New", Font.PLAIN, 12));
        this.zoznam.setVisible(true);

        this.zoznamP = new JPanel();
        this.zoznamP.setBounds(0, 0, 225, 600);
        this.zoznamP.setVisible(true);
        this.zoznamP.setBackground(Color.WHITE);
        this.zoznamP.add(this.zoznam);
        this.okno.add(this.zoznamP);

        this.body = new JLabel();
        this.body.setFont(new Font("Courier New", Font.ITALIC, 18));
        this.body.setVisible(true);
        this.body.setText("Body: " + this.skore.getBody());
        this.body.setForeground(Color.WHITE);

        this.bodyP = new JPanel();
        this.bodyP.setBounds(950, 400, 225, 25);
        this.bodyP.setVisible(true);
        this.bodyP.setBackground(Color.BLACK);
        this.bodyP.add(this.body);
        this.okno.add(this.bodyP);

        this.obrP.setVisible(false);
        this.obrP2.setVisible(false);
        this.obrP3.setVisible(false);
        switch (this.inventar.getMiesto()) {
            case 50:
                this.obr = new ImageIcon("VelkyKosik.jpg");
                this.obrP = new JLabel(this.obr);
                this.obrP.setBounds(975, 475, 225, 200);
                this.okno.add(this.obrP);
                this.obrP.setVisible(true);
                break;
            case 35:
                this.obr = new ImageIcon("StrednyKosik.jpg");
                this.obrP = new JLabel(this.obr);
                this.obrP.setBounds(975, 475, 225, 200);
                this.okno.add(this.obrP);
                this.obrP.setVisible(true);
                break;
            case 20:
                this.obr = new ImageIcon("MalyKosik.jpg");
                this.obrP = new JLabel(this.obr);
                this.obrP.setBounds(975, 475, 225, 200);
                this.okno.add(this.obrP);
                this.obrP.setVisible(true);
                break;
        }

        this.pocetTahov = new JLabel();
        this.pocetTahov.setFont(new Font("Courier New", Font.ITALIC, 18));
        this.pocetTahov.setVisible(true);
        this.pocetTahov.setText("Zostavajuce tahy: " + this.tahy.getTahy());
        this.pocetTahov.setForeground(Color.white);
        this.pocetTahovP = new JPanel();
        this.pocetTahovP.setBounds(950, 425, 225, 25);
        this.pocetTahovP.setVisible(true);
        this.pocetTahovP.setBackground(Color.BLACK);
        this.pocetTahovP.add(this.pocetTahov);
        this.okno.add(this.pocetTahovP);

    }

    /**
     * Metóda nastaví hodnotu atribútu zoznam a cislo, na základe atribútov rovnobezka a poludnik
     *
     */
    public void setObchod() {
        this.nazov.setText(this.dajUlicku(this.rovnobezka, this.poludnik).getPopis());
        this.cislo.setText(String.valueOf(this.dajUlicku(this.rovnobezka, this.poludnik).getCislo()));
    }

    /**
     * Metóda vykoná ťah hry a nastaví počet zostávajúcich ťahov a bodov
     *
     */
    public void pohyb() {
        this.tahy.posun();
        this.pocetTahov.setText("Zostavajuce tahy: " + this.tahy.getTahy());
        if (this.tahy.getTahy() < this.tahy.getPociatok() / 2) {
            this.skore.setNasobic(2);
        }
        if (this.tahy.getTahy() < this.tahy.getPociatok() / 4) {
            this.skore.setNasobic(3);
        }
        this.body.setText("Body: " + this.skore.getBody());
    }

    /**
     * Metóda zmení obrázok poďľa ostávajúceho miesta v košíku
     *
     */
    public void zmenObrazok() {
        if (this.inventar.getMiesto() <= this.inventar.getVelkost() / 2) {
            switch (this.inventar.getVelkost()) {
                case 20:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("MalyNaplnenyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
                case 35:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("StrednyNaplnenyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
                case 50:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("VelkyNaplnenyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
            }
        }

        if (this.inventar.getMiesto() == 0) {
            switch (this.inventar.getVelkost()) {
                case 20:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("MalyPlnyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
                case 35:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("StrednyPlnyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
                case 50:
                    this.obrP.setVisible(false);
                    this.obr = new ImageIcon("VelkyPlnyKosik.jpg");
                    this.obrP = new JLabel(this.obr);
                    this.obrP.setBounds(975, 475, 225, 200);
                    this.okno.add(this.obrP);
                    this.obrP.setVisible(true);
                    break;
            }
        }
    }

    /**
     * Metóda nastaví hodnoty grafických atribútov na konci hry
     *
     */
    public void koniec() {
        this.postup = 3;
        this.cisloP.setVisible(false);
        this.tlac2.setVisible(false);
        this.tlac3.setVisible(false);
        this.tlac4.setVisible(false);
        this.tlac5.setVisible(false);
        this.obrP.setVisible(false);
        this.pocetTahovP.setVisible(false);
        this.nazov.setFont(new Font("Courier New", Font.BOLD, 40));
        this.nazovP.setBounds(250, 100, 700, 50);
        this.nazov.setText("Gratulujem, dokoncil/a si hru");
        this.bodyP.setBounds(250, 150, 700, 50);
        this.body.setText("Získal/a si " + this.skore.getBody() + " bodov");
        this.body.setFont(new Font("Courier New", Font.ITALIC, 50));
        this.tlac1text.setText("Zapisat skore?");

        if (this.tahy.getTahy() == 0) {
            this.nazov.setText("Prehral/a si");
            this.body.setFont(new Font("Courier New", Font.ITALIC, 20));
            this.body.setText("Nestihol/a si zaplatit do uzavierky a vyhodili ta");
            this.tlac1.setVisible(false);
        }
    }

    /**
     * Subclassa na základe atribútu postup vykoná príslušné akcie
     *
     */
    public class Event implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            switch (Hra.this.postup) {
                case 0:
                    Hra.this.inventar = new Kosik("maly");
                    Hra.this.tahy = new Tahy("maly");
                    Hra.this.nastavZaciatok();
                    break;
                case 1:
                    if (Hra.this.chodDopredu() < 3) {
                        Hra.this.setObchod();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.chodVzad();
                    }
                    if ((Hra.this.rovnobezka == 4) && (Hra.this.poludnik == 2)) {
                        Hra.this.tlac5text.setText("Zaplatit nakup");
                    } else {
                        Hra.this.tlac5text.setText("Prepnut do nakupu/pohybu");
                    }
                    break;
                case 2:
                    if (Hra.this.inventar.vlozDoKosika(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(0))) {
                        Hra.this.pridajPopis(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(0).toString());
                        Hra.this.zoznam.setText(Hra.this.zoznamS);
                        Hra.this.skore.pripocitaj(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(0).getBody());
                        Hra.this.zmenObrazok();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.tlac1text.setText("Vypredane");
                    }
                    if (Hra.this.inventar.getMiesto() < Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(0).getVelkost()) {
                        Hra.this.tlac1text.setText("Nezmesti sa do kosika");
                    }
                    break;
                case 3:
                    Hra.this.zoznam.setText("");
                    Hra.this.tlac1.setVisible(false);
                    Hra.this.bodyP.setVisible(false);
                    Hra.this.zoznam.setFont(new Font("Courier New", Font.PLAIN, 20));
                    Hra.this.zoznamP.setBounds(500, 175, 200, 425);
                    String meno = JOptionPane.showInputDialog(null, "Zadaj meno (max 7 znakov):");
                    while (meno.length() > 7) {
                        meno = JOptionPane.showInputDialog(null, "Prilis dlhe meno, skus znova:");
                    }
                    try {
                        Hra.this.subor = new Zapisovac(meno, Hra.this.skore.getBody());
                    } catch (IOException ex) {
                        Logger.getLogger(Hra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Hra.this.zoznam.setText(Hra.this.subor.vypisHracov());
                    break;

            }
            if (Hra.this.tahy.getTahy() == 0) {
                Hra.this.koniec();
            }
        }
    }

    /**
     * Subclassa na základe atribútu postup vykoná príslušné akcie
     *
     */
    public class Event2 implements ActionListener {

        public void actionPerformed(ActionEvent ev) {
            switch (Hra.this.postup) {
                case 0:
                    Hra.this.inventar = new Kosik("stredny");
                    Hra.this.tahy = new Tahy("stredny");
                    Hra.this.nastavZaciatok();
                    break;
                case 1:
                    if (Hra.this.chodVlavo() > -1) {
                        Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik);
                        Hra.this.setObchod();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.chodVpravo();
                    }

                    break;
                case 2:
                    if (Hra.this.inventar.vlozDoKosika(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(1))) {
                        Hra.this.pridajPopis(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(1).toString());
                        Hra.this.zoznam.setText(Hra.this.zoznamS);
                        Hra.this.skore.pripocitaj(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(1).getBody());
                        Hra.this.zmenObrazok();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.tlac2text.setText("Vypredane");
                    }
                    if (Hra.this.inventar.getMiesto() < Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(1).getVelkost()) {
                        Hra.this.tlac2text.setText("Nezmesti sa do kosika");
                    }
                    break;
            }
            if (Hra.this.tahy.getTahy() == 0) {
                Hra.this.koniec();
            }
        }
    }

    /**
     * Subclassa na základe atribútu postup vykoná príslušné akcie
     *
     */
    public class Event3 implements ActionListener {

        public void actionPerformed(ActionEvent eve) {
            switch (Hra.this.postup) {
                case 0:
                    Hra.this.inventar = new Kosik("velky");
                    Hra.this.tahy = new Tahy("velky");
                    Hra.this.nastavZaciatok();
                    break;
                case 1:
                    if (Hra.this.chodVpravo() < 5) {
                        Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik);
                        Hra.this.setObchod();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.chodVlavo();
                    }
                    if ((Hra.this.rovnobezka == 4) && (Hra.this.poludnik == 2)) {
                        Hra.this.tlac5text.setText("Zaplatit nakup");
                    } else {
                        Hra.this.tlac5text.setText("Prepnut do nakupu/pohybu");
                    }
                    break;
                case 2:
                    if (Hra.this.inventar.vlozDoKosika(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(2))) {
                        Hra.this.pridajPopis(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(2).toString());
                        Hra.this.zoznam.setText(Hra.this.zoznamS);
                        Hra.this.skore.pripocitaj(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(2).getBody());
                        Hra.this.zmenObrazok();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.tlac3text.setText("Vypredane");
                    }
                    if (Hra.this.inventar.getMiesto() < Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(2).getVelkost()) {
                        Hra.this.tlac3text.setText("Nezmesti sa do kosika");
                    }
                    break;
            }
            if (Hra.this.tahy.getTahy() == 0) {
                Hra.this.koniec();
            }
        }
    }

    /**
     * Subclassa na základe atribútu postup vykoná príslušné akcie
     *
     */
    public class Event4 implements ActionListener {

        public void actionPerformed(ActionEvent even) {
            switch (Hra.this.postup) {
                case 1:
                    if (Hra.this.chodVzad() > -1) {
                        Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik);
                        Hra.this.setObchod();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.chodDopredu();
                    }
                    break;
                case 2:
                    if (Hra.this.inventar.vlozDoKosika(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(3))) {
                        Hra.this.pridajPopis(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(3).toString());
                        Hra.this.zoznam.setText(Hra.this.zoznamS);
                        Hra.this.skore.pripocitaj(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(3).getBody());
                        Hra.this.zmenObrazok();
                        Hra.this.pohyb();
                    } else {
                        Hra.this.tlac4text.setText("Vypredane");
                    }
                    if (Hra.this.inventar.getMiesto() < Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(3).getVelkost()) {
                        Hra.this.tlac4text.setText("Nezmesti sa do kosika");
                    }
                    break;
            }
            if (Hra.this.tahy.getTahy() == 0) {
                Hra.this.koniec();
            }
        }
    }

    /**
     * Subclassa na základe atribútu postup vykoná príslušné akcie
     *
     */
    public class Event5 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            switch (Hra.this.postup) {
                case 1:
                    Hra.this.postup = 2;
                    if (Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getPopis().equals("Pokladne")) {
                        Hra.this.koniec();
                        return;
                    }
                    Hra.this.tlac1text.setText(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(0).toString());
                    Hra.this.tlac2text.setText(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(1).toString());
                    Hra.this.tlac3text.setText(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(2).toString());
                    Hra.this.tlac4text.setText(Hra.this.dajUlicku(Hra.this.rovnobezka, Hra.this.poludnik).getVec(3).toString());
                    break;
                case 2:
                    Hra.this.postup = 1;
                    Hra.this.tlac1text.setText("Chod dopredu");
                    Hra.this.tlac2text.setText("Chod vlavo");
                    Hra.this.tlac3text.setText("Chod vpravo");
                    Hra.this.tlac4text.setText("Chod dozadu");
                    break;
            }
        }
    }
}
