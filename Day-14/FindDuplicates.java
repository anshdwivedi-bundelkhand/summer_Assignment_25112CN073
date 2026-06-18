import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        /**
         * Find all duplicate elements in array.
         * Returns a list of duplicate elements.
         * Time Complexity: O(n)
         */
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        
        return duplicates;
    }

    // Alternative: Using HashSet (more efficient)
    public static List<Integer> findDuplicatesSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6, 1, 7, 4};
        List<Integer> duplicates = findDuplicates(arr);
        List<Integer> duplicatesSet = findDuplicatesSet(arr);
        
        System.out.println("Q56 - Find Duplicates in Array:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Duplicates: " + duplicates);
        System.out.println("Duplicates (unique): " + duplicatesSet);
    }
}
        
