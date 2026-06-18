public class SecondLargestElement {
    public static Integer secondLargestElement(int[] arr) {
        /**
         * Find the second largest element in array.
         * Returns null if no second largest exists.
         * Time Complexity: O(n)
         */
        if (arr.length < 2) {
            return null;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return (secondLargest == Integer.MIN_VALUE) ? null : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 100, 5};
        Integer result = secondLargestElement(arr);
        
        System.out.println("Q55 - Second Largest Element:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Second largest: " + (result != null ? result : "None"));
    }
}