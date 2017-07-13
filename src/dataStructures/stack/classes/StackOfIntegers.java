/**
 * Created by carlos on 6/07/17.
 */
package dataStructures.stack.classes;

import dataStructures.stack.interfaces.Stack;

public class StackOfIntegers implements Stack{

    private Node head;
    private int size;

    public Node getHead(){
        return this.head;
    }

    @Override
    public void push(int value) {
        Node node = new Node(value);
        if (!isEmpty()){
            node.setNext(head);
        }
        this.size ++;
        this.head = node;

    }

    @Override
    public void pop() {
        if (!isEmpty()){
            this.head = this.head.getNext();
            size --;
        }else {
            System.out.println("Stack is empty");
        }
    }

    @Override
    public String printStack() {
            if (!isEmpty()){
                String content = "";
                Node tmp = new Node(this.head.getNext(), this.head.getValue());
                int i = 1;
                while(tmp != null){
                    content = content + (i) + ". node "
                            + tmp.getValue() + "\n";
                    if (i == 1){
                        content = content + "head\n";
                    }
                    tmp = tmp.getNext();
                    i ++;
                }
                return content;
            }
        return "stack is empty";
    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size != 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "size " + size() + "\nhead " +getHead() + " list of the stack\n"
                + printStack();
    }
}
