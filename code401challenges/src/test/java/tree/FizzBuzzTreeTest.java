package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    FizzBuzzTree testmethod = new FizzBuzzTree();
    Tree tree = new Tree();

    @Test
    public void test_fizzBuzzTree() {
        tree.root2 = new Node2<>(1);
                tree.root2.left = new Node2<>(7);
                        tree.root2.left.left = new Node2<>(33);
                                tree.root2.left.left.right = new Node2<>(4);
                        tree.root2.left.right = new Node2<>(17);

                tree.root2.right = new Node2<>(5);
                        tree.root2.right.right = new Node2<>(8);
                        tree.root2.right.left = new Node2<>(3);

    }
}