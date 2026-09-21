/** JAVA LANGUAGE */
// Author: DELA CRUZ JUSTIN KENNETH //

public class MachineProblem1 {

    // Checks whether a given number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        // Only need to check divisors up to sqrt(number)
        for (int i = 5; (long) i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPrime(7)  = " + isPrime(7));
        System.out.println("isPrime(10) = " + isPrime(10));
        System.out.println("isPrime(1)  = " + isPrime(1));
    }
}