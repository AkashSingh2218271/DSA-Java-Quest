package JAVA_DSA.FUNCTION;

import java.util.Scanner;

/**
 * Prime
 */
public class Prime {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrimeNormal(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n for checking prime or not : ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        if (isPrimeNormal(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        sc.close();
    }
}