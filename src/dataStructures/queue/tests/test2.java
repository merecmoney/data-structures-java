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

        System.out.println(queue);

        for (int i = 0; i < 2; i++) {
            queue.dequeue();
        }

        System.out.println(queue);


        Queue queue1 = new QueueOfIntegers();

        System.out.println(queue1);

        queue1.enqueue(10);

        System.out.println(queue1);

        queue1.dequeue();

        System.out.println(queue1);

    }
}
