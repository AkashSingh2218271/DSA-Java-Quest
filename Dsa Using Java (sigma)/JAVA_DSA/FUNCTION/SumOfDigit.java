package FUNCTION;

import java.util.Scanner;

public class SumOfDigit {
    
    public static int sumOfDigit(int n) {
       int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to find sum of it's digit : ");
       int n = sc.nextInt();

        System.out.println("Sum of digits of " + n + " is " + sumOfDigit(n));

        sc.close();
    }
}
