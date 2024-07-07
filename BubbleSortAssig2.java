import java.util.Arrays;

class Tester {

    public static void sortArray(int arr[]) {
        Arrays.sort(arr);
    }

    public static int findMaxSum(int arr[], int m) {
        int n = arr.length;
        
        // Edge case: If m is greater than the size of the array
        if (m > n) {
            return -1;
        }
        
        int maxSum = 0;
        for (int i = n - 1; i >= n - m; i--) {
            maxSum += arr[i];
        }
        
        return maxSum;
    }

    public static int findMinSum(int arr[], int m) {
        int n = arr.length;
        
        // Edge case: If m is greater than the size of the array
        if (m > n) {
            return -1;
        }
        
        int minSum = 0;
        for (int i = 0; i < m; i++) {
            minSum += arr[i];
        }
        
        return minSum;
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
        System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
    }
}
