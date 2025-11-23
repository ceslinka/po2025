package symulator;

public class TestSymulatora {
    public static void main(String[] args) {
        Silnik mojSilnik = new Silnik(8500, "V8 5.0", 40000.0, 250.0);
        Sprzeglo mojeSprzeglo = new Sprzeglo("Dwutarczowe", 1500.0, 15.0);
        SkrzyniaBiegow mojaSkrzynia = new SkrzyniaBiegow(6, "AMG SPEEDSHIFT TCT 9G – automatyczna skrzynia biegów", 5000.0, 60.0);
        Pozycja pozycjaStartowa = new Pozycja(0,0);

        Samochod mojSamochod = new Samochod("Mercedes_AMG G 63", "ROZI2005", 220, false, mojSilnik, pozycjaStartowa, mojaSkrzynia, mojeSprzeglo);
        System.out.println("Moj Samochod: " + mojSamochod.getModel());
        System.out.println("Stan początkowy:");
        wyswietlStan(mojSamochod);
        System.out.println("Uruchamiam samochod");
        mojSamochod.wlacz();
        wyswietlStan(mojSamochod);

        System.out.println("Zmiana biegu na 1");
    }
    public static void wyswietlStan(Samochod samochod) {
        System.out.println("Samochod włączony: " + samochod.getStanWlaczenia());
}
