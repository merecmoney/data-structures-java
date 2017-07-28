/**
 * Created by carlos on 6/07/17.
 */
package dataStructures.stack.classes;

public class Node {

    private Node next;
    private int value;

    //constructor to create a Node Object with an int value
    public Node(int value){
        setValue(value);
    }

    //constructor to create a Node Object with an int value and setting next Node
    public Node(Node next, int value) {
        setNext(next);
        setValue(value);
    }

    //method to set next Node for current Node
    public void setNext(Node next) {
        this.next = next;
    }

    //method to set Node's value
    public void setValue(int value) {
        this.value = value;
    }

    //method to return next Node of current Node
    public Node getNext() {
        return next;
    }

    //method to get int Value of current Node
    public int getValue() {
        return value;
    }

    //method to print Node in a String format
    public String toString(){
        return "value " + this.value + "\n";
    }

}
