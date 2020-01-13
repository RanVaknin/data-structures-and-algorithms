package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;

    }
    public void insertHead(int valueToInsert){
        Node newNode = new Node(valueToInsert);
        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.nextNode = this.head;
            this.head = newNode;

        }
    }
    public boolean includes(int valueToCheck){
        boolean result = false;
        Node node = this.head;
        while(node.nextNode != null){
            if(node.value != valueToCheck){
                node = node.nextNode;
            } else{
                result = true;
                return true;
            }
        }
        return result;
    }

    public String toString(){
        String linkedListVisualizer = "";
        Node current = this.head;
        while(current != null){
            linkedListVisualizer += "{" + current.value + "} -> ";
            current = current.nextNode;
        }
        return linkedListVisualizer += "NULL";
    }
}