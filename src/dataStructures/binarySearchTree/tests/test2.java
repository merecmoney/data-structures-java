package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;

public class test2 {
    public static void main(String[] args){
        BSF tree = new BSF();

        int[] array = {12,5,18,2,9,17,15,19,13};

        for (int i: array){
            tree.tree_insertion(new Node(i));
        }

        tree.inOrder();
    }
}
