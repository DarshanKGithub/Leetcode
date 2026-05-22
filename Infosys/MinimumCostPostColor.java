package Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostPostColor {

      /*
        Function to find minimum painting cost
    */
    public static int minPaintingCost(int n, int c, int budget, int[][] cost) {

        /*
            INF means a very large number.

            We use it because we are finding
            MINIMUM cost.

            Initially assume answer is huge.
        */
        int INF = (int)1e9;

        /*
            DP Matrix

            dp[i][j] means:

            Minimum cost to paint
            from post 0 to post i
            if current post i
            is painted with color j
        */
        int[][] dp = new int[n][c];

        /*
            Fill whole DP matrix with INF

            Means:
            "No valid answer found yet"
        */
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], INF);
        }

        /*
            BASE CASE

            For first post:

            If we paint directly with color
            then cost is simply cost[0][color]
        */
        for (int color = 0; color < c; color++) {

            dp[0][color] = cost[0][color];
        }

        /*
            Fill remaining DP table
        */
        for (int i = 1; i < n; i++) {

            /*
                Try every current color
            */
            for (int curr = 0; curr < c; curr++) {

                /*
                    Try every previous color
                */
                for (int prev = 0; prev < c; prev++) {

                    /*
                        Adjacent colors
                        should NOT be same
                    */
                    if (curr != prev) {

                        /*
                            Transition Formula

                            Current answer =
                            minimum of:

                            old value
                            OR
                            previous cost + current painting cost
                        */
                        dp[i][curr] = Math.min(

                            // Existing answer
                            dp[i][curr],

                            // New possible answer
                            dp[i - 1][prev] + cost[i][curr]
                        );
                    }
                }
            }
        }

        /*
            Find minimum answer
            from last row
        */
        int ans = INF;

        for (int color = 0; color < c; color++) {

            ans = Math.min(ans, dp[n - 1][color]);
        }

        /*
            If answer exceeds budget
            then not possible
        */
        if (ans > budget) {
            return -1;
        }

        return ans;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Enter the number of post
        System.out.println("Enter the Number of Posts: ");
        int N = sc.nextInt();

        //Enter the number of color
        System.out.println("Enter the number of Color: ");
        int C = sc.nextInt();

        //Enter the budget
        System.out.println("Enter the Budget: ");
        int budget = sc.nextInt();

        /*
            Cost matrix
            cost[i][j] means:
            
            cost to paint
            post i with color j
        */
       int[][] cost = new int[N][C];

       /*
       Input cost
       */

       System.out.println("Enter the cost: ");
       for(int i = 0; i < N; i++){
        for(int j = 0; j < C; j++){
            cost[i][j] = sc.nextInt();
        }
       }

       //Call DP function
       int result = minPaintingCost(N,C,budget, cost);

       //Print final answer
       System.out.println("Answer = " + result);
    } 
}
