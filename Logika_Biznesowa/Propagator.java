package Logika_Biznesowa;

import java.util.ArrayList;

public class Propagator implements Obserwowany {

    private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
    private String Dane;

    public Propagator(String dane) {
        Dane = dane;
    }

    @Override
    public void Zarejestruj(Obserwator O) {
        obserwatorzy.add(O);
    }

    @Override
    public void Usun(Obserwator O) {
        obserwatorzy.remove(O);
    }

    @Override
    public void Powiadom(String linijka) {
        for (Obserwator O : obserwatorzy){
            O.Odswiez(linijka);
        }

    }

    public void Czytnik(String Linijka){
        Powiadom(Linijka);
    }

    public void getDrugiObserwator(){
        for (Obserwator o : obserwatorzy){
            if (o instanceof Obserwator_2){
                ((Obserwator_2) o).Wynik();
            }
        }
    }
}
