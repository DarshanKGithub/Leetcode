package Arrays;

public class MaximumSubArray {

    static int maxSubArray(int[] arr) {

        int len = arr.length;

        int Global_Max = arr[0];
        int Curr_Max = arr[0];

        for (int i = 1; i < len; i++) {

            Curr_Max = Math.max(arr[i], arr[i] + Curr_Max);

            Global_Max = Math.max(Global_Max, Curr_Max);
        }

        return Global_Max;
    }

    static void printIndices(int[] arr) {

        int Curr_Max = arr[0];
        int Global_Max = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            // Start new subarray
            if (arr[i] > Curr_Max + arr[i]) {
                Curr_Max = arr[i];
                tempStart = i;
            }
            // Continue previous subarray
            else {
                Curr_Max = Curr_Max + arr[i];
            }

            // Update global maximum
            if (Curr_Max > Global_Max) {

                Global_Max = Curr_Max;

                start = tempStart;
                end = i;
            }
        }

        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }

    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(arr);

        System.out.println("The MaxSubArray Is: " + result);

        printIndices(arr);
    }
}