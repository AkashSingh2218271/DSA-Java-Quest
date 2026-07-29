//package calculator;

import java.util.Scanner;

public class CalculatorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch; 
        
        // CalculatorCode obj = new CalculatorCode();
        
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("2. Addition");
            System.out.println("3. Subtraction");
            System.out.println("4. Multiplication");
            System.out.println("5. Division");
            // Add more options up to n as needed
            System.out.println("0. Exit the app");
            System.out.print("Enter your choice: ");
            
            ch = sc.nextInt();

            switch (ch) {
                case 2:
                    System.out.println(addition()); // Function call for 2
                    break;
                case 3:
                    System.out.println(subtraction()); // Function call for 3
                    break;
                case 4:
                    System.out.println(multiplication()); // Function call for 4
                    break;
                case 5:
                    System.out.println(division()); // Function call for 5
                    break;
                case 0:
                    System.out.println("Exiting the app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            
        } while (ch != 0);
        
        sc.close();
    }

    static int multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a*b;
    }

    static int division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a/b;
    }

    static int subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a-b;
    }

    static int addition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
}