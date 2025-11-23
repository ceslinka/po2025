package symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow;
    private Sprzeglo sprzeglo;
    private Pozycja pozycja;
    private Pozycja aktualnaPozycja;

    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    public int predkoscMax;

    public Samochod(String model, String nrRejest, int predkoscMax, Boolean stanWlaczenia, Silnik silnik, Pozycja pozycja, SkrzyniaBiegow skrzyniaBiegow, Sprzeglo sprzeglo) {
        this.model = model;
        this.nrRejest = nrRejest;
        this.predkoscMax = predkoscMax;
        this.stanWlaczenia = stanWlaczenia;

        this.silnik = silnik;
        this.pozycja = pozycja;
        this.sprzeglo = sprzeglo;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.aktualnaPozycja = this.pozycja;
    }

    public void wlacz() {
        silnik.uruchom();
        this.stanWlaczenia = true;
    }
    public void wylacz(){
        silnik.zatrzymaj();
        skrzyniaBiegow.wrzucNaLuz();
        this.stanWlaczenia = false;
    }
    public Pozycja getAktPozycja(){
        return aktualnaPozycja;
    }
    public double getWaga(){
        return silnik.getWaga() + skrzyniaBiegow.getWaga()+ sprzeglo.getWaga();

    }
    public String getNrRejest(){
        return nrRejest;
    }
    public String getModel(){
        return model;
    }
    public boolean getStanWlaczenia(){
        return stanWlaczenia;
    }

}