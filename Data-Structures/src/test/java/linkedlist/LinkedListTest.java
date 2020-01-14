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
    public void insertHeadTest() {
        LinkedList input = test;
        int expected = 31;
        int actual = input.head.value;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void includesTest() {
        boolean expected = true;
        boolean actual = test.includes(66);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToStringTest() {
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


}