package symulator;

public class Silnik extends Komponent{
    private int maxObroty;
    private int Obroty;
    public Silnik(int maxObroty, String nazwa, Double waga, Double cena){
        super(nazwa, cena, waga);
        this.maxObroty = maxObroty;
        this.Obroty = 0;
    }
    public void uruchom(){
        if(this.Obroty == 0) {
            this.Obroty = 1000;
        }
    }
    public void zatrzymaj() {
        this.Obroty = 0;
    }
    public void zwiekszObroty(){
        this.Obroty = this.maxObroty;
    }
    public void zmniejszObroty(){
    }
}
