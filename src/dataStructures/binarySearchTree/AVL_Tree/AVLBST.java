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

    private AVLNode leftRotation(AVLNode x) {
        AVLNode y = (AVLNode) x.getRight();
        AVLNode tmp = (AVLNode) y.getLeft();

        //Rotation
        y.setLeft(x);
        x.setRight(tmp);

        //set Parents
        y.setP(x.getP());
        x.setP(y);

        if (tmp != null) {
            tmp.setP(x);
        }

        //update heights
        updateHeight(x);

        updateHeight(y);

        return y;
    }

    private AVLNode rightRotation(AVLNode y) {
        AVLNode x = (AVLNode) y.getLeft();
        AVLNode tmp = (AVLNode) x.getRight();

        //Rotation
        x.setRight(y);
        y.setLeft(tmp);

        //set Parents
        x.setP(y.getP());
        y.setP(x);

        if (tmp != null) {
            tmp.setP(y);
        }

        //update heights
        updateHeight(y);

        updateHeight(x);

        return x;
    }

    public void tree_recursive_insertion(AVLNode z) {
        AVLNode newRoot = recursive_tree_insertion((AVLNode)
                this.binarySearchTree.getRoot(), z);

        getBinarySearchTree().setRoot(newRoot);
    }

    private AVLNode recursive_tree_insertion(AVLNode x, AVLNode z) {

        if (this.binarySearchTree.getRoot() == null) {
            this.binarySearchTree.setRoot(z);
            return z;
        }

        if (x != null) {
            if (z.getKey() < x.getKey()) {
                x.setLeft(recursive_tree_insertion((AVLNode) x.getLeft(), z));
                x.getLeft().setP(x);
            } else {
                x.setRight(recursive_tree_insertion((AVLNode) x.getRight(), z));
                x.getRight().setP(x);
            }

            //update height of ancestor
            updateHeight(x);

            int balanceFactor = getBalanceFactor(x);
            //System.out.println("key " + x.getKey() + " balance " + balanceFactor);


            if (balanceFactor > 1 && z.getKey() < x.getLeft().getKey()) {
                //left left case
                System.out.println("left left");
                return rightRotation(x);
            }else if (balanceFactor < -1 && z.getKey() >= x.getRight().getKey()){
                //right right case
                System.out.println("right right");
                return leftRotation(x);
            }else if (balanceFactor > 1 && z.getKey() >= x.getLeft().getKey()) {
                System.out.println("left right");
                x.setLeft(leftRotation((AVLNode) x.getLeft()));
                return rightRotation(x);
            }else if (balanceFactor < -1 && z.getKey() < x.getRight().getKey()) {
                System.out.println("right left");
                x.setRight(rightRotation((AVLNode) x.getRight()));
                return leftRotation(x);
            }

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
            if (x.getP() != null){
                System.out.println(x.getP().getKey());
            }
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
