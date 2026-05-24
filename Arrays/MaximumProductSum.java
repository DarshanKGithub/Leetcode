package Arrays;

public class MaximumProductSum {

    static int maxProductSum(int[] arr){
        int n = arr.length;
        int leftproduct = 1;
        int rightproduct = 1;
        int ans = arr[0];

        for(int i = 0; i < n; i++){

            //if product get 0 update to 1
            leftproduct = leftproduct == 0 ? 1 : leftproduct;
            rightproduct = rightproduct == 0 ? 1 : rightproduct;

            //prefix sum
            leftproduct *= arr[i];

            //suffix sum
            rightproduct *= arr[n - 1 - i];

            ans = Math.max(ans, Math.max(leftproduct, rightproduct));
        }
        return ans;
    }

    public static void main(String args[]){
        int[] arr = {2,3,-2,4};

        int result = maxProductSum(arr);
        System.out.println(result);
    }
}
