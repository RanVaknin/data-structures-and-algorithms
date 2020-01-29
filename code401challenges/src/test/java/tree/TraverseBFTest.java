package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TraverseBFTest {

    TraverseBF<Integer> traverse = new TraverseBF<>();

    @Test
    public void traverseBreadthFirst() {
        Tree<Integer> tree = new Tree<>();

        tree.root = new Node<Integer>(1);
                 tree.root.left = new Node<Integer>(33);
                         tree.root.left.left = new Node<Integer>(9);
                         tree.root.left.right = new Node<Integer>(2);
                 tree.root.right = new Node<Integer>(7);
                        tree.root.right.left = new Node<Integer>(5);
                        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(33);
        expected.add(7);
        expected.add(9);
        expected.add(2);
        expected.add(5);

        assertEquals(expected,traverse.traverseBreadthFirst(tree));

    }
    @Test
    public void emptyTree_test() {
        Tree<Integer> tree2 = new Tree<>();
        ArrayList<Integer> actual = traverse.traverseBreadthFirst(tree2);
        assertEquals(new ArrayList<Integer>(),actual);
    }
    @Test
    public void oneNodeTree_test() {
        Tree<Integer> tree3 = new Tree<>();
        tree3.root = new Node<Integer>(5);

        ArrayList<Integer> actual = traverse.traverseBreadthFirst(tree3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        assertEquals( expected ,actual );
    }

}