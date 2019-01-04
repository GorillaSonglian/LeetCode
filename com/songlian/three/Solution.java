package songlian.three;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
    }
    // Too slow
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                i = map.get(s.charAt(i));
                max = map.size() > max ? map.size() : max;
                map.clear();
                i--;
            } else {
                map.put(s.charAt(i), i);
            }
        }
        max = map.size() > max ? map.size() : max;
        return max;
    }
}
