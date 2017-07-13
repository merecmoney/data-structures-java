package dataStructures.queue.tests;

import dataStructures.queue.classes.QueueOfIntegers;
import dataStructures.queue.interfaces.Queue;

/**
 * Created by carlos on 12/07/17.
 */
public class test1 {
    public static void main(String[] args){
        //test to see if enqueue works
        Queue queue = new QueueOfIntegers();
        for (int i = 0; i < 3; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue.printQueue());

        Queue queue1 = new QueueOfIntegers();

        queue1.enqueue(1);

        System.out.println(queue1.printQueue());
    }
}
