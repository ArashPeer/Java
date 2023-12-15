package List;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriority_Queue {
    public static void main(String[] args) {
        Queue<Integer> peQue = new PriorityQueue<>(Comparator.reverseOrder());

        peQue.offer(111);
        peQue.offer(12);
        peQue.offer(15);
        peQue.offer(22);
        System.out.println("peQue = " + peQue);

        System.out.println(peQue.peek());
        // by default the order to take out the element by its smaller size but we can also reverse the comparator
        //by changing adding the comparator.reserveOrder() inside the PriorityQueue inter face parantheses.
    }

}
