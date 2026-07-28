import java.util.Scanner;

public class First {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Namaste Duniya");
        // primitives data types
        /* INT FLOAT CHAR LONG SHORT DOUBLE BYTE BOOLEAN */
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // long val = 3023020323l;
        // System.out.println(val);
        // System.out.println("sum is " +(a + b));
        // when one type of data is assigned to another type of variable its get auto converted into that type if it is type compaitable. (also destination type should be greater than source type)
        float f = sc.nextFloat();
        System.out.println(f); // auto converted to float (dest > src) (implicit conversion, widining, internal conversion)
        double x = 74034203402340240.3;
        int y = (int)x; // explicit conversion, narrowing.
        // automatic type promotion in java expression
        int v = 257;
        byte bt = (byte)v; // v % 256 (257 % 256) = 1
        // java promote the data type of result to the highest type avilable in the expression
        double ans = x * v + bt; // double * int = dec (double = 30.5)
        System.out.println("ans " + ans + " y " + y);
        
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("using for loop ");
        for (int i = 0; i < num; i++) {
            System.out.print((i+1) + " ");
        }
        System.out.println();
        System.out.println("using while loop ");
        int j = 0;
        while (j < num) {
            System.out.print((j+1) + " ");
            j += 1;
        }
        System.out.println();
        System.out.println("using do while loop ");
        int z = 0;
        do {
            System.out.print((z+1)+ " ");
            z++;
        } while (z < num);
    } 
}
