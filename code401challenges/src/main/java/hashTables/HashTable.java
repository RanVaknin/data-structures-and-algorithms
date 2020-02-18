package hashTables;

import java.util.LinkedList;

public class HashTable {
    private int size = 16;
    private LinkedList<Entry>[] wrapperArray = new LinkedList[size];

    public int hashKey(String key) {
        int result = 0;
        for (int i = 0; i < key.length(); i++) {
            int asciiVal = (int) key.charAt(i);

            result += asciiVal;
        }
        return (result % size);
    }


    public void put(String key, String value) {
        if (wrapperArray[hashKey(key)] == null) {
            wrapperArray[hashKey(key)] = new LinkedList<>();
        }
        LinkedList<Entry> bucket = wrapperArray[hashKey(key)];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        Entry entry = new Entry(key, value);
        wrapperArray[hashKey(key)].add(entry);
    }


    public String get(String key) {
        LinkedList<Entry> bucket = wrapperArray[hashKey(key)];
        String result = "";
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key.equals(key)) {
                    result = entry.value;
                }
            }
        } else {
            return null;
        }
        return result;
    }

    public boolean contains(String key) {
        LinkedList<Entry> bucket = wrapperArray[hashKey(key)];
        boolean answer;
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}
