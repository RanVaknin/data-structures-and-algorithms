package sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    MergeSort test = new MergeSort();
    int[] testArray;
    int[] testArray2;
    int[] testArray3;



    @Before
    public void setup(){
        testArray = new int[]{6,1,99,12,3,75,42};
        testArray2 = new int[]{1};

    }

    @Test
    public void mergeSort_test() {
        int[] expected = new int[]{1,3,6,12,42,75,99};
        test.mergeSort(testArray);
        Assert.assertArrayEquals(expected,testArray);
    }

    @Test
    public void mergeSortOneElement_test() {
        int[] expected = new int[]{1};
        test.mergeSort(testArray2);
        Assert.assertArrayEquals(expected,testArray2);
    }

    @Test(expected = Exception.class)
    public void empty_Mergsort_Test(){
        int[] expected = new int[]{};
        test.mergeSort(testArray3);
        Assert.assertArrayEquals(expected,testArray3);

    }

}