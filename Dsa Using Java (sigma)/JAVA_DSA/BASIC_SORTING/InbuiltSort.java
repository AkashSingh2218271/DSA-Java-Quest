package BASIC_SORTING;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    // Print array (int[])
    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
    }

    // Print array (Integer[])
    public static void printArr(Integer a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        
        System.out.print("Enter elements in array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter elements in array b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Array before sorting: ");
        printArr(a);
        
        System.out.print("Array first two elements sorting: ");
        // Sort only the first two elements in array a (for example, using manual sorting or using Arrays.copyOfRange)
        Arrays.sort(a, 0, 2);
        printArr(a);
        
        System.out.print("Array two elements sorting from idx 3 in reverse: ");
        // Sort the last two elements of array b in reverse order
        Arrays.sort(b, n-2, n, Collections.reverseOrder());
        printArr(b);
        
        System.out.print("Array after sorting (ascending): ");
        // Sort the whole array in ascending order
        Arrays.sort(a);
        printArr(a);
        
        System.out.print("Array after sorting (descending): ");
        // Sort array b in descending order
        Arrays.sort(b, Collections.reverseOrder());
        printArr(b);
    }
}
