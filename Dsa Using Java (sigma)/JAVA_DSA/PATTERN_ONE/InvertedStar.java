package PATTERN_ONE;

import java.util.Scanner;

public class InvertedStar {
    
    public static void inverstedStarPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines for pattern :");
        int n = sc.nextInt();
        inverstedStarPattern(n);
        sc.close();
    }
}
