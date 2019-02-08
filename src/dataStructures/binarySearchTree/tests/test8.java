package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.AVL_Tree.AVLBST;
import dataStructures.binarySearchTree.AVL_Tree.AVLNode;

public class test8 {
    public static void main(String[] args){
        AVLBST avl1 = new AVLBST();

        //int[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
        int[] array = {9,10,11,7,8,4,6,5};

        for (int i: array) {
            avl1.tree_recursive_insertion(new AVLNode(i));
        }

        avl1.preOrder();
    }
}
