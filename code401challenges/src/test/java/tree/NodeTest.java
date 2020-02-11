package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    Solution solution = new Solution();

    @Test
    public void test_contains(){
        Node node = new Node(30);
            node.right = new Node(86);
                node.right.left = new Node(55);
                node.right.right = new Node(115);
            node.left = new Node(18);
                node.left.left = new Node(6);
                node.left.right = new Node(24);

        assertFalse(node.contains(5));
    }

    @Test
    public void test_add(){
        Node node = new Node(30);
        node.right = new Node(86);
        node.right.left = new Node(55);
        node.right.right = new Node(115);
        node.left = new Node(18);
        node.left.left = new Node(6);
        node.left.right = new Node(24);

        solution.insertIntoBST(node,5);

    }

    @Test
    public void test_collectSmall(){
        Node node = new Node(30);
        node.right = new Node(86);
        node.right.left = new Node(55);
        node.right.right = new Node(115);
        node.left = new Node(18);
        node.left.left = new Node(6);
        node.left.right = new Node(24);

        System.out.println(node.collectSmall(100));

    }

}