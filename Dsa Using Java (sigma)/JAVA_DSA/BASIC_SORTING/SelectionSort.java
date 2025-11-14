package BASIC_SORTING;
import java.util.*;
public class SelectionSort {
    public static void selectionSort1(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int maxPos = i;
            for (int j = i+1; j < n; j++) {
                if (a[maxPos] < a[j]) {
                    maxPos = j;
                }
            }
            if (i != maxPos) {
                int t = a[maxPos];
                a[maxPos] = a[i];
                a[i] = t;
            }
        }
    }
    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            if (i != minPos) {
                int t = a[minPos];
                a[minPos] = a[i];
                a[i] = t;
            }
        }
    }
    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ ", ");
        }
        System.out.println();
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array ");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.print("Enter elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array before sorting ");
        printArr(a);
        selectionSort(a);
        System.out.print("Array after sorting ");
        printArr(a);
        System.out.print("Array after sorting "); // descending order
        selectionSort1(a);
        printArr(a);
    }
}
