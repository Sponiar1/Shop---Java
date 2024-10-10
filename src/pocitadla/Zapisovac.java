package pocitadla;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Trieda Zapisovac bude slúžit na zapisovanie a čítanie bodov zo súboru
 *
 * @author Martin
 */
public class Zapisovac {

    /**
     * Konštruktor otvorí, prípadne vytvorí nový súbor do ktorého zapíše
     * parametre meno a body a nastaví sa na nový riadok
     *
     * @param meno je meno osoby, ktorá dané skóre dosiahla
     * @param body je počet bodov, ktorý hráč dosiahol
     * @throws IOException
     */
    public Zapisovac(String meno, int body) throws IOException {
        File file = new File("Skore.txt");

        try {
            if (file.createNewFile()) {
                FileOutputStream out = new FileOutputStream(file, false);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileWriter fstream = new FileWriter("Skore.txt", true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(meno + " " + body);
        out.newLine();
        out.close();
    }

    /**
     * Metóda do pamäte načíta zo súboru mená a body a podľa bodov potom zoradí
     * údaje vzostupne a uloží ich do pomocnej premennej typu String, každú na
     * nový riadok a max 10 riadkov s hráčmi
     *
     * @return String s
     */
    public String vypisHracov() {
        String s = "Top 10 hracov: " + "\n";
        int pocetRiadkov = 0;
        try {
            FileInputStream file = new FileInputStream("Skore.txt");
            Scanner citac = new Scanner(file);

            while (citac.hasNext()) {
                citac.nextLine();
                pocetRiadkov++;
            }
            citac.close();
        } catch (IOException ioex) {
            System.out.println("Doslo k chybe pri citani suboru " + ioex.getMessage());
        }

        String[] nickName = new String[pocetRiadkov];
        int[] bodiky = new int[pocetRiadkov];

        try {
            FileInputStream file = new FileInputStream("Skore.txt");
            Scanner citac = new Scanner(file);

            int pom = 0;
            while (citac.hasNext()) {
                String meno = citac.next();
                nickName[pom] = meno;
                int body = citac.nextInt();
                bodiky[pom] = body;
                pom++;
                citac.nextLine();
            }
            citac.close();
        } catch (IOException ioex) {
            System.out.println("Doslo k chybe pri citani suboru " + ioex.getMessage());
        }

        for (int i = 0; i < pocetRiadkov; i++) {
            for (int j = i; j < pocetRiadkov; j++) {
                if (bodiky[j] >= bodiky[i]) {
                    int pom = bodiky[i];
                    bodiky[i] = bodiky[j];
                    bodiky[j] = pom;
                    String pomString = nickName[i];
                    nickName[i] = nickName[j];
                    nickName[j] = pomString;
                }
            }
        }

        for (int i = 0; i < pocetRiadkov; i++) {
            s = s + (i + 1) + ". " + nickName[i] + " " + bodiky[i] + "\n";
            if (i == 9) {
                break;
            }
        }
        return s;
    }

}
