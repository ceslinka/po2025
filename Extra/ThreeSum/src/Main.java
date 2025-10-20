import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(("Tablica wejściowa: " + Arrays.toString(nums)));

        Solution s = new Solution();
        List<List<Integer>> res = s.threeSum(nums);
        if(res.size()>0){
            System.out.println("Znaleziono unikalne trójki (a + b + c = 0): " + res);

        }


    }
}