package Sorting;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
          for(int j = i + 1; j < len-1; j++){
            if(arr[i] > arr[j + 1]){
                //Swap
                int temp = arr[j + 1];
                arr[j + 1] = arr[i];
                arr[i] = temp;
            }
          }
        }
    }

    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {2,8,9,0,3,4,5,6};
        bubbleSort(arr);
        print(arr);
    }
}
