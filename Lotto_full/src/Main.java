import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> winningNumbers = new ArrayList<>(); //Lista przechowująca wylosowane numery//
        List<Integer>userNumbers = new ArrayList<>(); // Lista przechowująca liczby użytkownika //
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int userNumber = Integer.parseInt(args[i]);
            if (!userNumbers.contains(userNumber)) {
                userNumbers.add(userNumber);
            }
            while (true) {
                int winningNumber = random.nextInt(49) + 1;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }

            }

            }
        }
        System.out.println(" Liczby użytkownika : " + userNumbers);
        System.out.println(" Wygrane liczby : " + winningNumbers);
        winningNumbers.retainAll(userNumbers);
        System.out.println(" Trafione liczby: " + winningNumbers);
    }
}

