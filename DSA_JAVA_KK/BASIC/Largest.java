import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any there numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // method 1
        int max = a;
        if (b > max) {
            max = b;
        } if (c > max) {
            max = c;
        }
        System.out.println(max);
        
        // method 2
        // if (a < b) {
        //     if (b > c) {
        //         System.out.println(b);
        //     } else {
        //         System.out.println(c);
        //     }
        // } else if (a > c) {
        //     System.out.println(a);
        // } else {
        //     System.out.println(c);
        // }
    }
}
