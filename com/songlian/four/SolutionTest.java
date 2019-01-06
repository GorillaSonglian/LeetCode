package songlian.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays() {
        Solution solution = new Solution();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double one = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(one, 2.0);
        int[] nums3 = {1,3};
        int[] nums4 = {2,4};
        double two = solution.findMedianSortedArrays(nums3, nums4);
        assertEquals(two, 2.5);
    }
}