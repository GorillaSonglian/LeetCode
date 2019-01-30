package songlian.sevenTwoFive;

import songlian.util.ListNode;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        instance.splitListToParts(null, 4);
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        if (root == null) return result;
        int size = 0;
        ListNode cur = root;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        int groupSize = size / k;
        int margin = size % k;
        ListNode cursor = root, prev = null;
        for (int i = 0; i < k; i++) {
            int curGroupSize = margin > 0 ? groupSize + 1 : groupSize;
            margin--;
            result[i] = cursor;
            for (int count = 0; count < curGroupSize; count++) {
                prev = cursor;
                cursor = cursor.next;
            }
            prev.next = null;
        }
        return result;
    }
}
