package dataStructures.queue.interfaces;

import dataStructures.stack.classes.Node;

/**
 * Created by carlos on 12/07/17.
 */
public interface Queue {

    void setHead(Node node);

    void setTail(Node node);

    Node getHead();

    Node getTail();

    void enqueue(int value);

    void dequeue();

    String printQueue();

    int size();

    boolean isEmpty();
}
