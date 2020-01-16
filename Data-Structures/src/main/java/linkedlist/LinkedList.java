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

    public static LinkedList zipper(LinkedList ll1, LinkedList ll2) {
        LinkedList ll3 = new LinkedList();
        int size = ll2.size() ;
        for (int i = 0; i < size; i++) {
            ll3.append(ll1.head.value);
            ll3.append(ll2.head.value);

            ll1.head = ll1.head.nextNode;
            ll2.head = ll2.head.nextNode;
        }
        return ll3;
    }

    public static void main(String[] args){
        LinkedList ll1 = new LinkedList();
        ll1.append(6);
        ll1.append(11);
        ll1.append(88);

        LinkedList ll2 = new LinkedList();
        ll2.append(7);
        ll2.append(93);
        ll2.append(5);
        ll2.append(3);

        System.out.println(zipper(ll1,ll2));
    }
}