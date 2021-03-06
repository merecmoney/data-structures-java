package dataStructures.queue.tests;

import dataStructures.queue.classes.QueueOfIntegers;
import dataStructures.queue.interfaces.Queue;

public class test6 {
    public static void main(String[] args){
        Queue queue = new QueueOfIntegers();
        for (int i = 0; i < 3; i++) {
            queue.enqueue(i);
        }

        System.out.println("It should print out 0");
        System.out.println(queue.dequeue_value_return());
        System.out.println("It should print out 1");
        System.out.println(queue.dequeue_node_return());
        System.out.println(queue);
    }
}
