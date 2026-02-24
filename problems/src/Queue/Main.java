package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //both add and offer insert element in queue, add throws exception, offer does not
        queue.add(10);
        queue.offer(5);
        queue.add(20);
        queue.offer(15);

        //both peek and element access the top of the queue, the first element
        System.out.println(queue.peek()); //does not throw exception
        System.out.println(queue.element());//throws exception



    }
}
