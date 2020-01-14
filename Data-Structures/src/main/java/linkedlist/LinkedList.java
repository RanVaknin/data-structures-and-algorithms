package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;

    }

    public void insertHead(int valueToInsert) {
        Node newNode = new Node(valueToInsert);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.nextNode = this.head;
            this.head = newNode;

        }
    }

    public boolean includes(int valueToCheck) {
        boolean result = false;
        Node node = this.head;
        while (node.nextNode != null) {
            if (node.value != valueToCheck) {
                node = node.nextNode;
            } else {
                result = true;
                return true;
            }
        }
        return result;
    }

    public String toString() {
        String linkedListVisualizer = "";
        Node current = this.head;
        while (current != null) {
            linkedListVisualizer += "{" + current.value + "} -> ";
            current = current.nextNode;
        }
        return linkedListVisualizer += "NULL";
    }

    public void append(int inputValue) {
        Node nodeToAdd = new Node(inputValue);
        if (this.head == null) {
            this.head = nodeToAdd;
        }else {
            Node current = this.head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = nodeToAdd;
        }
    }

    public void insertAfter(int inputValue, int valueToInsertAfter) {
        Node current = this.head;
        if (this.head.value == valueToInsertAfter) {
            Node temp = new Node(inputValue);
            temp.nextNode = this.head.nextNode;
            this.head.nextNode = temp;
        } else {
            while (current != null) {
                if (current.value == valueToInsertAfter) {
                    Node temp = new Node(inputValue);
                    temp.nextNode = current.nextNode;
                    current.nextNode = temp;
                    return;
                } else {
                    current = current.nextNode;
                }
            }
        }
    }
//    public static void main(String[] args){
//        LinkedList test = new LinkedList();
//        test.append(3);
//        test.append(5);
//        test.append(7);
//        test.append(2);
//        test.insertAfter(3,7);
//        System.out.println(test.toString());
//    }
}