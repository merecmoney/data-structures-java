package dataStructures.queue.classes;

import dataStructures.queue.interfaces.Queue;
import dataStructures.stack.classes.Node;
/**
 * Created by carlos on 12/07/17.
 */
public class QueueOfIntegers implements Queue{

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty() != true){
            this.tail.setNext(node);
        }else {
            this.head = node;
        }
        size ++;
        this.tail = node;
    }

    @Override
    public void dequeue() {

        if (size() > 0){
            size --;
        }

        if (!isEmpty()){
            this.head = this.head.getNext();
        }else {
            System.out.println("Queue is empty");
            this.tail = this.head;
        }
    }

    @Override
    public String printQueue() {
        if (!isEmpty()){
            String content = "";
            Node tmp = this.head;
            int i = 1;
            while (tmp != null){
                content = content + (i) + ". node "
                        + tmp.getValue() + "\n";
                if (i == 1){
                    content = content + "head\n";
                }
                if (i == size()){
                    content = content + "tail\n";
                }
                tmp = tmp.getNext();
                i ++;
            }
            return content;
        }
        return "Queue is empty";
    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size != 0){
            return false;
        }
        return true;
    }
}
