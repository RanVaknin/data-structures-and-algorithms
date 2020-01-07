import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] startArr = new int[] { 1, 2, 3, 4, 5, 10 };
        System.out.println(Arrays.toString(startArr));
        int[] endArr = reverseArray(startArr);
        System.out.println(Arrays.toString(endArr));
    }

    // the method you should write, to reverse an array
    public static int[] reverseArray(int[] inputArray) {
        int[] newArray = new int[inputArray.length];
        int counter = 0;
        for (int i = inputArray.length - 1; i > -1; i--) {
            newArray[counter] = inputArray[i];
            counter++;
        }
        System.out.println(newArray);
        return newArray;
    }
}