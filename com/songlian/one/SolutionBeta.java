package songlian.one;

import java.util.HashMap;
import java.util.Map;

public class SolutionBeta {

    public static void main(String[] args) {

        SolutionBeta instance = new SolutionBeta();
    }

    // 7ms
    // may be use binary search would be faster
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int curr;
        Map<Integer, Integer> map = new HashMap<>();

        while (i < nums.length) {
            curr = target - nums[i];
            if (map.containsKey(curr)) {
                result[0] = map.get(curr);
                result[1] = i;
                break;
            }
            map.put(nums[i], i++);
        }
        return result;
    }
}
