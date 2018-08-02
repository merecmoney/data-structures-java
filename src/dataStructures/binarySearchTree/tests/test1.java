package dataStructures.binarySearchTree.tests;

import dataStructures.binarySearchTree.classes.Node;
import dataStructures.binarySearchTree.classes.BSF;
import dataStructures.binarySearchTree.interfaces.BinarySearchTree;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args){
        Node root = new Node(12);
        BSF tree = new BSF(root);

        int[] array = {5,18,2,9,15,17,19,13};

        for (int i: array){
            tree.tree_insertion(new Node(i));
        }

        tree.inOrder();

    }
}
