import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = -nums[i]; // Problem Three Sum wymaga, by a+b+c=0, więc b+c =-a
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if(sum == target){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]){
                        r--;
                    }
                }
                else if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}