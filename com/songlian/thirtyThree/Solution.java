package songlian.thirtyThree;

/**
 * @author songlli
 * @since 2019-05-05 19:12
 */
public class Solution {

    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            int num = (target < nums[0]) == (nums[mid] < nums[0])
                    ?
                    nums[mid] :
                    (target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE);
            if (num < target) {
                lo = mid + 1;
            } else if (num > target) {
                hi = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
