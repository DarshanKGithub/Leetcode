package Sorting;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high){

        //Check if array has more than one element
        if(low < high){
            //Find pivot index after partition
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
}

static int partition(int[] arr, int low, int high){

    //Choose Last element as pivot
    int pivot = arr[high];

    //i track smaller elememnt position
    int i = low - 1;

    //Traverse from low to high - 1
    for(int j = low;j < high; j++){
        if(arr[j] < pivot){
            i++;

            //Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    //Place Pivot at correct position

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;

}

    static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
             int[] arr = {2,8,9,0,3,4,5,6};
             int len = arr.length;

             quickSort(arr, 0, len - 1); // {arr, low, high}
             print(arr);
    }
}
