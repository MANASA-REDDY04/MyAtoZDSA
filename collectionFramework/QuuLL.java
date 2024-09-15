package collectionFramework;

import java.util.LinkedList;

/* Queue
    ->Arraydequeue
    ->LinkedList
    ->Priorityqueue
 */
public class QuuLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        System.out.println(ll.peek());
    }
}
