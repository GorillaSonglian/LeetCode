package songlian.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("b");
        assertEquals(result, 1);
        result = solution.lengthOfLongestSubstring("abcdefg");
        assertEquals(result, 7);
    }
}