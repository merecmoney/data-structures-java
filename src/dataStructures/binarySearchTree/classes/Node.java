
package dataStructures.binarySearchTree.classes;

public class Node {
    private int key; // Node's id
    private String data;
    private Node left; //right child
    private Node right; //left child
    private Node p; // Node's parent

    public Node(int key){
        setKey(key);
    }

    public Node(int key, String data) {
        this.key = key;
        this.data = data;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setP(Node p) {
        this.p = p;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getP() {
        return p;
    }

     @Override
    public String toString(){
        return  "Node with key: " + getKey() + " data: " + getData();
    }
}
