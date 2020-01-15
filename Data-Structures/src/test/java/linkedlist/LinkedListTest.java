package linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedList test;


    @Before
    public void setUp() throws Exception {
        test = new LinkedList();
        test.insertHead(15);
        test.insertHead(9);
        test.insertHead(66);
        test.insertHead(31);
    }

    @Test
    public void emptyLinkedList_test(){
        test = new LinkedList();
        Node actual = test.head;
        Assert.assertNull(actual);
    }

    @Test
    public void insertHead_test() {
        int expected = 31;
        int actual = test.head.value;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void includes_test() {
        boolean expected = true;
        boolean actual = test.includes(66);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doesntInclude_test(){
        boolean expected = false;
        boolean actual = test.includes(1234);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString_test() {
        String expected = "{31} -> {66} -> {9} -> {15} -> NULL";
        String actual = test.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void append_test() {
        test.append(3);
        String expected = "{31} -> {66} -> {9} -> {15} -> {3} -> NULL";
        String actual = test.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insertAfter_test() {
        test.insertAfter(999,66);
        String expected = "{31} -> {66} -> {999} -> {9} -> {15} -> NULL";
        String actual = test.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size_test() {
        int expected = 4;
        int actual = test.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void kthFromEnd_test() {
        int expected = 66;
        int actual = test.kthFromEnd(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void linkedListSizeOne_test() {
        LinkedList test2 = new LinkedList();
        test2.insertHead(3);
        int expected = 3;
        int actual = test2.kthFromEnd(0);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void kIsGreaterThanLength_test() {
        LinkedList test2 = new LinkedList();
        test2.kthFromEnd(3);
    }

    @Test(expected = Exception.class)
    public void kIsSameSizeAsLength_test(){
        test.kthFromEnd(test.size());
    }

    @Test(expected = Exception.class)
    public void kIsNotPositive_test(){
        test.kthFromEnd(-2);
    }


}