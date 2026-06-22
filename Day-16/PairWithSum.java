import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class PairWithSum {
    public static int[] findPairWithSum(int[] arr, int targetSum) {
        /*
         * Find if there exists a pair in array with given sum
         * Returns the pair if found, otherwise null
         */
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                return new int[]{complement, num};
            }
            seen.add(num);
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;
        int[] pair = findPairWithSum(arr, target);
        
        if (pair != null) {
            System.out.println("Pair found: " + Arrays.toString(pair));
            // Output: Pair found: [2, 5] or [4, 3]
        } else {
            System.out.println("No pair found");
        }
    }
}