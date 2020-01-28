package tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {

    Tree<Node> tree = new Tree<>();
    Tree<Node> tree2 = new Tree<>();

    @Before
    public void setup(){
        tree.root = new Node(1);
        tree.root.left = new Node(7);
        tree.root.left.left = new Node(33);
        tree.root.left.right = new Node(17);
        tree.root.left.left.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.left = new Node(3);
    }
    @Test
    public void traversePreOrder() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(7);
        expected.add(33);
        expected.add(4);
        expected.add(17);
        expected.add(5);
        expected.add(3);
        expected.add(8);
        ArrayList<Node> actual = tree.traversePreOrder();
        assertEquals(expected,actual);
    }

    @Test
    public void traverseInOrder() {
        System.out.println(tree.traverseInOrder());
        int[] outputarray = new int[]{33, 4, 7, 17, 1, 3, 5, 8};


    }

    @Test
    public void traversePostOrder() {
    }

    @Test
    public void test_emptyTree(){
        assertNull(tree2.root);
    }

    @Test
    public void test_singleRootTree(){
        tree2.root = new Node(19);
        assertTrue(tree2.root.left == null && tree2.root.right == null);
    }

    @Test
    public void test_leftAndRightAdd(){
        tree2.root = new Node(19);
        tree2.root.left = new Node(99);
        tree2.root.right = new Node(11);
        assertEquals(99,tree2.root.left.value);
        assertEquals(11,tree2.root.right.value);

    }
}