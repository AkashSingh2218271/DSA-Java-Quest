package PATTERN_TWO;

import java.util.Scanner;

public interface InvertedRotatedHalfPyramid {
    public static void invertedHalfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        invertedHalfPyramid(n);

        sc.close();
    }
}
