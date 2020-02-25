package code401challenges;

import java.lang.reflect.Array;
import java.util.*;

public class Graph {

    protected static class Node {
        private String value;

        public Node(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node: " + value;
        }
    }


    protected Map<String, Node> nodes = new HashMap<>();
    protected Map<Node, HashMap<Node, Integer>> neighbors = new HashMap<>();

    public void addNode(String value) {
        Node node = new Node(value);
        nodes.putIfAbsent(value, node);
        neighbors.putIfAbsent(node, new HashMap<>());
    }

    public void addEdge(String from, String to) throws IllegalAccessException {
        Node fromNode = nodes.get(from);
        if (from == null) {
            throw new IllegalAccessException("Node does not exist in graph!");
        }
        Node toNode = nodes.get(to);
        if (to == null) {
            throw new IllegalAccessException("Node does not exist in graph!");
        }

        neighbors.get(fromNode).put(toNode, null);
        neighbors.get(toNode).put(fromNode, null);
    }

    // with weight
    public void addEdge(String from, String to, int weight) throws IllegalAccessException {
        Node fromNode = nodes.get(from);
        if (from == null) {
            throw new IllegalAccessException("Node does not exist in graph!");
        }
        Node toNode = nodes.get(to);
        if (to == null) {
            throw new IllegalAccessException("Node does not exist in graph!");
        }

        neighbors.get(fromNode).put(toNode, weight);
        neighbors.get(toNode).put(fromNode, weight);
    }

    public Collection<Node> getNodes() {
        return nodes.values();
    }

    public HashMap<Node, Integer> getNeighbors(String input){
        Set<Node> keys = neighbors.keySet();
        for (Node node : keys) {
            if (node.value.equals(input)) {
                return neighbors.get(node);
            }
        }
        return null;
    }

    public int size() {
        return nodes.size();
    }

    public void print() {
        for (Node node : neighbors.keySet()) {
            HashMap<Node, Integer> targets = neighbors.get(node);
            if (!targets.isEmpty()) {
                System.out.println(node + "is connected to " + targets);
            }
        }
    }

}
