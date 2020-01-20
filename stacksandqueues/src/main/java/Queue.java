public class Queue {
    Node front;

    public void enqueue(String input) {
        Node newNode = new Node(input);
        if(this.front == null){
            this.front = newNode;
        }else {
        Node temp = this.front;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        }
    }

    public String dequeue(){
        if(this.front == null){
            throw new NullPointerException("--->>> QUEUE IS EMPTY!!! <<<---");
        } else {
        Node temp = this.front;
        this.front = this.front.next;
        return temp.value;
        }
    }

    public String peek() {
        return this.front.value;
    }

    public boolean isEmpty() {
        return (this.front == null);
    }
}
