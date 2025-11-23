package symulator;

public class SkrzyniaBiegow extends Komponent{
    private int AktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;

    public SkrzyniaBiegow(int iloscBiegow, String nazwa, double cena, double waga ){
        super(nazwa,cena,waga);
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = 0.0;
        this.AktualnyBieg = 0;
    }
    public void zwiekszBieg(){
        if(AktualnyBieg<iloscBiegow) {
            AktualnyBieg++;
        }
    }
    public void zmniejszBieg(){
        if(AktualnyBieg>0){
            AktualnyBieg--;
        }
    }
    public int getAktualnyBieg() {
        return AktualnyBieg;
    }
    public double getAktualnePrzelozenie() {
        return aktualnePrzelozenie;
    }
    public void wrzucNaLuz(){
        while(AktualnyBieg>0){
            zmniejszBieg();
        }
    }

}
