//package tree;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.*;
//
//public class TreeTest {
//
//    Tree<Node> tree = new Tree<>(new Node(1));
//
////    @Before
////    public void setup(){
////
////    }
//    @Test
//    public void traversePreOrder() {
//        tree.root.left = new Node(7);
//        tree.root.left.left = new Node(33);
//        tree.root.left.right = new Node(17);
//        tree.root.left.left.right = new Node(4);
//        tree.root.right = new Node(5);
//        tree.root.right.right = new Node(8);
//        tree.root.right.left = new Node(3);
//        System.out.println(tree.traversePreOrder());
//    }
//
//    @Test
//    public void traverseInOrder() {
//        tree.root.left = new Node(7);
//        tree.root.left.left = new Node(33);
//        tree.root.left.right = new Node(17);
//        tree.root.left.left.right = new Node(4);
//        tree.root.right = new Node(5);
//        tree.root.right.right = new Node(8);
//        tree.root.right.left = new Node(3);
//        System.out.println(tree.traverseInOrder());
//    }
//
//    @Test
//    public void traversePostOrder() {
//        tree.root.left = new Node(7);
//        tree.root.left.left = new Node(33);
//        tree.root.left.right = new Node(17);
//        tree.root.left.left.right = new Node(4);
//        tree.root.right = new Node(5);
//        tree.root.right.right = new Node(8);
//        tree.root.right.left = new Node(3);
//        System.out.println(tree.traversePostOrder());
//    }
//}
