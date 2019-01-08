package dataStructures.binarySearchTree.AVL_Tree;

import dataStructures.binarySearchTree.classes.BSF;

public class AVLBST {
    private BSF binarySearchTree;

    public AVLBST(AVLNode root) {
        this.binarySearchTree = new BSF(root);
    }

    public AVLBST() {
        this.binarySearchTree = new BSF();
    }

    public int height(AVLNode z) {
        if (z == null) {
            return 0;
        }
        return z.getHeight();
    }

    private void updateHeight(AVLNode z) {
        z.setHeight(Math.max(height((AVLNode) z.getLeft()),
                height((AVLNode) z.getRight())) + 1);
    }

    public int getBalanceFactor(AVLNode z) {
        if (z == null) {
            return 0;
        }
        return height((AVLNode) z.getLeft()) - height((AVLNode) z.getRight());
    }

    private void leftRotation(AVLNode x) {
        AVLNode y = (AVLNode) x.getRight();
        AVLNode tmp = (AVLNode) y.getLeft();

        //Rotation
        y.setLeft(x);
        x.setRight(tmp);

        //update heights
        updateHeight(x);

        updateHeight(y);
    }

    private void rightRotation(AVLNode y) {
        AVLNode x = (AVLNode) y.getLeft();
        AVLNode tmp = (AVLNode) x.getRight();

        //Rotation
        x.setRight(y);
        y.setLeft(tmp);

        //update heights
        updateHeight(y);

        updateHeight(x);
    }

    public void tree_recursive_insertion(AVLNode z) {
        recursive_tree_insertion((AVLNode) this.binarySearchTree.getRoot(), z);
    }

    private AVLNode recursive_tree_insertion(AVLNode x, AVLNode z) {

        if (this.binarySearchTree.getRoot() == null) {
            this.binarySearchTree.setRoot(z);
            return z;
        }

        if (x != null) {
            if (z.getKey() < x.getKey()) {
                x.setLeft(recursive_tree_insertion((AVLNode) x.getLeft(), z));
            } else {
                x.setRight(recursive_tree_insertion((AVLNode) x.getRight(), z));
            }
            z.setP(x);

            //update height of ancestor
            updateHeight(x);

            return x;
        }
        return z;
    }

    public void preOrder() {
        preOrder_traversal((AVLNode) this.getBinarySearchTree().getRoot());
    }

    private void preOrder_traversal(AVLNode x) {
        if (x != null) {
            System.out.println(x);
            preOrder_traversal((AVLNode) x.getLeft());
            preOrder_traversal((AVLNode) x.getRight());
        }
    }

    public void setBinarySearchTree(BSF binarySearchTree) {
        this.binarySearchTree = binarySearchTree;
    }

    public BSF getBinarySearchTree() {
        return this.binarySearchTree;
    }
}
