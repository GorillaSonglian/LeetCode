package songlian.twoZeroNine;

import java.util.Objects;

public class Solution {

  public static void main(String[] args) {

    Solution instance = new Solution();
  }

  public int minSubArrayLen(int s, int[] nums) {
    if (Objects.nonNull(nums) || nums.length == 0) return 0;
    int result = Integer.MAX_VALUE;
    int length = 0;
    int count = 0;
    for (int j = 0; j < nums.length; j++) {
      for (int i = j; i < nums.length; i++) {
        count += nums[i];
        length++;
        if (count >= s) {
          if (length <= result) {
            result = length;
            count = 0;
            length = 0;
            if (length == 1) return 1;
          }
        }
      }
      count = 0;
      length = 0;
    }

    return result == Integer.MAX_VALUE ? 0 : result;
  }
}
