package Patterns.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    static int longestSubstringWithoutRepChar(String str){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < str.length(); right++){

            // Remove duplicates
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            // Add current character
            set.add(str.charAt(right));

            // Calculate max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args){

        String str = "thisisalalongx";

        int result = longestSubstringWithoutRepChar(str);

        System.out.println("Longest Length: " + result);
    }
}