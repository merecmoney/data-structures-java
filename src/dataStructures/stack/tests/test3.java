package dataStructures.stack.tests;

import dataStructures.stack.classes.StackOfIntegers;
import dataStructures.stack.interfaces.Stack;

public class test3 {
    public static void main(String[] args){
        Stack stack = new StackOfIntegers();

        System.out.println("check out when it's empty");
        System.out.println("It should return -1");
        System.out.println(stack.pop_value_return());
        System.out.println("It should return null");
        System.out.println(stack.pop_node_return());

        for (int i = 0; i<3; i++){
            stack.push(i);
        }

        System.out.println("check out when it's not empty");
        System.out.println("It should return 2");
        System.out.println(stack.pop_value_return());
        System.out.println("It should return 1");
        System.out.println(stack.pop_node_return());

        System.out.println(stack);

    }
}
