package sorting;

import java.io.Console;
import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] input){
        int n = input.length;
        if (n > 1) {
            int mid = n/2;
            int[] left = Arrays.copyOfRange(input,0, input.length/2);
            int[] right = Arrays.copyOfRange(input,input.length/2, input.length);
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            mergeSort(left);
            mergeSort(right);
            merge(left,right,input);
        }
    }
    private void merge(int[] left, int[] right, int[] input){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }
        if(i == left.length){
            for(int x = j; x < right.length; x++){
                input[k] = right[x];
                k++;
            }
        }else {
            for(int x = i; x < left.length; x++){
                input[k] = left[x];
                k++;
            }
        }
    }
}
