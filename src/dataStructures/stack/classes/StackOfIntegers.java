/**
 * Created by carlos on 6/07/17.
 */
package dataStructures.stack.classes;

import dataStructures.stack.interfaces.Stack;

public class StackOfIntegers implements Stack{

    // attribute to know the latest element that was pushed
    private Node head;
    // attribute to store size of stack
    private int size;

    // method to obtain stack's head
    public Node getHead(){
        return this.head;
    }

    // method to add an element to stack
    @Override
    public void push(int value) {
        // create a new stack's element
        Node node = new Node(value);
        // check out if stack isn't empty
        if (!isEmpty()){
            // if it isn't empty ,
            // set head as new element's next node
            // let new element be new head
            node.setNext(head);
        }
        // if it is empty , head will be new element

        //increase size
        this.size ++;
        // set new element as head
        this.head = node;

    }

    // method to remove an element to stack
    @Override
    public void pop() {
        // check out if stack isn't empty
        if (!isEmpty()){
            // if it's not empty
            // get head's next node as new head
            this.head = this.head.getNext();
            // decrease size
            size --;
            return;
        }
        // if it is empty
        System.out.println("Stack is empty");

    }

    @Override
    public int pop_value_return() {
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = getHead().getValue();
        pop();
        return value;
    }

    @Override
    public Node pop_node_return(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Node node = getHead();
        pop();
        return node;
    }

    // method to return a list of stack elements
    @Override
    public String printStack() {
            //check out if stack isn't empty
            if (!isEmpty()){
                // declare a string object
                String content = "";
                // get a copy object of head's object
                Node tmp = new Node(this.head.getNext(), this.head.getValue());
                // set counter
                int i = 1;
                // do it while tmp isn't null
                // which means iterate the whole stack until the last element
                while(tmp != null){
                    // create a new string for content that uses next format:
                    // number_of_list node value_of_node
                    // for example:
                    // 1. node Value
                    content = content + (i) + ". node "
                            + tmp.getValue() + "\n";
                    // if it is the first element
                    // print under format head
                    // 1. node Value
                    //  head
                    if (i == 1){
                        content = content + "head\n";
                    }

                    // set next node after tmp
                    tmp = tmp.getNext();
                    // increase list size
                    i ++;
                }
                //return content with a list of stack elements
                return content;
            }
        // if it is empty return this string
        return "stack is empty";
    }

    // method to return stack's size
    @Override
    public int size(){
        return this.size;
    }

    // method yo check if stack is empty or no
    @Override
    public boolean isEmpty() {
        // if size is different of 0
        if (this.size != 0){
            // if it is true return false
            return false;
        }
        // if size is 0 return true
        return true;
    }

    //method to obtain a string that represents stack
    @Override
    public String toString(){
        //format
        //size_of_stack
        //head value int_value
        //list of stack
        //format of list stack

        return "size " + size() + "\nhead " +getHead() + " list of the stack\n"
                + printStack();
    }
}
