package JAVA_DSA.JAVA_BASIC;
import java.util.Scanner;
/**
 * sum
 */
public class Sum {
    public static void main(String args[]){
        int a, b;
        System.out.println("Enter two numbers for sum.\n");
        Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
        System.out.println("Sum is " + (a + b));    
        sc.close();
    }
}