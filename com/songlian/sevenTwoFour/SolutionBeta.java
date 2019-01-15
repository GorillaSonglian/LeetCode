package songlian.sevenTwoFour;

import java.util.Arrays;

public class SolutionBeta {

    // traverse is much faster than Arrays.stream().sum()
    public static void main(String[] args) {

        SolutionBeta instance = new SolutionBeta();
    }

    public int pivotIndex(int[] nums) {
        if (nums.length <= 2) return -1;
        int leftToal = 0;
        int total = 0;
        for (int num : nums) total += num;
        if (total - nums[0] == 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            leftToal += nums[i - 1];
            if (total - leftToal - nums[i] == leftToal) {
                return i;
            }
        }
        return -1;
    }
}
