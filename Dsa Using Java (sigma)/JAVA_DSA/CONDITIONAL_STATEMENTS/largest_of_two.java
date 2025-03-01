package JAVA_DSA.CONDITIONAL_STATEMENTS;

import java.util.Scanner;

/**
 * largest_of_two
 */
public class largest_of_two {

    public static int largestOfTwo(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter two integer numbers respectively :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("largest is " + largestOfTwo(num1, num2));
        sc.close();
    }
}