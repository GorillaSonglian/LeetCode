package songlian.four;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //dummy
       Object[] both = Stream.of(nums1, nums2).flatMap(Stream::of).sorted().toArray();
        if (both.length % 2 ==0 ) {
            return ((int) both[both.length/2] + (int) both[both.length/2 -1]) /2;
        }
        return (int)both[both.length/2];
    }
}
