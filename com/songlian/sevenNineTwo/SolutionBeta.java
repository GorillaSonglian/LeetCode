package songlian.sevenNineTwo;

public class SolutionBeta {

    // Still too slow!!! 651ms
    public static void main(String[] args) {

        SolutionBeta instance = new SolutionBeta();
    }

    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubstring(S, word)) count++;
        }
        return count;
    }

    private boolean isSubstring(String S, String word) {
        int index = -1;
        for (char c : word.toCharArray()) {
            index = S.indexOf(c, index + 1);
            if (index == -1) return false;
        }
        return true;
    }
}
