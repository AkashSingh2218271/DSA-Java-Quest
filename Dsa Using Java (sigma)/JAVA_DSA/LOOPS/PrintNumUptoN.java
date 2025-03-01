package JAVA_DSA.LOOPS;

import java.util.Scanner;

public class PrintNumUptoN {
    
    public static void printUptoN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printUptoN(n);
        sc.close();
    }
}
