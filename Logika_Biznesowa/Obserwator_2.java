package Logika_Biznesowa;

public class Obserwator_2 implements Obserwator {
    int dlugosc = 0;
    @Override
    public void Odswiez(String linijka) {
        dlugosc+=linijka.split(" ").length;

    }
    public void Wynik(){
        System.out.println(dlugosc);
    }
}
