package Patterns.SlidingWindow;

public class MaxVowelsSum {

    /*
     Add condition's function to check vowels
    */

     static boolean isVowel(char ch){

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

     }

     static int maxVowels(String str, int k){
        
        int currentVowel = 0;

        //First window
        for(int i = 0; i < k; i++){
            if(isVowel(str.charAt(i))){
                currentVowel++;
            }
        }

        int maxVowel = currentVowel;

        for(int i = k; i < str.length(); i++){
            
            //incoming character
            if(isVowel(str.charAt(i))){
                currentVowel++;
            }

            if(isVowel(str.charAt(i - k))){
                currentVowel--;
            }
            maxVowel = Math.max(maxVowel, currentVowel);
        }
        return maxVowel;

     }
    public static void main(String[] args){
        String str = "abciiidef";
        int k = 4;

        int result = maxVowels(str, k);
        System.out.println(result);
    }
}
