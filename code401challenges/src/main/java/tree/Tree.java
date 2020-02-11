//package tree;
//
//import java.util.ArrayList;
//
//public class Tree<T> {
//    Node<T> root;
//
//    public Tree(Node<T> root) {
//        this.root = root;
//    }
//
//    public ArrayList<T> traversePreOrder() {
//        return traversePreOrder(this.root, new ArrayList<>());
//    }
//
//    private ArrayList<T> traversePreOrder(Node<T> root, ArrayList<T> order) {
//        if (root == null) {
//            return order;
//        } else {
//            order.add(root.value);
//            traversePreOrder(root.left, order);
//            traversePreOrder(root.right, order);
//        }
//        return order;
//    }
//
//    public ArrayList<T> traverseInOrder() {
//        return traverseInOrder(this.root, new ArrayList<>());
//    }
//
//
//    private ArrayList<T> traverseInOrder(Node<T> root, ArrayList<T> order) {
//        if (root == null) {
//            return order;
//        } else {
//            traversePreOrder(root.left, order);
//            order.add(root.value);
//            traversePreOrder(root.right, order);
//        }
//        return order;
//    }
//
//
//    public ArrayList<T> traversePostOrder() {
//        return traversePostOrder(this.root, new ArrayList<>());
//    }
//
//    private ArrayList<T> traversePostOrder(Node<T> root, ArrayList<T> order) {
//        if (root == null) {
//            return order;
//        } else {
//            traversePreOrder(root.left, order);
//            traversePreOrder(root.right, order);
//            order.add(root.value);
//        }
//        return order;
//    }
//}
//
package tree;

import java.util.ArrayList;

public class Tree {
    Node root;
    Node2<Integer> root2;


    public ArrayList<Integer> traversePreOrder() {
        return traversePreOrder(this.root, new ArrayList<>());
    }

    private ArrayList<Integer> traversePreOrder(Node root, ArrayList<Integer> order) {
        if (root == null) {
            return order;
        } else {
            order.add(root.value);
            traversePreOrder(root.left, order);
            traversePreOrder(root.right, order);
        }
        return order;
    }

    public ArrayList<Integer> traverseInOrder() {
        return traverseInOrder(this.root, new ArrayList<>());
    }


    private ArrayList<Integer> traverseInOrder(Node root, ArrayList<Integer> order) {
        if (root == null) {
            return order;
        } else {
            traverseInOrder(root.left, order);
            order.add(root.value);
            traverseInOrder(root.right, order);
        }
        return order;
    }


    public ArrayList<Integer> traversePostOrder() {
        return traversePostOrder(this.root, new ArrayList<>());
    }

    private ArrayList<Integer> traversePostOrder(Node root, ArrayList<Integer> order) {
        if (root == null) {
            return order;
        } else {
            traversePostOrder(root.left, order);
            traversePostOrder(root.right, order);
            order.add(root.value);
        }
        return order;
    } 
}


    public int findMax() {
        return findMax(this.root);
    }

    private int findMax(Node root) {
        int max = root.value;
        if (root.left != null) {
            int leftMax = findMax(root.left);
            if (leftMax > max) {
                max = leftMax;
            }
        }
        if (root.right != null) {
            int rightMax = findMax(root.right);
            if (rightMax > max) {
                max = rightMax;
            }
        }
        return max;
    }

}