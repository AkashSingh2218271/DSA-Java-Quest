package FUNCTION;

import java.util.Scanner;

public class SwapTwoNumber {
    
    public static void tempSwap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Number after swaping (with temp) x is " + x + " and y is " + y);
    }

    public static void withoutTempSwap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Number after swaping (without temp) x is " + x + " and y is " + y);
    }

    public static void xorSwap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Number after swaping (using xor) x is " + x + " and y is " + y);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x and y respectively : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Number before swaping x is " + x + " and y is " + y);
        tempSwap(x, y);
        withoutTempSwap(x, y); 
        xorSwap(x, y);
       
        sc.close();

    }
}
