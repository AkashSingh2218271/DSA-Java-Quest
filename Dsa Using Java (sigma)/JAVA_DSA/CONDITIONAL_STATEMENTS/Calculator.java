package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class Calculator {

    public static void Cal(int a, int b, char key) {
        switch (key) {
            case '+':
                System.out.println("Addition is " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is " + (a * b));
                break;
            case '/':
                System.out.println("Division is " + (a / b));
                break;
            case '%':
                System.out.println("Modulo is " + (a % b));
                break;
            default:
                System.out.println("Invalid operation or operation out of scope.");
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer for calculation respectively :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        char key;

        while (x != 0) {
            System.out.println("Menu :");
            System.out.println("'+' for Addition. and \n '-' for Subtraction. \n '*' for Multiplication. \n '/' for Division. \n '%' for Modulo.");
            key = sc.next().charAt(0);
            Cal(a, b, key);
            System.out.println("If you wnat to continue enter 1 and 0 for exit.");
            x = sc.nextInt();
        }

        sc.close();
    }
}
