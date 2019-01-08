package dataStructures.binarySearchTree.classes;

import dataStructures.binarySearchTree.interfaces.BinarySearchTree;

public class BSF implements BinarySearchTree {

    private Node root;

    public BSF(Node root) {
        this.root = root;
    }

    public BSF(){

    }

    @Override
    public void tree_insertion(Node z) {
        Node x = getRoot();
        Node y = null;
        while (x != null){
            y = x;
            if (z.getKey() < x.getKey()){
                x = x.getLeft();
            }else {
                x = x.getRight();
            }
        }
        z.setP(y);
        insertion_condition(y, z);
    }


    @Override
    public void tree_recursive_insertion(Node z){
        recursive_tree_insertion(getRoot(),null,z);
    }

    private void recursive_tree_insertion(Node x,Node y,Node z){
        if (x != null){
            y = x;
            if (z.getKey() < x.getKey()){
                x = x.getLeft();
            }else {
                x = x.getRight();
            }
            recursive_tree_insertion(x,y,z);
            return;
        }
        z.setP(y);
        insertion_condition(y, z);
        //return;
    }

    private void insertion_condition(Node y, Node z) {
        if (y == null){
            setRoot(z); //if tree were empty
        }else if (z.getKey() < y.getKey()){
            y.setLeft(z);
        }else {
            y.setRight(z);
        }
    }

    @Override
    public void inOrder(){
        inOrder_traversal(this.root);
    }

    @Override
    public void inOrder_traversal(Node x){
        if (x != null){
            inOrder_traversal(x.getLeft());
            System.out.println(x.getKey());
            inOrder_traversal(x.getRight());
        }
    }

    @Override
    public Node tree_search(int key) {
        return iterative_tree_search(getRoot(), key);
    }

    private Node iterative_tree_search(Node x, int key){
        while(x != null && x.getKey() != key){
            if(x.getKey() > key){
                x = x.getLeft();
            }else {
                x = x.getRight();
            }
        }
        return x;
    }

    @Override
    public Node tree_recursive_search(int key) {
        return recursive_tree_search(getRoot(), key);
    }

    private Node recursive_tree_search(Node x, int key){
        if (x == null || x.getKey() == key) {
            return x;
        }

        if (x.getKey() > key){
            return recursive_tree_search(x.getLeft(), key);
        }else {
            return recursive_tree_search(x.getRight(), key);
        }
    }

    @Override
    public Node tree_minimum(){
        Node z = getRoot();
        while (z.getLeft() != null) {
            z = z.getLeft();
        }

        return z;
    }

    @Override
    public Node tree_maximum() {
        Node z = getRoot();
        while (z.getRight() != null) {
            z = z.getRight();
        }

        return z;
    }

    public Node subtree_minimum(Node x) {
        while (x.getLeft() != null) {
            x = x.getLeft();
        }
        return x;
    }

    public Node subtree_maximum(Node x) {
        while (x.getRight() != null) {
            x = x.getRight();
        }
        return x;
    }

    @Override
    public Node tree_successor(Node x) {
        if (x.getRight() != null){
            return subtree_minimum(x.getRight());
        }

        Node y = x.getP();

        while (y != null && x == y.getRight()) {
            x = y;
            y = y.getP();
        }
        return y;
    }

    @Override
    public Node tree_predecessor(Node x) {
        if (x.getLeft() != null) {
            return subtree_maximum(x.getLeft());
        }

        Node y = x.getP();

        while (y != null && x == y.getLeft()){
            x = y;
            y = y.getP();
        }

        return y;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
}
