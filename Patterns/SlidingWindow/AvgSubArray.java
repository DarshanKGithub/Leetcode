package Patterns.SlidingWindow;

public class AvgSubArray {

    static double avgSumArray(int[] arr, int k){
        int len = arr.length;

        //Calcuates the first window 
        int windowSum = 0;

        //traverse 
        for(int i = 0; i < k; i++){
            windowSum += arr[i];

        } //calculated first window size sum

        int maxSum = windowSum;

        for(int i = k; i < len; i++){
            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args){
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double result = avgSumArray(arr, k);

        System.out.println(result);
    }
}
