package code401challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GraphTest {
    Graph test;
    Graph test2;
    @Before
    public void setup(){
        test = new Graph();
        test.addNode("alpha");
        test.addNode("bravo");

        test2 = new Graph();
        test2.addNode("lambda");
        test2.addNode("omega");
        test2.addNode("kappa");
    }

    @Test
    public void addNodeAndSize() {
        test.addNode("charlie");
        assertEquals(3,test.size());
    }

    @Test
    public void addEdge() throws IllegalAccessException {
        test.addEdge("alpha","bravo",3);
        Assert.assertEquals("{Node: bravo=3}",test.getNeighbors("alpha").toString());

    }
    @Test
    public void addEdge2() throws IllegalAccessException {
        test2.addEdge("lambda","kappa",71);
        test2.addEdge("lambda","omega",7);
        Assert.assertEquals("{Node: kappa=71, Node: omega=7}",test2.getNeighbors("lambda").toString());
    }


    @Test
    public void getNodes() {
        test.addNode("gamma");
        test.addNode("delta");
        assertEquals(4, test.getNodes().size());
    }
    
}