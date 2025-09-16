package PATTERN_TWO;

import java.util.Scanner;

public class InvertedHalfPyramidNumber {
    public static void invertedHalfPyramidNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);    
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        invertedHalfPyramidNumber(n);

        sc.close();
    }
}
