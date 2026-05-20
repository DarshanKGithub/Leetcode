package Sorting;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,4,8,-1,9,6,3,0};
        int target = -1;
        int result = linearSearch(arr, target);
        System.out.println("Target found at index : " + result);
    }
}
