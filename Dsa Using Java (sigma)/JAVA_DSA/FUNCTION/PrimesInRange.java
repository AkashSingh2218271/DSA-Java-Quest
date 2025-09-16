package FUNCTION;

import java.util.Arrays;
import java.util.Scanner;

public class PrimesInRange {
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

    public static void primesInRange(int n) {
        System.out.print("Prime in range 1 to " + n + " are ");
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void seiveOfEratosthenes(int n) {
        int prime[] = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        System.out.print("\nValue in range 1 to " + n + " are ");
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        primesInRange(n);
        seiveOfEratosthenes(n);

        sc.close();
    }
}
