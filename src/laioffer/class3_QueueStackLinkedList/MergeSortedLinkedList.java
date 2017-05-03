package laioffer.class3_QueueStackLinkedList;

import util.ListNode;

/**
 * Created by guangshuo on 3/31/17.
 */
public class MergeSortedLinkedList {
    public ListNode mergeList(ListNode h1, ListNode h2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (h1 != null && h2 != null) {
            if (h1.value < h2.value) {
                cur.next = h1;
                h1 = h1.next;
            } else {
                cur.next = h2;
                h2 = h2.next;
            }
            cur = cur.next;
        }
        //while
        //while
        return dummyHead.next;
    }
}
