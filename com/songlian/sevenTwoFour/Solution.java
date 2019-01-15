package songlian.sevenTwoFour;

import java.util.Arrays;

public class Solution {

    // Too slow
    public static void main(String[] args) {

        Solution instance = new Solution();
    }

    public int pivotIndex(int[] nums) {
        if (nums.length <= 2) return -1;
        int leftToal = 0;
        int total = Arrays.stream(nums).sum();
        if(total - nums[0] == 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            leftToal += nums[i-1];
            if (total - leftToal- nums[i] == leftToal) {
                return i;
            }
        }
        return -1;
    }
}
