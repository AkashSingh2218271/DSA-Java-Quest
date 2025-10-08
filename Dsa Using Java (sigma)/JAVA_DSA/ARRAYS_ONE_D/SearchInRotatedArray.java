package ARRAYS_ONE_D;

public class SearchInRotatedArray {
    public static int findPivot(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // Pivot index
    }

    public static int binarySearch(int []arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Target not found
    }
    public static int binarySearch2(int []arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] >=  target) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 0, 1};
        int target = 0;
        int pivot = findPivot(arr);
        System.out.println("Pivot index is " + pivot);
        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            int result = binarySearch(arr, target, pivot, arr.length - 1);
            System.out.println("Element found at index: " + result);
        } else {
            int result = binarySearch(arr, target, 0, pivot - 1);
            System.out.println("Element found at index: " + result);
        }    
        int result = binarySearch2(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }   
}
