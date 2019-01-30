package songlian.fourFourFive;

import songlian.util.ListNode;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        instance.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode node = new ListNode(0);
        while (!stack1.empty() || !stack2.empty()) {
            if (!stack1.empty()) sum += stack1.pop();
            if (!stack2.empty()) sum += stack2.pop();
            ListNode cur = new ListNode(sum / 10);
            node.val = sum % 10;
            sum = sum / 10;
            cur.next = node;
            node = cur;

        }
        return node.val == 0? node.next :node;
    }
}
