package dataStructures.stack.tests;

import dataStructures.stack.classes.StackOfIntegers;
import dataStructures.stack.interfaces.Stack;

/**
 * Created by carlos on 6/07/17.
 */
/*
    test to see if pop works perfectly
 */
public class test2 {
    public static void main(String[] args){
        Stack stack1 = new StackOfIntegers();

        for (int i = 0; i<10; i++){
            stack1.push(i);
            stack1.pop();
        }

        /*
            for (int i = 0; i<9; i++){
                stack1.pop();
            }
        */

        System.out.println(stack1.printStack());

        stack1.pop();

        System.out.println(stack1.printStack());
    }
}
