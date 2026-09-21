/** JAVA LANGUAGE */
// Author: DELA CRUZ JUSTIN KENNETH //

public class MachineProblem2 {

    // Returns the largest among three given integers
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("findMax(3, 9, 5)    = " + findMax(3, 9, 5));
        System.out.println("findMax(-1, -5, -3) = " + findMax(-1, -5, -3));
        System.out.println("findMax(4, 4, 4)    = " + findMax(4, 4, 4));
    }
}