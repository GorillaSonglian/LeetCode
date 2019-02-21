package songlian.twoZeroNine;

import org.omg.PortableInterceptor.INACTIVE;

public class SolutionBeta {

  public static void main(String[] args) {

    SolutionBeta instance = new SolutionBeta();
  }

  public int minSubArrayLen(int s, int[] nums) {
    int result = Integer.MAX_VALUE;
    int current = 0;
    int left = 0;
    for (int i = 0; i < nums.length; i++) {
      current += nums[i];
      while (current >= s) {
        result = Math.min(result, i - left + 1);
        current -= nums[left++];
      }
    }

    return result == Integer.MAX_VALUE ? 0 : result;
  }
}
