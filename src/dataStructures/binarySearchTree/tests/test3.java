package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;

public class test3 {
    public static void main(String[] args){
        BSF tree = new BSF(new Node(12));

        int[] array = {5,18,2,9,15,17,19,13};

        for (int i: array){
            tree.tree_recursive_insertion(new Node(i));
        }

        tree.inOrder();

        tree.inOrder_traversal(tree.getRoot().getLeft());
    }
}
