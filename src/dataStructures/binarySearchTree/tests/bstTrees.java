package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;
import dataStructures.binarySearchTree.interfaces.BinarySearchTree;

public class bstTrees {
    public static BinarySearchTree example1() {
        BinarySearchTree bst = new BSF();

        int[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};

        for (int i: array) {
            bst.tree_insertion(new Node(i));
        }

        return bst;
    }
}
