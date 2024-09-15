package collectionFramework;

import java.util.ArrayDeque;

public class ArDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ar = new ArrayDeque<>(); //sliding window
        ar.offer(1);
        ar.offerFirst(0);
        ar.offerLast(2);
        ar.offer(4);
        System.out.println(ar);

        System.out.println(ar.peek());
        System.out.println(ar.peekFirst());
        System.out.println(ar.peekLast());

        System.out.println(ar.poll());
        System.out.println(ar.pollFirst());
        System.out.println(ar.pollLast());

        System.out.println(ar);
    }
}
