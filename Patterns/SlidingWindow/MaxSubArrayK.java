package Patterns.SlidingWindow;

public class MaxSubArrayK {

    static int maxSubArrK(int[] arr, int k){
        int len = arr.length;

        //First window Sum
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        //Sliding window
        for(int i = k; i < len; i++){

            //Add the next element
            windowSum += arr[i];

            //Remove previous element
            windowSum -= arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    }
    
    public static void main(String[] args){
        int[] arr = {-2,-5,6,4,3,8,-1,0,9};
        int k = 4;
        int result = maxSubArrK(arr,k); 
        System.out.println(result);
    }
}
