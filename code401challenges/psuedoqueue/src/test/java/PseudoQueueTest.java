import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue<Integer> pseudoQueue;

    @Before
    public void setup() {
        pseudoQueue = new PseudoQueue<>();
        pseudoQueue.stack = new Stack<>();
    }

    @Test
    public void test_enqueue() {
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(55);
        assertEquals(3, pseudoQueue.deque().intValue());
        pseudoQueue.enqueue(777);
        pseudoQueue.enqueue(99);
        pseudoQueue.enqueue(353);
        assertEquals(55, pseudoQueue.deque().intValue());
        assertEquals(777, pseudoQueue.deque().intValue());

    }

    @Test(expected = NullPointerException.class)
    public void test_emptyQueDeque() {
        pseudoQueue.deque();
    }

    @Test
    public void test_deque() {
        pseudoQueue.enqueue(99);
        assertEquals(99, pseudoQueue.deque().intValue());

    }
}