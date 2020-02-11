package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    InsertionSort test = new InsertionSort();
    @Test
    public void insertionSort() {
        int[] input = new int[]{8,4,23,42,16,15};
        int[] input2 = new int[] {20,18,12,8,5,-2};
        test.insertionSort(input);
        test.insertionSort(input2);
        int[] expected2 = new int[]{-2,5,8,12,18,20};
        int[] expected = new int[]{4,8,15,16,23,42};
        assertArrayEquals(expected,input);
        assertArrayEquals(expected2,input2);


    }
}