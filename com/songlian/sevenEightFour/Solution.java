package songlian.sevenEightFour;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songlli
 * @since 2019-05-13 13:19
 */
public class Solution {

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        backTracking(result, 0, S.toCharArray());
        return result;
    }

    private void backTracking(List<String> result, int index, char[] input) {
        if (index == input.length) {
            result.add(new String(input));
        } else {
            if (Character.isLetter(input[index])) {
                input[index] = Character.toLowerCase(input[index]);
                backTracking(result, index + 1, input);
                input[index] = Character.toUpperCase(input[index]);
                backTracking(result, index + 1, input);
            } else {
                backTracking(result, index + 1, input);
            }
        }
    }

}
