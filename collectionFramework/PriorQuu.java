package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorQuu {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // stores elements in the form if a min heap
      //  PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // stores elements in form of a max heap
        pq.offer(5);
        pq.offer(2);
        pq.offer(3);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
