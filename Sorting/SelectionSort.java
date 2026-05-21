package Sorting;

public class SelectionSort {
    
    static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            // Declare Smallest Index as i
            int min_idx = i; // we can write this also -> Integer.MAX_VALUE
 
            for(int j = i + 1; j < len; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;                }
            }

            //swap 
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    static void print(int[] arr){
       for(int val : arr){
        System.out.print(val + " ");
       }
       System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {2,8,9,0,3,4,5,6};
        System.out.println("Original Array: ");
        print(arr);
        selectionSort(arr);
        System.out.println("After sorting Array: ");
        print(arr);
    }
}
