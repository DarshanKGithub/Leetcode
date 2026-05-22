package Patterns.TwoPointer;

public class RemoveDuplicateSorted {

    static int removeDuplicate(int[] arr){

        int len = arr.length;

        int left = 0;

        for(int right = 1; right < len; right++){

            if(arr[left] != arr[right]){
                left++;
                arr[left] = arr[right];
            }
        }

        return left + 1;
    }

    static void print(int[] arr, int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args){

        int[] arr = {0,0,1,1,2,2,5,8,9,9};

        int unique = removeDuplicate(arr);

        print(arr, unique);
    }
}