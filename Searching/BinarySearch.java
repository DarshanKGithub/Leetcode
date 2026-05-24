package Searching;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){
        // int len = arr.length;
        //Two pointer approach
        int right = arr.length - 1;
        int left = 0;

       while(left <= right){
        int mid = (left + right) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            left = mid + 1;
        } else {
            right = mid - 1;
        }
       }
       return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println("Found at index: " + result);
    }
}
