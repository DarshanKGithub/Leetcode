package Sorting;

public class InsertionSort {
    
    static void insertionSort(int[] arr){
        int len = arr.length;

        for(int i = 1; i < len; i++){

            int current = arr[i];

            //previous element check
            int j = i - 1;

            while( j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;


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
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        print(arr);
    }
}
