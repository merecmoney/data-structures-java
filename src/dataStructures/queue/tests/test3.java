package dataStructures.queue.tests;

import dataStructures.queue.classes.CircularQueueOfIntegers;
import dataStructures.queue.classes.QueueOfIntegers;
import dataStructures.queue.interfaces.Queue;

/**
 * Created by carlos on 15/07/17.
 */
public class test3 {
    public static void main(String[] args){
        //test to see if enqueue works for circular queue
        Queue queue1 = new CircularQueueOfIntegers();
        for (int i = 0; i < 3; i++) {
            queue1.enqueue(i);
        }
        System.out.println(queue1);
        System.out.println("queue 1 tail next " + queue1.getTail().getNext());

        Queue queue2 = new CircularQueueOfIntegers();
        queue2.enqueue(2);
        System.out.println(queue2);
        System.out.println("queue 2 tail next " + queue2.getTail().getNext());

    }
}
