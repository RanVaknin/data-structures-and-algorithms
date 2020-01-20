public class Queue {
    Node front;
    Node back;

    public void enqueue(String input) {
        Node newNode = new Node(input);
        if (this.front == null && back == null) {
            this.front = newNode;
            this.back = newNode;
        } else {
           this.back.next = newNode;
           this.back = this.back.next;
        }
    }

    public String dequeue() {
        if (this.isEmpty()) {
            throw new NullPointerException("--->>> QUEUE IS EMPTY!!! <<<---");

        } else if (front == back) {
            String temp = this.front.value;
            this.front = null;
            this.back = null;
            return temp;
        }
        String temp = this.front.value;
        this.front = this.front.next;
        return temp;
    }


    public String peek() {
        return this.front.value;
    }

    public boolean isEmpty() {
        return (this.front == null);
    }
}
