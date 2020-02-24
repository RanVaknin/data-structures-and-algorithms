package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    TreeIntersection ti = new TreeIntersection();
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

    @Test
    public void treeIntersctionTest(){
        Node node = new Node(150);

        node.left = new Node(100);
        node.left.left = new Node(75);
        node.left.right = new Node(160);
        node.left.right.right = new Node(175);
        node.left.right.left = new Node(125);

        node.right = new Node(250);
        node.right.left = new Node(200);
        node.right.right = new Node(350);
        node.right.right.right = new Node(500);
        node.right.right.left = new Node(300);

        Node node2 = new Node(42);

        node2.left = new Node(100);
        node2.left.left = new Node(15);
        node2.left.right = new Node(160);
        node2.left.right.left = new Node(125);
        node2.left.right.right = new Node(175);

        node2.right = new Node(600);
        node2.right.left = new Node(200);
        node2.right.right = new Node(350);
        node2.right.right.left = new Node(4);
        node2.right.right.right = new Node(500);

        System.out.println(ti.treeIntersection(node,node2));

    }

}