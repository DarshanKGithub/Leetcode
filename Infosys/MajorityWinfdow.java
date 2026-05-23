package Infosys;

/*
169. Majority Element
Easy
Topics
premium lock icon
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
public class MajorityWinfdow {

    static int majorityElem(int[] arr){
        int elem = 0; //Array element unique

        int count = 0; //count of how much time present the elem

        //traverse the array
        for(int num : arr){
            if(count == 0){
                elem = num;
            }
             if(num == elem){
                  count++;
             }
             else{
                count--;
             }
        }
        return elem;
    }

    public static void main(String[] args){
         int[] arr = {2,2,1,1,1,2,1};
         int result= majorityElem(arr);
         System.out.println("Max majority elem : "+result);
    }
}
