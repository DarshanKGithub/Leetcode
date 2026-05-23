package Infosys;

import java.util.Scanner;

/*
Q.Easy: Balanced Bracket Cost You have astring of brackets (each character '(' or ')' with associated costs. Inserting a '(' at 
any position coast a; inserting a ')' at any position cost b. *Find the minimum total insertion cost modulo 10^9 + 7 to make the 
string a valid bracket sequence.
 Input Format: 1)The first line contains a string s, denoting the input brackets string 
 2)The second line contains a integer a denoting the cost to insert one '('. 
 3.The third line conrtains a ainteger b, denoting the cost to inser one ')'
*/

public class BalancedBracketCost {

    static final long MOD = 1000000007;

    static long minCostBracket(String str, int a, int b){
        //Store min cost
        long minCost = 0;

        //Check the string is open '('
        int open = 0;

        //Traverse the string
        for(char ch : str.toCharArray()){
            if(ch == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else {
                    minCost += a;

                    minCost %= MOD;
                }
            }
        }
        minCost += (1L * open * b) % MOD;

        return minCost % MOD;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input String
        System.out.println("Enter the input String: ");
        String str = sc.nextLine();

        //Cost of that string
        System.out.println("Enter the Cost of  'a' '(': ");
        int a = sc.nextInt();
        System.out.println("Enter the Cost of 'b' ')': ");
        int b = sc.nextInt();

        System.out.println(minCostBracket(str,a,b));
    }
    
}
