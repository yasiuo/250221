package Logika_Biznesowa;

import GUI.Zadanie_GUI;

public class Obserwator_3 implements Obserwator {

    Zadanie_GUI GUI;

    public Obserwator_3(Zadanie_GUI GUI) {
        this.GUI = GUI;
    }

    @Override
    public void Odswiez(String linijka) {
        String[] slowa = linijka.split(" ");
        try {
            for (String slowo : slowa) {
                if (slowo.equals("bomba") || slowo.equals("zamach") || slowo.equals("pistolet")) {  //wywolanie wyjatku
                    GUI.OdswiezWynik(true);
                    throw new Niebezpieczenstwo_exception("Niebezpieczenstwo");
                }
            }
        }catch (Niebezpieczenstwo_exception n){
            System.out.println(n.getMessage());
        }

    }
}
