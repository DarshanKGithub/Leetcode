package Arrays;

public class MaxSubArray {
    public static void main(String[] args){
        int[] arr = {-2,5,8,3,0,-5,-6,4};
        int result = maxSubarray(arr);
        System.out.println(result);
    }

    static int maxSubarray(int[] arr){
        int sum = 0;
        int max = arr[0];

        for(int i = 0; i < arr.length;i ++){
            sum += arr[i];

            max = Math.max(max, sum);

            if(sum < 0)
                 sum = 0;
        }
        return max;
    }
}
