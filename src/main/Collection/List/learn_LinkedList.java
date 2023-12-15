package List;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.LinkedList;
import java.util.Queue;

public class learn_LinkedList {
    public static void main(String[] args) {
        //first we need to create the QUEUE interface
        //now the LinkedList has those methods that gifted to Queue.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(15);
        queue.offer(22);
        System.out.println("queue = " + queue);

        queue.poll();
        System.out.println("queue = " + queue);

        System.out.println(queue.peek());
        System.out.println("queue = " + queue.poll());
        System.out.println(queue);

    }
}
