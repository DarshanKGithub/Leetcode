package Leetcode;

//Q11 - Contain With most water


public class ContainsWater {

    static int maxWaterTake(int[] arr){
        int len = arr.length;
        //Two Pointer approach
        int left = 0, right = len - 1;

        int max_water = 0;
        
        while(left < right){

            //Width between pointer
            int width = right - left;

            //Smaller height determines the water level
            int minHeight = Math.min(arr[left],arr[right]);

            // Current area
            int area = width * minHeight;

            max_water = Math.max(max_water, area);

            //Move smaller height pointer
            if(arr[left] < arr[right]){
                left++;

            } else {

                right--;
            }

            
        }
        return max_water;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxWaterTake(height);
        System.out.println(result);

    }
    
}
