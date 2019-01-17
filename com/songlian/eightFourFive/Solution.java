package songlian.eightFourFive;

public class Solution {

    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        Solution instance = new Solution();
        System.out.println(instance.longestMountain(A));
    }

    public int longestMountain(int[] A) {
        int N = A.length;
        int result = 0, base = 0;
        while (base < N) {
            int end = base;
            if (end + 1 < N && A[end] < A[end + 1]) {
                while (end + 1 < N && A[end] < A[end + 1]) end++;
                if (end + 1 < N && A[end] > A[end + 1]) {
                    while (end + 1 < N && A[end] > A[end + 1]) end++;
                    result = Math.max(result, end - base + 1);
                }
            }
            base = Math.max(end, base + 1);
        }
        return result;
    }
}
