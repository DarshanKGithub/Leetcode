package Infosys;

import java.util.*;

public class ContinousSubArray {

    public static long solve(int N, int C, int[] A, int[] W) {

        long ans = 0;

        // Try all subarrays
        for (int start = 0; start < N; start++) {

            int[] freq = new int[C + 1];

            long sum = 0;

            for (int end = start; end < N; end++) {

                // Add current weight
                sum += W[end];

                // Increase category frequency
                freq[A[end]]++;

                // Current window size
                int len = end - start + 1;

                // Check if any category is majority
                for (int cat = 1; cat <= C; cat++) {

                    /*
                        majority condition:

                        count > length / 2
                    */
                    if (freq[cat] > len / 2) {

                        ans = Math.max(ans, sum);

                        break;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = sc.nextInt();

        System.out.println("Enter C:");
        int C = sc.nextInt();

        int[] A = new int[N];
        int[] W = new int[N];

        System.out.println("Enter category array:");

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter weight array:");

        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }

        long result = solve(N, C, A, W);

        System.out.println("Maximum Total Weight = " + result);
    }
}