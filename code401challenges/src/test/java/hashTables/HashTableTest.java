package hashTables;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class HashTableTest {
    String story1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String story2 = "Once upon a time, there was a brave princess who...";
    String story3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    HashTable test = new HashTable();
    HashTable test2 = new HashTable();
    Hashtable<String,String> test4;
    Hashtable<String,String> test5;

    CodeChallengeHashMaps hm = new CodeChallengeHashMaps();



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
        assertEquals("it", hm.firstOccuringString(story1));
        assertEquals("a", hm.firstOccuringString(story2));
        assertEquals("summer", hm.firstOccuringString(story3));
        assertEquals("", hm.firstOccuringString(""));
    }

    @Test
    public void joinLeft_test(){
        test4 = new Hashtable<>();
        test5 = new Hashtable<>();
        test5.put("hello", "robin");
        test5.put("mint","chocolate");
        test5.put("cloak", "dagger");
        test4.put("hello","django");
        test4.put("oat","raisins");
        test4.put("cloak","cape");

        System.out.println(hm.leftJoin(test5,test4));
    }

}