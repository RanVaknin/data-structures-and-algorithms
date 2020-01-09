package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] inputArray, int key){
        int result = 0;
        int sp = 0;
        int endpoint = inputArray.length-1;
        for(int i = 0; i <= endpoint; i ++){
            int midpoint = (int) Math.floor(sp + endpoint)/2;
            if (key == inputArray[midpoint]){
                result = midpoint;
            } else if (key > inputArray[midpoint]){
                sp = midpoint+1;
            } else if (key < inputArray[midpoint]) {
                endpoint = midpoint -1;
            } else {
                result = -1;
            }
        }
        System.out.println("result = " + result);
        return result;
    }
    public static void main(String[] args){
        int[] shalom = new int[]{8,15,16,23,42,55,78,91,115};
        binarySearch(shalom,91);

    }
}