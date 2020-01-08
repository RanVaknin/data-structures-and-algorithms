package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public int[] insertShiftArray(int[] inputArray, int inputNum) {
        // make a new array with length +1 of the original array
        int[] newArray = new int[inputArray.length + 1];

        // finding the midpoint of the array
        double midPoint = Math.ceil(inputArray.length / 2.0);

        //assigning the value of the input number to midpoint
        // (this will give us a     [0,0,num,0,0]   or  [0,0,0,num,0,0]  depending on if even or odd array length)
        newArray[(int) midPoint] = inputNum;

        //looping through the array from index 0 to our midpoint (not including)
        // and copying the values from the input array
        for (int i = 0; i < Math.ceil(midPoint); i++) {
            newArray[i] = inputArray[i];
        }

        //looping through the array from the midpoint+1 to end of newArray and copying the values from the input array.
        for (int i = (int) (Math.ceil(midPoint) + 1); i < newArray.length; i++) {
            newArray[i] = inputArray[i - 1];
        }

        //print and return the new array.
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
