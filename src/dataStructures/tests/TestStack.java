package dataStructures.tests;

import static org.junit.Assert.*;

import dataStructures.stack.classes.StackOfIntegers;
import dataStructures.stack.interfaces.Stack;
import org.junit.*;

public class TestStack {

    private static Stack stack1;

    @Before
    public void setUp(){
        stack1 = new StackOfIntegers();

    }
    @Test
    public void testAddOperation(){
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        assertEquals("size must 10", 10,stack1.size());
    }

    @Test
    public void testEmptyOperation(){
        assertEquals(true, stack1.isEmpty());
    }

    @Test
    public void testHeadOperation(){
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        StackOfIntegers tmp = (StackOfIntegers)stack1;
        assertEquals("head must be 9",9,tmp.getHead().getValue());
    }

    @Test
    public void testPopOperation(){
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 3; i++) {
            stack1.pop();
        }
        assertEquals("size must be 6", 7 ,stack1.size());

        StackOfIntegers tmp = (StackOfIntegers)stack1;
        assertEquals("head must be 6", 6 ,tmp.getHead().getValue());
        for (int i = 0; i < 7; i++) {
            stack1.pop();
        }
        assertEquals("head must be null", null, tmp.getHead());
    }
}
