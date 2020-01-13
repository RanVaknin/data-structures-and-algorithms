package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void insertHeadTest() {
        LinkedList test = new LinkedList();
        test.insertHead(3);
        test.insertHead(11);
        test.insertHead(9);
        LinkedList input = test;
        int expected = 9;
        int actual = input.head.value;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void includesTest() {
        LinkedList test = new LinkedList();
        test.insertHead(15);
        test.insertHead(9);
        test.insertHead(66);
        test.insertHead(31);
        LinkedList input = test;
        boolean expected = true;
        boolean actual = input.includes(66);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToStringTest() {
        LinkedList test = new LinkedList();
        test.insertHead(31);
        test.insertHead(66);
        test.insertHead(9);
        test.insertHead(16);
        LinkedList input = test;
        String expected = "{16} -> {9} -> {66} -> {31} -> NULL";
        String actual = input.toString();
        Assert.assertEquals(expected,actual);
    }
}