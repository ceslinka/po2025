import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int target = Integer.parseInt(args[0]);
        int[] nums = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            nums[i - 1] = Integer.parseInt(args[i]);
        }
        System.out.println("Target: " + target);
        System.out.println("Nums: " + Arrays.toString(nums));// Arrays.toString(tablica): metoda ta zwraca nam czytelny ciąg znaków tablicy
        int[] result = Solution.twoSum(nums, target);
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Liczby:[" + nums[result[0]] + "," + nums[result[1]] + "]");
    }
}