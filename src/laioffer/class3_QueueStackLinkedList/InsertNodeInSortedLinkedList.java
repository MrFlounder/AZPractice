package laioffer.class3_QueueStackLinkedList;

import util.ListNode;

/**
 * Created by guangshuo on 3/31/17.
 */
public class InsertNodeInSortedLinkedList {
    public void insert(ListNode head, int target) {
        ListNode pre = null;
        while (head != null) {
            if (head.value > target) {
                ListNode targetNode = new ListNode(target);
                targetNode.next = head;
                if (pre != null) {
                    pre.next = targetNode;
                }
                return;
            }
            else {
                pre = head;
                head = head.next;
            }
        }
        head.next = new ListNode(target);
    }
}
