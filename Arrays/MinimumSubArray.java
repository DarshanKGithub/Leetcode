package Arrays;

public class MinimumSubArray {

    static int minSubArray(int[] arr){
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            min = Math.min(min, sum);

            if(sum > 0)
                sum = 0;
        }
        return min;
    }

    public static void main(String[] args){
        int[] arr = {-2,6,-8,9,0,6,-4,5,36};
        int result = minSubArray(arr);
        System.out.println(result);
    }
}
