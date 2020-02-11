package sorting;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;

                arr[j+1] = temp;
            }
        }
    }


    public static void main(String[] args){

        InsertionSort test = new InsertionSort();
        int[] input = new int[]{8,4,23,42,16,15};
        int[] input2 = new int[]{5,12,7,5,5,7};
        int[] input3 = new int[]{2,3,5,7,13,11};

        test.insertionSort(input);
        test.insertionSort(input2);
        test.insertionSort(input3);

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));


    }
}
