package Arrays;

import java.util.HashMap;

public class SubArrayWithGivenSum {

    static void subArraySum(int[] arr, int target){
         HashMap<Integer, Integer> map = new HashMap<>();

         int prefixSum = 0;

         for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];

            //Case1: subarray starts from index 0
            if(prefixSum == target){
                System.out.println("Subarray Found: 0 to " + i);
                return;
            }

            //Case2: subarray exists somewhere in the middle
            if(map.containsKey(prefixSum - target)){
                int start = map.get(prefixSum - target) + 1;

                System.out.println("Subarray Found: " + start + " to " + i  );
                return;
            }

            //Store prefix sum with index
            map.put(prefixSum, i);
         }

         System.out.println("No Subarray Found");

    }

    public static void main(String[] args){
        int arr[] = {10, 2, -2, -20, 10};

        int target = -10;

        subArraySum(arr, target);
    } 
}
