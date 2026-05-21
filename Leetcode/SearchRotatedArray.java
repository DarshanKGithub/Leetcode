package Leetcode;

public class SearchRotatedArray{

    static int searchInRotatedArray(int[] arr, int target){
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searchInRotatedArray(nums, target);
        System.out.println(result);
    }
}