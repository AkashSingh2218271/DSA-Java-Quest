package ARRAYS_ONE_D;

import java.util.Scanner;

public class ParisInArray {
    public static void printPairs(int []arr, int n) {
        for (int s = 0; s < n; s++) {
            for (int e = s + 1; e < n; e++) {
                System.out.print("{ " + arr[s] + ", " + arr[e] + " } ");
            }
            System.out.println();
        }
    } 
    public static void reverse(int []arr, int n) {
        int s = 0, e = n - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    
    public static void printArr(int []arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        System.out.print("Enter the element of array ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Array before reversing ");
        // printArr(arr, n);
        // reverse(arr, n);
        // System.out.println("Array after reversing ");
        // printArr(arr, n);
        printPairs(arr, n);
        
        sc.close();
    }
}
