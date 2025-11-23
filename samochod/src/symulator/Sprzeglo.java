package symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;
    public Sprzeglo(String nazwa, Double waga, Double cena) {
        super(nazwa, waga, cena);
        this.stanSprzegla = false;
    }
    public void wcisnij(){
        stanSprzegla = true;
    }
    public void zwolnij(){
        stanSprzegla = false;
    }

}
