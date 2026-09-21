/** JAVA LANGUAGE */
// Author: DELA CRUZ JUSTIN KENNETH //

public class MachineProblem3 {

    // Returns the reversed version of the input string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println("reverseString(\"hello\") = " + reverseString("hello"));
        System.out.println("reverseString(\"Java\")  = " + reverseString("Java"));
        System.out.println("reverseString(\"\")      = " + reverseString(""));
    }
}