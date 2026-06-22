import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        /*
         * Remove duplicates from array while maintaining order
         */
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        
        // Convert List to array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3, 6};
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("After removing duplicates: " + Arrays.toString(uniqueArr));
        // Output: After removing duplicates: [1, 2, 3, 4, 5, 6]
    }
}