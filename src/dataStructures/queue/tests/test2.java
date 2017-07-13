package dataStructures.queue.tests;

import dataStructures.queue.classes.QueueOfIntegers;
import dataStructures.queue.interfaces.Queue;

/**
 * Created by carlos on 12/07/17.
 */
public class test2 {
    public static void main(String[] args){
        //test to see if dequeue works
        Queue queue = new QueueOfIntegers();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);

        }

        for (int i = 0; i < 9; i++) {
            queue.dequeue();
        }

        System.out.println(queue.size());

        System.out.println(queue.printQueue());

        queue.dequeue();

        System.out.println(queue.size());

        queue.dequeue();

        System.out.println(queue.size());

        queue.enqueue(5);

        System.out.println(queue.printQueue());

    }
}
