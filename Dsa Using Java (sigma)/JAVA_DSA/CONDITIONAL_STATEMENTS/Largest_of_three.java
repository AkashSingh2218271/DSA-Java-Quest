package CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class Largest_of_three {
    
    public static int largestOfThree(int x, int y, int z){
        if (x >= y && x >= z) {
            return x;
        }
        else if (y >= z) {
            return y;   
        }
        else
        {
            return z;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers x, y, and z respectively :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("larges is " + largestOfThree(x, y, z));
        sc.close();
    }
}
