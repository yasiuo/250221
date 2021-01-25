package Logika_Biznesowa;

public interface Obserwowany {
    void Zarejestruj(Obserwator O);
    void Usun(Obserwator O);
    void Powiadom(String linijka);
}
