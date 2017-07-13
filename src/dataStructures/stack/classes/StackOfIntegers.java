/**
 * Created by carlos on 6/07/17.
 */
package dataStructures.stack.classes;

import dataStructures.stack.interfaces.Stack;

public class StackOfIntegers implements Stack{

    private Node head;

    @Override
    public void push(int value) {
        if (isEmpty() != true){
            Node tmp = new Node(head, value);
            this.head = tmp;
        }else {
            this.head = new Node(value);
        }

    }

    @Override
    public void pop() {
        if (isEmpty() != true){
            this.head = this.head.getNext();
        }
    }

    @Override
    public String printStack() {
        String content = "";
            if (isEmpty() != true){
                Node tmp = new Node(this.head.getNext(), this.head.getValue());
                while(tmp.getNext() != null){
                    content = content + tmp;
                    tmp = tmp.getNext();
                }
                content = content+ " last item " + tmp.getValue();
                return content;
            }
        return "stack is empty";
    }

    @Override
    public boolean isEmpty() {
        if (this.head != null){
            return false;
        }

        return true;
    }
}
