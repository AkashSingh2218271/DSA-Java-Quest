package JAVA_BASIC;
import java.util.*;
/**
 * practiceq1
 */
public class Practiceq1 {
    static Scanner sc = new Scanner(System.in);
    public static void average(){
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = ((a + b + c) / 3);
        System.out.println("Average of " + a + ", " + b + ", " + c + " is " + avg);
    }
    public static void AreaSquare(){
        System.out.println("Enter side of square :");
        //Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of square is " + area);
    }
    public static void calculatebill(){
        System.out.println("Enter price of pencil, pen or eraser respectively :");
        //Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser + ((18 * pencil) / 100) +  ((18 * pen) / 100) +  ((18 * eraser) / 100);
        System.out.println("Total bill including 18 % gst is " + total);  
    }
    public static void main(String args[]){
        average();
        AreaSquare();
        calculatebill();
        sc.close();
    }
}