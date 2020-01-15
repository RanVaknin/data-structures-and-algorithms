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
        Node node = this.head;
        while (node.nextNode != null) {
            if (node.value != valueToCheck) {
                node = node.nextNode;
            } else {
                return true;
            }
        }
        return false;
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
        } else {
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

    public int size() {
        Node current = this.head;
        if (current == null) {
            throw new NullPointerException(" --->>>  List is empty! <<<---  \n");
        } else {
            int size = 0;
            while (current != null) {
                size++;
                current = current.nextNode;
            }
            return size;
        }
    }

    public int kthFromEnd(int k) {
        Node temp = this.head;
        int size = this.size();
        int counter = 1;
        int delta = size - k;
        while (temp != null) {
            if (counter == delta) {
                return temp.value;
            }
            temp = temp.nextNode;
            counter++;
        }
        throw new NullPointerException(" @@@--->>> INDEX NOT FOUND! <<<---@@@  \n");
    }
}