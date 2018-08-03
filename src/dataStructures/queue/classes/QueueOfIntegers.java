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
    public void setHead(Node node) {
        this.head = node;
    }

    @Override
    public void setTail(Node node) {
        this.tail = node;
    }

    @Override
    public Node getHead(){
        return this.head;
    }

    @Override
    public Node getTail(){
        return this.tail;
    }

    @Override
    public void enqueue(int value) {
        Node node = new Node(value);
        if (!isEmpty()){
            this.tail.setNext(node);
        }else {
            this.head = node;
        }
        size ++;
        this.tail = node;
    }

    @Override
    public void dequeue() {

        if (!isEmpty()){
            this.head = this.head.getNext();
            if (size() == 1){
                this.tail = this.head;
            }
            size --;
        }else {
            System.out.println("Queue is empty");
        }
    }


    @Override
    public int dequeue_value_return(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = getHead().getValue();
        dequeue();
        return value;
    }

    @Override
    public Node dequeue_node_return(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Node node = getHead();
        dequeue();
        return node;
    }

    @Override
    public String printQueue() {
        if (!isEmpty()){
            String content = "";
            Node tmp = new Node(this.head.getNext(), this.head.getValue());
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
        return "Queue is empty\n";
    }

    @Override
    public int size(){
        return this.size;
    }

    public void increaseSize(){
        size ++;
    }

    public void decreaseSize(){
        size --;
    }

    @Override
    public boolean isEmpty() {
        if(this.size != 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "size " + size() + "\nhead " + getHead() + " tail "
                + getTail() + "\nqueue list\n\n" + printQueue();
    }
}
