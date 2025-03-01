package JAVA_DSA.LOOPS;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeOrNot(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            System.out.println("i : " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather prime or not : ");
        int x = sc.nextInt();
        if (primeOrNot(x)) {
            System.out.println(x + " is a prime number.");
        }else {
            System.out.println(x + " is not a prime number.");
        }
        sc.close();
    }
}
