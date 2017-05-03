package laioffer.class3_QueueStackLinkedList;

import util.ListNode;

/**
 * Created by guangshuo on 3/30/17.
 * N1 -> N2 -> N3
 * pre   cur   next
 * reverse:
 * pre.next = null
 * cur.next = pre
 * move untill cur.next = null
 **/
public class ReverseLinkedlist {
    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
    }
        return pre;
    }
    public ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = reverseRecursive(next);
        newHead.next = head;
        head.next = null;
        return newHead;
    }
}
