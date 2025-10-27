class CodingBat {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean makeBricks(int small, int big, int goal) {
        int sum = small + 5*big;
        if(sum < goal){
            return false;
        }
        if(goal%5 > small){
            return false;
        }
        return true;
    }
    public boolean loneTeen(int a, int b) {
        boolean is_a = (a>= 13 && a<= 19);
        boolean is_b = (b<=19&&b>=13);
        if(is_a!=is_b){
            return true;
        }
        return false;
    }
    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }







    public static void main(String[] args) {
        CodingBat s = new CodingBat();

        System.out.println("SleepIn: " + sleepIn(true, true));
        System.out.println("Make Bricks: " + makeBricks(3,2,9));
        System.out.println("IsEverywhere: " + isEverywhere(new int[] {1,2,4,3,2,1,2},2));

    }
}
