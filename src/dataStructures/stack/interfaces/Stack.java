/**
 * Created by carlos on 6/07/17.
 */
/*
A Stack structure is an abstract data structure where
the first element that is pushed is the last to be popped

A little ASCII drawing

 head                     tail
 ------      ------      ------
| node | -> | node | -> | node |

When you add an element to stack




When you remove an element to stack


 current      new
  head        head        tail
 ------      ------      ------
| node | -> | node | -> | node |

 */
package dataStructures.stack.interfaces;

import dataStructures.stack.classes.Node;

public interface Stack {

    //function to add an element to stack
    void push(int number);

    //function to remove an element to stack
    void pop();

    //function to print return a string with stack's elements
    String printStack();

    //function to know the size of stack
    int size();

    //function to check out it stack is empty
    boolean isEmpty();

    int pop_value_return();

    Node pop_node_return();
}
