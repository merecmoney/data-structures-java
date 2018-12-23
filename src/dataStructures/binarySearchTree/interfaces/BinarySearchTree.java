package dataStructures.binarySearchTree.interfaces;

import dataStructures.binarySearchTree.classes.Node;

public interface BinarySearchTree {

    void tree_insertion(Node z);

    void tree_recursive_insertion(Node z);

    void inOrder();

    void inOrder_traversal(Node x);

    Node tree_search(int key);

    Node tree_recursive_search(int key);
}
