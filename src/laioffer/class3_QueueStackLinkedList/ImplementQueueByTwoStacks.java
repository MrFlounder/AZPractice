package laioffer.class3_QueueStackLinkedList;

import java.util.LinkedList;

/**
 * Created by guangshuo on 3/14/17.
 * in : 4,3,2,1
 * s1: 1 2 3 4
 * s2:
 * out : 1
 * out is empty, move s1 -> s2
 * s1:
 * s2: 4 3 2 1
 * out by 1
 * ...
 */
public class ImplementQueueByTwoStacks {
    private LinkedList<Integer> in;
    private LinkedList<Integer> out;
    public ImplementQueueByTwoStacks() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }
    public Integer poll() {
        //moveIfEmpty();
        return out.isEmpty() ? null : out.pollFirst();
    }

}
