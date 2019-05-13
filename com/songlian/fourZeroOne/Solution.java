package songlian.fourZeroOne;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/**
 * @author songlli
 * @since 2019-05-13 14:56
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.readBinaryWatch(2);
    }

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        char[] s = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        backTracking(result, num, 0, s);
        return result;
    }

    private void backTracking(List<String> result, int num, int index, char[] s) {
        if (num == 0) {
            convert(result, s);
        } else {
            for (int i = index; i < s.length; i++) {
                s[i] = '1';
                backTracking(result, num - 1, i + 1, s);
                s[i] = '0';
            }
        }
    }

    private void convert(List<String> result, char[] s) {
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < 4; i++) {
            hour += (int) Math.pow(2, 3 - i) * Character.getNumericValue(s[i]);
        }
        for (int i = 4; i < 10; i++) {
            minute += (int) Math.pow(2, 9 - i) * Character.getNumericValue(s[i]);
        }
        if (hour > 11 || minute > 59) {
        } else {
            String t = hour + ":" + (minute < 10 ? "0" : "") + minute;
            if (result.indexOf(t) == -1) {
                result.add(t);
            }
        }
    }
}
