package songlian.eightThree;

import songlian.util.ListNode;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode result = new ListNode(-1);
        ListNode cur = head;
        result.next = cur;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);
        head = head.next;
        while (head != null) {
            int value = head.val;
            if (!set.contains(value)) {
                set.add(value);
                cur.next = head;
                cur = head;
            }
            head = head.next;
        }
        cur.next = null;
        return result.next;
    }
}
