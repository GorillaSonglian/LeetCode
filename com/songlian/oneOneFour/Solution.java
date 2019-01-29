package songlian.oneOneFour;

import songlian.util.TreeNode;

import java.util.Objects;


public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
    }

    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (Objects.isNull(root)) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
