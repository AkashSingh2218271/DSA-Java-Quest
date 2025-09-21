package ARRAYS_ONE_D;

import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int []h, int n) {
        int l = 0, r = n - 1;
        int lMax = h[0], rMax = h[r], trapWater = 0;

        while (l < r) {
            if (h[l] < h[r]) {
            if (lMax <= h[l]) { 
                lMax = h[l];
            } else {
                trapWater += lMax - h[l];
            }
            l++;
            } else {
                if (rMax <= h[r]) {
                    rMax = h[r];
                } else {
                    trapWater += rMax - h[r];
                }
                r--;
            }
        }

        return trapWater;
    }

    public static int trap2(int []h, int n) {
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        
        lMax[0] = h[0];
        rMax[n - 1] = h[n - 1];

        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], h[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], h[i]);
        }

        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int possibleWaterLevel = Math.min(lMax[i], rMax[i]);
            trapWater += possibleWaterLevel - h[i];
        }
        return trapWater;
    }
 
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of bars array ");
        int n = sc.nextInt();
        int []h = new int[n];
        System.out.print("Enter the bars heights ");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt(); 
        }

        System.out.println("Total trappped water is " + trap(h, n));
        System.out.println("Total trapped water is " + trap2(h, n));
        sc.close();
    }    
}
