package symulator;

public class SkrzyniaBiegow extends Komponent{
    private int AktualnyBieg;
    private int iloscBiegow;
    private Double aktualnePrzelozenie;

    public SkrzyniaBiegow(int iloscBiegow, String nazwa, Double cena, Double waga ){
        super(nazwa,cena,waga);
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = 0.0;
        this.AktualnyBieg = 0;
    }
    public void zwiekszBieg(){
        AktualnyBieg++;
    }
    public void zmniejszBieg(){
        AktualnyBieg--;
    }
    public int getAktualnyBieg() {
        return AktualnyBieg;
    }
    public double getAktualnePrzelozenie() {
        return aktualnePrzelozenie;
    }

}
