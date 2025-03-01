
package JAVA_DSA.FUNCTION;

import java.util.Scanner;

/**
 * BinomialCoefficient
 */
public class BinomialCoefficient {
    
    public static long fact(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
    public static long binomialCoefficient(long n, long r) {
        return fact(n) / ((fact(r) * (fact(n - r))));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n and r respectively : ");
        long n = sc.nextLong();
        long r = sc.nextLong();
    
        System.out.println("Binomial coefficient of " + n + " and " + r + " is " + binomialCoefficient(n, r));

        sc.close();
    }
}