package tree;

public class Node {
    Integer value;
    String data;
    Node left;
    Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public Node(String data) {
        this.data = data;
    }
}
