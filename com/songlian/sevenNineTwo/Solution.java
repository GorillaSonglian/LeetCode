package songlian.sevenNineTwo;

public class Solution {

    // This Solution is too slow!!!
    public static void main(String[] args) {

        Solution instance = new Solution();
        String s = "rwpddkvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvjubjgloeofnpjqlkdsqvruvabjrikfwronbrdyyjnakstqjac";
        String[] array =
                {"wpddkvbnn","lnagtva","kvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvju","rwpddkvbnnugln","gloeofnpjqlkdsqvruvabjrikfwronbrdyyj","vbgeinupkvgmgxeaaiuiyojmoqkahwvbpwugdainxciedbdkos","mspuhbykmmumtveoighlcgpcapzczomshiblnvhjzqjlfkpina","rgmliajkiknongrofpugfgajedxicdhxinzjakwnifvxwlokip","fhepktaipapyrbylskxddypwmuuxyoivcewzrdwwlrlhqwzikq","qatithxifaaiwyszlkgoljzkkweqkjjzvymedvclfxwcezqebx"};
        System.out.println(instance.numMatchingSubseq(s, array));

    }

    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubstring(S, word)) count++;
        }
        return count;
    }

    private boolean isSubstring(String S, String word) {
        int cur = -1;
        int fromIndex = 0;
        for (char c : word.toCharArray()) {
            int index = S.indexOf(c, fromIndex);
            if (index == -1) return false;
            else if (index > cur) {
                cur = index;
                fromIndex = index + 1;
            } else return false;
        }
        return true;
    }

}
