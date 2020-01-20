import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack stack;

    @Before
    public void setup() {
        stack = new Stack();
        stack.push("Banana");
        stack.push("Apple");
        stack.push("Pear");
    }

    @Test
    public void test_push() {
        String expected1 = "Pear";
        String actual1 = stack.top.value;
        Assert.assertEquals(expected1, actual1);

        String expected2 = "Apple";
        String actual2 = stack.top.next.value;
        Assert.assertEquals(expected2, actual2);

        String expected3 = "Banana";
        String actual3 = stack.top.next.next.value;
        Assert.assertEquals(expected3, actual3);
    }


    @Test
    public void test_pop() {
        String popped = stack.pop();
        String expected1 = "Apple";
        String actual1 = stack.top.value;
        Assert.assertEquals(expected1, actual1);

        String expected2 = "Pear";
        String actual2 = popped;
        Assert.assertEquals(expected2, actual2);
    }

    @Test(expected = Exception.class)
    public void test_popEmpty() {
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    @Test
    public void test_peek() {
        String peeked = stack.peek();
        String expected1 = "Pear";
        String actual1 = peeked;
        Assert.assertEquals(expected1, actual1);

        stack.pop();
        String peeked2 = stack.peek();
        String expected2 = "Apple";
        String actual2 = peeked2;
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void test_isEmpty() {
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }
}