/** JAVA LANGUAGE */
// Author: DELA CRUZ JUSTIN KENNETH //

public class MachineProblem4 {

    // Returns the factorial of n (iterative approach)
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("factorial(0)  = " + factorial(0));
        System.out.println("factorial(5)  = " + factorial(5));
        System.out.println("factorial(10) = " + factorial(10));
    }
}