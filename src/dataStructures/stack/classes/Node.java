/**
 * Created by carlos on 6/07/17.
 */
package dataStructures.stack.classes;

public class Node {

    private Node next;
    private int value;

    public Node(int value){
        setValue(value);
    }

    public Node(Node next, int value) {
        setNext(next);
        setValue(value);
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public String toString(){
        return "value " + this.value +
                " next " + this.getNext().getValue() + "\n";
    }

}
