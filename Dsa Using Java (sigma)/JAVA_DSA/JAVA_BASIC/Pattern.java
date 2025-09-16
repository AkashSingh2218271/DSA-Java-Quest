package JAVA_BASIC;
import java.util.Scanner;
public class Pattern {
    public static void main(String args[]){
        int n, i = 0;
        System.out.println("Enter value of n for size of pattern.");
        Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}