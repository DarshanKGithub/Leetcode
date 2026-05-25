package Leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1)); // 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2)); // 4

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3)); // 6
    }
}