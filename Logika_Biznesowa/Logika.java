package Logika_Biznesowa;

import GUI.Zadanie_GUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.Guard;
import java.util.Scanner;

public class Logika {

    Propagator NowyPropagator = new Propagator("");
    Zadanie_GUI GUI;

    public Logika(Zadanie_GUI GUI) {
        this.GUI = GUI;
    }

    public void Metoda(String Sciezka) {
        NowyPropagator.Zarejestruj(new Obserwator_1());
        NowyPropagator.Zarejestruj(new Obserwator_2());
        NowyPropagator.Zarejestruj(new Obserwator_3(GUI));

        GUI.OdswiezWynik(false);
        try {
            Scanner scan = new Scanner(new File(Sciezka+".txt"));
            while (scan.hasNextLine()){
                NowyPropagator.Czytnik(scan.nextLine());
            }
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        }
        NowyPropagator.getDrugiObserwator();
    }

}
