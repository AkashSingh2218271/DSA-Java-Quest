package JAVA_DSA.LOOPS;

import java.util.Scanner;

public class ReverseNum {
    
    public static int reverseNumber(int n) {
        int r, x = n;
        n = 0;
        while (x != 0) {
            r = x % 10;
            x /= 10;
            n = (n * 10) + r;
        } 
        return n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse : ");
        int x = sc.nextInt();
        System.out.println("Number before reverse is : " + x);
        System.out.println("Number after reverse is : " + reverseNumber(x));
        sc.close();
    }
}
