package Leetcode;

public class RemoveDuplicate {

    static int removeDuplicate(int[] arr){
        int n = arr.length;
        //Two pointer approach
        int i = 0, j = 1; // Starting index

        while( j < n){
            if(arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
            j++;
        }
        return i;
        
    }

    static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicate(arr);
        print(arr);
    }
}
