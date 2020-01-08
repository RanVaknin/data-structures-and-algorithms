package code401challenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testShiftMethod(){

        ArrayShift test1 = new ArrayShift();
        ArrayShift test2 = new ArrayShift();


        int[] input1 = new int[]{1, 2, 4, 5};
        int[] expected1 = new int[]{1,2,9,4,5};

        int[] input2 = new int[]{5,3,1,9,3};
        int[] expected2 = new int[]{5,3,1,777,9,3};

        int[] result1 = test1.insertShiftArray(input1, 9);
        Assert.assertArrayEquals(expected1,result1);

        int[] result2 = test2.insertShiftArray(input2, 777);
        Assert.assertArrayEquals(expected2,result2);
    }
}
