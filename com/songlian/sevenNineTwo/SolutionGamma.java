package songlian.sevenNineTwo;

import java.util.HashSet;

public class SolutionGamma {

    public static void main(String[] args) {

        SolutionGamma instance = new SolutionGamma();
    }

    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        HashSet<String> containSet = new HashSet<>();
        HashSet<String> noContainSet = new HashSet<>();
        for (String word : words) {
            if (containSet.contains(word)) {
                count++;
                continue;
            }
            if (noContainSet.contains(word)) {
                continue;
            }

            if (isSubstring(S, word)) {
                containSet.add(word);
                count++;
            } else {
                noContainSet.add(word);
            }
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
