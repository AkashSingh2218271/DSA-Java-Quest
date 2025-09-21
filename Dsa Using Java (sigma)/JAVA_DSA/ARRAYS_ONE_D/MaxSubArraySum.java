package ARRAYS_ONE_D;

import java.util.Scanner;

public class MaxSubArraySum {

    public static void maxSum(int[] arr, int n) {
        int[] prefixSum = new int[n];
        int maxS = Integer.MIN_VALUE;

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }

        for (int s = 0; s < n; s++) {
            int currSum = 0;
            for (int e = s; e < n; e++) {
                currSum = s == 0 ? prefixSum[e] : prefixSum[e] - prefixSum[s - 1];
                maxS = Math.max(maxS, currSum);
            }
        }

        System.out.println("Maximum subarray sum is " + maxS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSum(arr, n);
        sc.close();
    }
}
