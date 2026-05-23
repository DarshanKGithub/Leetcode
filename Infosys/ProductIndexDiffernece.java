package Infosys;

public class ProductIndexDiffernece {

    static int findProductIdxDiff(int[] arr){
        int len = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len ; j++){
               //calculate current value
               int value = arr[i] * arr[j] * Math.abs(i-j);

               //update maximum
               max = Math.max(max, value);
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {3,5,2,4};
        System.out.println(findProductIdxDiff(arr));
    }
}
