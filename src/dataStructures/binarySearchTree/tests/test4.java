package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.interfaces.BinarySearchTree;
import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;

public class test4 {
    public static void main(String[] args){
        BinarySearchTree bst = bstTrees.example1();

        bst.inOrder();

        System.out.println("Keys found");
        System.out.println(bst.tree_search(7));
        System.out.println(bst.tree_recursive_search(7));
        System.out.println("Keys not found");
        System.out.println(bst.tree_recursive_search(21));
        System.out.println(bst.tree_search(21));

    }
}
