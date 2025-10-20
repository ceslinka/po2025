import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        if(args.length != 6){
            System.out.println("Proszę podac 6 cyfr!");
            return;
        }
        List<Integer> winningNumbers = new ArrayList<>(); //Lista przechowująca wygrywające numery//
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int winningNumber = Integer.parseInt(args[i]);
            if (!winningNumbers.contains(winningNumber)) {
                winningNumbers.add(winningNumber);
            }
            else {
                System.out.println("Proszę podać różne argumenty!");
                return;
            }
        }
        while (true) {
            count++;
            List<Integer> userNumbers = new ArrayList<>(); // Lista przechowująca losowane liczby //
            while (userNumbers.size() < 6) {
                int userNumber = random.nextInt(49) + 1;
                if (!userNumbers.contains(userNumber)) {
                    userNumbers.add(userNumber);
                }
            }
            List<Integer> matches = new ArrayList<>(userNumbers);
            matches.retainAll(winningNumbers);
            if (matches.size() == 6) {
                System.out.println("Wylosowano 6!");
                break;
            }
        }

        System.out.println(" Wygrane liczby : " + winningNumbers);
        System.out.println(" Trafiono za " + count + " razem ");
    }
}

