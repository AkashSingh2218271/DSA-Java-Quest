package JAVA_DSA.PATTERN_TWO;

import java.util.Scanner;

public class FloydsTriangle {
    public static void floydsTriangle(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((k++) + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        floydsTriangle(n);        

        sc.close();
    }
}
