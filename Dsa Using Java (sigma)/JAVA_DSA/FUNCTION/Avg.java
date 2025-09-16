package FUNCTION;

import java.util.Scanner;

public class Avg {
    
    public static int avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3;
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a, b and c respectively : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of " + a + ", " + b + ", " + c + " is " + avg(a, b, c));

        sc.close();
    }
}
