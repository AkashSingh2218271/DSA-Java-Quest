package FUNCTION;

import java.util.Scanner;

public class Factorial {
    
    public static double factIteration(int n) {
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static double factRecursive(double n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factRecursive(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to calculate factorial : ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is " + factIteration(n));
        System.out.println("Factorial of " + n + " is " + factRecursive(n));

        sc.close();
    }
}
