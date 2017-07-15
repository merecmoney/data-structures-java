package dataStructures.queue.tests;

import dataStructures.queue.classes.CircularQueueOfIntegers;
import dataStructures.queue.interfaces.Queue;
import dataStructures.stack.classes.Node;

/**
 * Created by carlos on 15/07/17.
 */
public class test4 {
    public static void main(String[] args){
        //test to check circular property of circular queue
        Queue queue1 = new CircularQueueOfIntegers();
        for (int i = 0; i < 10; i++) {
            queue1.enqueue(i);
        }
        System.out.println(queue1);

        //loop to check if circular property is correct
        Node tmp = queue1.getHead();
        String content = "";
        for (int i = 0; i < (2 * queue1.size()); i++) {
            content = content + (i+1) + ". node "
                    + tmp.getValue() + "\n";
            if (i+1 == 1) {
                content = content + "head\n";
            }
            if (i+1 == queue1.size() || i+1 == 2*(queue1.size())){
                content = content + "tail\n";
            }
            tmp = tmp.getNext();
        }
        System.out.println(content);
    }
}
