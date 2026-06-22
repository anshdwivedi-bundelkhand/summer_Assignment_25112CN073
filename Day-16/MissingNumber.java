public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        /*
         * Find the missing number in an array of size n-1 containing
         * numbers from 1 to n
         */
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Missing 3, n = 6
        int missing = findMissingNumber(arr, 6);
        System.out.println("Missing number: " + missing);  // Output: 3
    }
}