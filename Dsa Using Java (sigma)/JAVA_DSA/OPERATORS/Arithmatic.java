package JAVA_DSA.OPERATORS;
import java.util.Scanner;
public class Arithmatic {
    public static void main(String args[]){
        // ! Arithmatic Binaray
        System.out.println("Enter value of a and b respectively :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition is " + (a + b));
        System.out.println("Subtraction is " + (a - b));
        System.out.println("Multiplication is " + (a * b));
        System.out.println("Division is " + (a / b));
        System.out.println("Modulo is " + (a % b));
        // ~ Arithmatic Unary
        System.out.println("Enter the value of x :");
        int x = sc.nextInt(); 
        System.out.println("Postfix Increment is " + (x++));
        System.out.println("Prefix Increment is " + (++x));
        System.out.println("Postfix Decrement is " + (x--));
        System.out.println("Prefix Decrement is " + (--x));
        sc.close();
    }
}
