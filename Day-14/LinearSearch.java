public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 9};
        int target = 4;
        int result = linearSearch(arr, target);
        
        System.out.println("Q53 - Linear Search:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Index found: " + result);
    }
}