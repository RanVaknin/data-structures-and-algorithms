package hashTables;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    HashTable test = new HashTable();
    HashTable test2 = new HashTable();


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

}