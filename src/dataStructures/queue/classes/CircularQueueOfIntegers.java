package dataStructures.queue.classes;

import dataStructures.queue.interfaces.Queue;
import dataStructures.stack.classes.Node;

/**
 * Created by carlos on 15/07/17.
 */
public class CircularQueueOfIntegers extends QueueOfIntegers implements Queue{

    @Override
    public void enqueue(int value){
        Node node = new Node(value);

        if (!isEmpty()){
            getTail().setNext(node);
        }else {
            setHead(node);
        }
        setTail(node);
        getTail().setNext(getHead());
        increaseSize();
    }

    @Override
    public void dequeue(){
        if (getHead() == getHead().getNext()){
            setHead(null);
            setTail(null);
            decreaseSize();
        }else if (!isEmpty()){
            Node tmp = getHead().getNext();
            setHead(tmp);
            getTail().setNext(getHead());
            decreaseSize();
        }else {
            System.out.println("Queue is empty");
        }
    }

    @Override
    public String printQueue() {
        if (!isEmpty()){
            String content = "";
            Node tmp = new Node(getHead().getNext(), getHead().getValue());
            int i = 0;
            while (tmp != getHead()){
                i ++;
                content = content + (i) + ". node "
                        + tmp.getValue() + "\n";
                if (i == 1) {
                    content = content + "head\n";
                }
                if (i == size()){
                    content = content + "tail\n";
                }
                tmp = tmp.getNext();
            }
            return content;
        }
        return "Queue is empty\n";
    }

    @Override
    public String toString(){
        return "size " + size() + "\nhead " + getHead() + " tail "
                + getTail() + "\nqueue list\n\n" + printQueue();
    }
}
