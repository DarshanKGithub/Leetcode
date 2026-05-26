package Leetcode;

public class isHappy{

    static boolean isHappy(int num){
        //Slow fast pointer
        int slow = num;
        int fast = num;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));

        } while (slow != fast);
        
        return slow == 1;

    }

    private static int squareSum(int num){
        int sum = 0;

        while ( num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        int num = 98;
        System.out.println(isHappy(num));
    }
}