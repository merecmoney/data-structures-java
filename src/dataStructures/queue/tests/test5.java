package dataStructures.queue.tests;

import dataStructures.queue.classes.CircularQueueOfIntegers;
import dataStructures.queue.interfaces.Queue;

/**
 * Created by carlos on 15/07/17.
 */
public class test5 {
    public static void main(String[] args){
        //test to check if circular dequeue works
        Queue queue1 = new CircularQueueOfIntegers();
        for (int i = 0; i < 4; i++) {
            queue1.enqueue(i);
        }

        System.out.println("for queue 1 tail next " + queue1.getTail().getNext());
        queue1.dequeue();
        System.out.println(queue1);
        System.out.println("for queue 1 tail next after dequeue " +
                queue1.getTail().getNext());
        System.out.println(queue1);
        queue1.dequeue();
        System.out.println("for queue 1 tail next after second dequeue " +
                queue1.getTail().getNext());
        System.out.println(queue1);

        queue1.dequeue();
        queue1.dequeue();

        System.out.println(queue1);

        queue1.enqueue(1);

        System.out.println(queue1);

        System.out.println("for queue 1 tail next after a enqueue " +
                queue1.getTail().getNext());

    }
}
