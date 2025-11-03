package symulator;

public abstract class Komponent {
    String nazwa;
    Double waga;
    Double cena;
    public Komponent(String nazwa, Double waga, Double cena) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Double getWaga() {
        return waga;
    }
    public Double getCena() {
        return cena;
    }
}
