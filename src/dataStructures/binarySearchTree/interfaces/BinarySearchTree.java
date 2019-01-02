package dataStructures.binarySearchTree.interfaces;

import dataStructures.binarySearchTree.classes.Node;

public interface BinarySearchTree {

    void tree_insertion(Node z);

    void tree_recursive_insertion(Node z);

    void inOrder();

    void inOrder_traversal(Node x);

    Node tree_search(int key);

    Node tree_recursive_search(int key);

    Node tree_minimum();

    Node tree_maximum();

    Node subtree_minimum(Node x);

    Node subtree_maximum(Node x);

    Node tree_successor(Node x);
}
