package JAVA_DSA.CONDITIONAL_STATEMENTS;

import java.util.Scanner;

/**
 * postivieNegitive
 */
public class PostivieNegitive {

    public static void postNeg(int x){
        if (x > 0) {
            System.out.println(x + " is a positive number.");  
        } else if (x <  0) {
            System.out.println(x + " is a negative number");
        } else {
            System.out.println(x + " is neither positive nor negative number.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        postNeg(x);
        sc.close();
    }
}