package dataStructures.stack.tests;

import dataStructures.stack.classes.StackOfIntegers;
import dataStructures.stack.interfaces.Stack;

/**
 * Created by carlos on 6/07/17.
 */
/*
test to see if push works perfectly
 */
public class test1 {
    public static void main(String[] args){
        Stack stack1 = new StackOfIntegers();

        for (int i = 0; i<10; i++){
            stack1.push(i);
        }

        System.out.println(stack1.printStack());
    }
}
