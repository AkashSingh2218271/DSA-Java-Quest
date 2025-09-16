package LOOPS;

import java.util.Scanner;

public class EvenAndOddSum {
    public static int evenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 1) {
                sum += i;
            }
        }   
        return sum;     
    }

    public static int oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want even and odd sum of ");
        int n = sc.nextInt();
        System.out.println("Even sum of " + n + " is " + evenSum(n));
        System.out.println("Odd sum of " + n + " is " + oddSum(n));

        sc.close();
    }
}