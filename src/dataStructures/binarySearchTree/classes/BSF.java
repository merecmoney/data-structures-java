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

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
}
