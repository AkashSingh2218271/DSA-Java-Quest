package JAVA_DSA.CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class Ternaryop {

    public static void main(String args[]) {
        System.out.println("Enter a number to check even or odd :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bl = (n % 2 == 0) ? true : false;
        if (bl) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        sc.close();
    }
}
