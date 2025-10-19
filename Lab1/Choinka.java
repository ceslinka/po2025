import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        char znakGwiazdki = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę poziomów choinki: ");
        int poziomy = sc.nextInt(); // wczytanie liczby poziomów

        for (int i = 0; i < poziomy; i++) { // kolejne poziomy choinki
            for (int j = 0; j < poziomy * 2; j++) { // iteracja po szerokości
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" "); // spacje po bokach
                } else {
                    System.out.print(znakGwiazdki); // gwiazdki w środku
                }
            }
            System.out.println(); // nowa linia po każdym poziomie
        }

        sc.close(); // zamknięcie skanera
    }
}
