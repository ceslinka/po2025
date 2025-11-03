package symulator;

public class Sprzeglo extends Komponent {
    private boolean StanSprzegla;
    public Sprzeglo(String nazwa, Double waga, Double cena) {
        super(nazwa, waga, cena);
        this.StanSprzegla = false;
    }
    public void wcisnij(){
        StanSprzegla = true;
    }
    public void zwolnij(){
        StanSprzegla = false;
    }

}
