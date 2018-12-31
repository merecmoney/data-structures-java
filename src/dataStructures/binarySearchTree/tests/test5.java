package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.classes.Node;
import dataStructures.binarySearchTree.interfaces.BinarySearchTree;

public class test5 {
    public static void main(String[] args){
        BinarySearchTree bst = bstTrees.example1();

        bst.inOrder();

        System.out.println(bst.tree_minimum());
        System.out.println(bst.tree_maximum());
        System.out.println(bst.subtree_minimum(bst.tree_search(18)));
        System.out.println(bst.subtree_maximum(bst.tree_search(7)));
    }
}
