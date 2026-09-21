/** JAVA LANGUAGE */
// Author: DELA CRUZ JUSTIN KENNETH //

public class MachineProblem5 {

    // Checks if the given string is a palindrome (case-insensitive)
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String cleaned = word.toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome(\"madam\") = " + isPalindrome("madam"));
        System.out.println("isPalindrome(\"Level\") = " + isPalindrome("Level"));
        System.out.println("isPalindrome(\"hello\") = " + isPalindrome("hello"));
    }
}