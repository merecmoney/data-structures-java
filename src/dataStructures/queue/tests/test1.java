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

        System.out.println(queue);

        Queue queue1 = new QueueOfIntegers();

        queue1.enqueue(1);

        System.out.println(queue1);

        QueueOfIntegers queue2 = new QueueOfIntegers();

        System.out.println(queue2);

        for (int i = 0; i < 10; i++) {
            queue2.enqueue(i);
        }

        System.out.println(queue2);
    }
}
