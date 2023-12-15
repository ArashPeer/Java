package List;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(10);
        arrayDeque.offerFirst(20);
        arrayDeque.offerLast(30);
        arrayDeque.offer(40);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        System.out.println(arrayDeque.poll());
        System.out.println("Poll() " +arrayDeque);

        System.out.println(arrayDeque.pollFirst());
        System.out.println("pollFirst() " +arrayDeque);

        System.out.println(arrayDeque.pollLast());
        System.out.println("pollLast() " +arrayDeque);

    }
}
