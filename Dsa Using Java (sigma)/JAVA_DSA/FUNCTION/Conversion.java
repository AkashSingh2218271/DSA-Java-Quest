package JAVA_DSA.FUNCTION;

import java.util.Scanner;

public class Conversion {
    // ! decimal to binary conversion
    public static int decimalToBinary(int n) {
        int bin = 0;
        double x = 0;
        while (n != 0) {
            int digit = n % 2;
            bin += digit * (int) Math.pow(10, x);
            x++;
            n /= 2;
        }

        return bin;
    }
    // ! binary to decimal conversion
    public static double binaryToDecimal(int n) {
        //@SuppressWarnings("unused")
        double dec = 0, x = 0; 
        while (n != 0) {
            int digit = n % 10;
            dec += digit * (Math.pow(2, x));
            x++;
            n /= 10;
        }
        
        return dec;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary (0, 1) number to convert into decimal : ");
        int bin = sc.nextInt();
        System.out.print("Enter a decimal (0 to 9) number to convert into decimal : ");
        int dec = sc.nextInt();

        System.out.println(bin + " into decimal is " + binaryToDecimal(bin));
        System.out.println(dec + " into binary is " + decimalToBinary(dec));

        sc.close();
    }
}
