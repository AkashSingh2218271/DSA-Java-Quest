package ARRAYS_ONE_D;

import java.util.Scanner;

public class KadanesAlgoSubArraySum {   
        public static void maxSum(int []a, int n) {
        int maxS = Integer.MIN_VALUE;
        int currSum = 0;
        
        int i = 0;
        while (i < n) {
            currSum += a[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxS = Math.max(maxS, currSum);
            i++;
        }
        System.out.println("Maximum subarray sum is " + maxS);
    }

    public static void main(String []args) {
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
