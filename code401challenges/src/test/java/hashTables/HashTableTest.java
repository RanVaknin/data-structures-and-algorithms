package hashTables;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    String story1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String story2 = "Once upon a time, there was a brave princess who...";
    String story3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    HashTable test = new HashTable();
    HashTable test2 = new HashTable();
    CodeChallengeHashMaps test3 = new CodeChallengeHashMaps();


    @Before
    public void setup(){
        test.put("ran", "vaknin");
        test.put("nar", "vaknin");
        // these two lines will create a collision and will be handled by a for loop in my put method.

        test.put("ruby", "dog");
    }

    @Test
    public void put_test() {
        assertEquals("vaknin",test.get("ran"));

    }

    @Test
    public void get_test() {
        assertEquals("dog",test.get("ruby"));

        // collision in this cell
        assertEquals("vaknin", test.get("ran"));
    }

    @Test
    public void EmptyHashTable_test(){
        assertNull(test2.get("ruby"));
        assertNull(test.get("ginger"));
    }

    @Test
    public void contains_test() {
        assertTrue(test.contains("ruby"));
        assertTrue(test.contains("ran"));
        assertFalse(test.contains("sad"));
    }

    @Test
    public void firstOccurance_test(){
        assertEquals("it",test3.firstOccuringString(story1));
        assertEquals("a",test3.firstOccuringString(story2));
        assertEquals("summer",test3.firstOccuringString(story3));
        assertEquals("",test3.firstOccuringString(""));


    }

}