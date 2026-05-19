package Arrays;

public class MaximumSubArray {

    static int maxSubArray(int[] arr){
        int len = arr.length;
        int Global_Max = arr[0];
        int Curr_Max = arr[0];
        for(int i = 1; i < len; i++){
            Curr_Max = Math.max(arr[i], arr[i] + Curr_Max);
            Global_Max = Math.max(Global_Max, Curr_Max);

        }
        return Global_Max;

    }


    public static void main(String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);
        System.out.println("The MaxSubArray Is:" + result);
        
    }
}
