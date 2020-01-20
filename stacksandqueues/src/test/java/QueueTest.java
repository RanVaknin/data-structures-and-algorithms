import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;

    @Before
    public void setup() {
        queue = new Queue();
        queue.enqueue("Americano");
        queue.enqueue("Macchiato");
        queue.enqueue("Latte");


    }

    @Test
    public void test_enqueue() {
        String expected1 = "Latte";
        String actual1 = queue.front.next.next.value;
        Assert.assertEquals(expected1,actual1);
        queue.enqueue("Espresso");
        String expected2 = "Espresso";
        String actual2 = queue.front.next.next.next.value;
        Assert.assertEquals(expected2,actual2);


    }

    @Test
    public void test_dequeue() {
        String actual1 = queue.dequeue();
        String expected1 = "Americano";
        Assert.assertEquals(expected1,actual1);

        String expected2 = "Macchiato";
        String actual2 = queue.front.value;
        Assert.assertEquals(expected2,actual2);
    }

    @Test(expected = Exception.class)
    public void test_dequeueEmpty() {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }

    @Test
    public void test_peek() {
        String peeked = queue.peek();
        String expected1 = "Americano";
        String actual1 = peeked;
        Assert.assertEquals(expected1, actual1);

        queue.dequeue();
        String peeked2 = queue.peek();
        String expected2 = "Macchiato";
        String actual2 = peeked2;
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void test_isEmpty() {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        Assert.assertTrue(queue.isEmpty());
    }
}