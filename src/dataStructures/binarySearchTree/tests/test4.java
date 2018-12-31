package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.interfaces.BinarySearchTree;
import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;

public class test4 {
    public static void main(String[] args){
        BinarySearchTree bst = new BSF();

        int[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};

        for (int i: array) {
            bst.tree_insertion(new Node(i));
        }

        bst.inOrder();

        System.out.println("Keys found");
        System.out.println(bst.tree_search(7));
        System.out.println(bst.tree_recursive_search(7));
        System.out.println("Keys not found");
        System.out.println(bst.tree_recursive_search(21));
        System.out.println(bst.tree_search(21));

    }
}
