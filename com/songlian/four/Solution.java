package songlian.four;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int length = nums1.length + nums2.length;
        boolean isOld = length % 2 != 0;
        int counterNum1 = 0;
        int counterNum2 = 0;
        for (int i = 0; counterNum1 < nums1.length || counterNum2 <= nums2.length; i++) {
            if (counterNum1 == nums1.length) {
                if (isOld) {
                    if (i == length / 2) {
                        return nums2[counterNum2];
                    }
                } else {
                    if (i == length / 2 - 1 || i == length / 2) {
                        result += nums2[counterNum2];
                    }
                }
                counterNum2++;
            } else if (counterNum2 == nums2.length) {
                if (isOld) {
                    if (i == length / 2) {
                        return nums1[counterNum1];
                    }
                } else {
                    if (i == length / 2 - 1 || i == length / 2) {
                        result += nums1[counterNum1];
                    }
                }
                counterNum1++;
            } else if (nums1[counterNum1] <= nums2[counterNum2]) {
                if (isOld) {
                    if (i == length / 2) {
                        return nums1[counterNum1];
                    }
                } else {
                    if (i == length / 2 - 1 || i == length / 2) {
                        result += nums1[counterNum1];
                    }
                }
                counterNum1++;
            } else {
                if (isOld) {
                    if (i == length / 2) {
                        return nums2[counterNum2];
                    }
                } else {
                    if (i == length / 2 -1 || i == length / 2) {
                        result += nums2[counterNum2];
                    }
                }
                counterNum2++;
            }
        }
        return result / 2;
    }
}
