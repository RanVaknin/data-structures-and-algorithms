package tree;

import java.util.ArrayList;

public class TreeIntersection {

    public ArrayList<Integer> treeIntersection(Node n1, Node n2) {
        return helperIntersection(n1,n2,new ArrayList<>());
    }

    private ArrayList<Integer> helperIntersection(Node n1, Node n2, ArrayList<Integer> result) {
        //traverse and add all values of tree to first array
        // traverse and all all values to tree to second array.
        // iterate over the 2 arrays checking if each value contains
        ArrayList<Integer> leftTree = traversePostOrder(n1);
        ArrayList<Integer> rightTree = traversePostOrder(n2);
        for(Integer value : leftTree){
            if(rightTree.contains(value)){
                result.add(value);
            }
        }
        return result;
    }


    public ArrayList<Integer> traversePostOrder(Node n1) {
        return traversePostOrder(n1, new ArrayList<>());
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


    public void addOne(Node root) {
        if (root != null) {
            root.value++;
            addOne(root.left);
            addOne(root.right);
        }
    }

}
