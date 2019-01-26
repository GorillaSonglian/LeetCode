package songlian.eightThree;

import songlian.util.ListNode;

public class SolutionBeta {

    public static void main(String[] args) {

        SolutionBeta instance = new SolutionBeta();
    }

    // The list is sorted.
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curretn = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else head = head.next;
        }
        return curretn;
    }
}
