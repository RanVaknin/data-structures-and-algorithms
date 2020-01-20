public class Stack {
    Node top;

    public void push(String input) {
        Node newNode = new Node(input);
        // newNode's next point to the top of the stack.
        newNode.next = this.top;
        this.top = newNode;
    }

    public String pop() {
        if(this.top == null){
            throw new NullPointerException("--->>> STACK IS EMPTY!!! <<<---");
        } else {
        Node temp = this.top;
        this.top = this.top.next;
        return temp.value;
        }
    }

    public String peek() {
        return this.top.value;
    }

    public boolean isEmpty() {
        return (this.top == null);
    }



}
