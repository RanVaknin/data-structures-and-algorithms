package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public boolean contains(int input) {
        if (value == input) {
            return true;
        }
        if (input > value) {
            if (right != null) {
                return right.contains(input);
            } else {
                return false;
            }
        } else if (input < value) {
            if (left != null) {
                return left.contains(input);
            } else {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> collectSmall(int input) {
        return collectSmall(input, new ArrayList<>());
    }

    private ArrayList<Integer> collectSmall(int input, ArrayList<Integer> smallList) {
        if (this.value < input) {
            smallList.add(this.value);
        }
        if (this.right != null && this.left != null) {
            this.right.collectSmall(input, smallList);
            this.left.collectSmall(input, smallList);
        }
        return smallList;
    }
}
