package tree;

import java.util.ArrayList;

public class Tree<T> {
    Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public ArrayList<T> traversePreOrder() {
        return traversePreOrder(this.root, new ArrayList<>());
    }

    private ArrayList<T> traversePreOrder(Node<T> root, ArrayList<T> order) {
        if (root == null) {
            return order;
        } else {
            order.add(root.value);
            traversePreOrder(root.left, order);
            traversePreOrder(root.right, order);
        }
        return order;
    }

    public ArrayList<T> traverseInOrder() {
        return traverseInOrder(this.root, new ArrayList<>());
    }


    private ArrayList<T> traverseInOrder(Node<T> root, ArrayList<T> order) {
        if (root == null) {
            return order;
        } else {
            traversePreOrder(root.left, order);
            order.add(root.value);
            traversePreOrder(root.right, order);
        }
        return order;
    }


    public ArrayList<T> traversePostOrder() {
        return traversePostOrder(this.root, new ArrayList<>());
    }

    private ArrayList<T> traversePostOrder(Node<T> root, ArrayList<T> order) {
        if (root == null) {
            return order;
        } else {
            traversePreOrder(root.left, order);
            traversePreOrder(root.right, order);
            order.add(root.value);
        }
        return order;
    } 
}

