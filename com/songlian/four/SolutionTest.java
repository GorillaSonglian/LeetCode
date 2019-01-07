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
        assertEquals(2.5, two);
        int[] nums5 = {1,3,5,7,9};
        int[] nums6 = {2,4,6,8,10};
        double three = solution.findMedianSortedArrays(nums5, nums6);
        assertEquals(5.5, three);
    }
}