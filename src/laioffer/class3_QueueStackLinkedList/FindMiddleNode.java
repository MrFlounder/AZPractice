package laioffer.class3_QueueStackLinkedList;

import util.ListNode;

import java.util.List;

/**
 * Created by guangshuo on 3/31/17.
 */
public class FindMiddleNode {
    public ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
