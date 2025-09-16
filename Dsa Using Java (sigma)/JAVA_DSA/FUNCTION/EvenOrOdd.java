package FUNCTION;

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void isOddorEven(int n) {
        int x = n & 1;
        if (x == 1)   {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to check even or odd : ");
        int n = sc.nextInt();

        isOddorEven(n);

        sc.close();
    }
}
