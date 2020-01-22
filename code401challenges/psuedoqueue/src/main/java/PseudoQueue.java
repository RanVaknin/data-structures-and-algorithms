import java.util.Stack;

public class PseudoQueue<T> {
    public Stack<T> stack;

    public PseudoQueue() {
        this.stack = new Stack<>();

    }

    public void enqueue(T input) {
        if (stack.isEmpty()) {
            stack.push(input);
        } else {
            stack.push(input);
            Stack<T> stack2 = new Stack<>();
            while (!stack.isEmpty()) {
                T temp = stack.pop();
                stack2.push(temp);
            }
            while (!stack2.isEmpty()) {
                T temp = stack2.pop();
                stack.push(temp);
            }
        }
    }

    public T deque() {
        if (stack == null || stack.isEmpty()) {
            throw new NullPointerException("EMPTY QUEUE");
        } else {
            Stack<T> stack2 = new Stack<>();
            while (!stack.isEmpty()) {
                T temp = stack.pop();
                stack2.push(temp);
            }
            T returnValue = stack2.pop();
            while (!stack2.isEmpty()) {
                T temp = stack2.pop();
                stack.push(temp);
            }
            return returnValue;
        }
    }
}
