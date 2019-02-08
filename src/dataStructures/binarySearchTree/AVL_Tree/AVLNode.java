package dataStructures.binarySearchTree.AVL_Tree;

import dataStructures.binarySearchTree.classes.Node;

public class AVLNode extends Node {
    private int height;

    public AVLNode (int key) {
        super(key);
        this.setHeight(1);
    }

    public AVLNode (int key, String data) {
        super(key, data);
        this.setHeight(1);
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public int getHeight () {
        return this.height;
    }

    @Override
    public String toString(){
        return  "Node with key: " + getKey() + " data: " + getData() +
                "\n" + "Height " + getHeight();
    }
}
