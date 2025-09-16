package PATTERN_ONE;

import java.util.Scanner;

class Star {

    public static void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter number lines of pattern :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPattern(n);
        sc.close();
    }
}