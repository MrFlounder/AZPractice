package laioffer.class3_QueueStackLinkedList;

import util.ListNode;

/**
 * Created by guangshuo on 3/31/17.
 */
public class IfCircleExist {
    public boolean ifCircleExist(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
