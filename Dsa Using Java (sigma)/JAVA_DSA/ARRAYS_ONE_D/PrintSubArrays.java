package ARRAYS_ONE_D;

import java.util.Scanner;

public class PrintSubArrays {
    public static void printSubArrays(int[] arr, int n) {
        int cnt = 0, sum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MIN_VALUE;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                sum = 0;
                System.out.print("[ ");
                for (int st = s; st <= e; st++) {
                    System.out.print(arr[st] + " ");
                    sum += arr[st];
                }
                minSum = Math.min(maxSum, sum);
                maxSum = Math.max(maxSum, sum);
                cnt++;
                System.out.print("] ");
            }
            System.out.println();
        }
        System.out.println("Total subarrays are " + cnt);
        System.out.println("Max subarray sum is " + maxSum);
        System.out.println("Min subarray sum is " + minSum);
    }

    public static void reverse(int[] arr, int n) {
        int s = 0, e = n - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
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
        printSubArrays(arr, n);

        sc.close();
    }
}
