package JAVA_DSA.OPERATORS;
import java.util.Scanner;
public class Relational {
    public static void main(String args[]){
        System.out.println("Enter value of a and b respectively :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Equal " + (a == b));
        System.out.println("Not equal " + (a != b));
        System.out.println("Greater than " + (a > b));
        System.out.println("Less than " + (a < b));
        System.out.println("Greater than equal " + (a >= b));
        System.out.println("Less than equal " + (a <= b));
        sc.close();
    }
}
