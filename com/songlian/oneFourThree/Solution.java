package songlian.oneFourThree;

import songlian.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution instance = new Solution();
        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(8);
        instance.reorderList(head);
    }

    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur;
            list.add(tmp);
            cur = cur.next;
        }
        cur = head;
        for (int i = 1; i < list.size() / 2 ; i++) {
            if (i % 2 == 0) {
                cur.next = list.get(list.size() -i);
            }
            else {
                cur.next = list.get(i);
            }
            cur = cur.next;
        }

        cur = head;
        while (cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

}
