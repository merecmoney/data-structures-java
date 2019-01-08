package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.interfaces.BinarySearchTree;

public class test6 {
    public static void main(String[] args){
        BinarySearchTree bst = bstTrees.example1();

        System.out.println(bst.tree_successor(bst.tree_search(6)));
        System.out.println(bst.tree_successor(bst.tree_search(13)));
        System.out.println(bst.tree_successor(bst.tree_search(15)));
        System.out.println(bst.tree_successor(bst.tree_search(20)));

        System.out.println(bst.tree_predecessor(bst.tree_search(6)));
        System.out.println(bst.tree_predecessor(bst.tree_search(13)));
        System.out.println(bst.tree_predecessor(bst.tree_search(15)));
        System.out.println(bst.tree_predecessor(bst.tree_search(20)));
        System.out.println(bst.tree_predecessor(bst.tree_search(2)));
    }
}
