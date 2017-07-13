package dataStructures.queue.interfaces;

/**
 * Created by carlos on 12/07/17.
 */
public interface Queue {

    void enqueue(int value);

    void dequeue();

    String printQueue();

    int size();

    boolean isEmpty();
}
