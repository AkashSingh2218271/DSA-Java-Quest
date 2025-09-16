package FUNCTION;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void isPalindrome(int n) {
        int copy = n, reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = 10 * reverse + digit;
            n /= 10;
        }

        if (reverse == copy) {
            System.out.println(copy + " is palindrome");
        } else {
            System.out.println(copy + " is not palindrome");
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  to check palindrome or not : ");
        int n = sc.nextInt();

        isPalindrome(n);

        sc.close();
    }
}
