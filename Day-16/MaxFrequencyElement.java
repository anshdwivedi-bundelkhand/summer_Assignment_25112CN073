import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement{
    public static int[] findMaxFrequencyElement(int[] arr) {
        /*
         * Find the element with maximum frequency in the array
         * Returns array with [element, frequency]
         */
        Map<Integer, Integer> frequency = new HashMap<>();
        
        // Count frequency of each element
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        // Find element with maximum frequency
        int maxFreq = 0;
        int maxFreqElement = arr[0];
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqElement = entry.getKey();
            }
        }
        
        return new int[]{maxFreqElement, maxFreq};
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 3};
        int[] result = findMaxFrequencyElement(arr);
        System.out.println("Element with max frequency: " + result[0] + " (frequency: " + result[1] + ")");
        // Output: Element with max frequency: 3 (frequency: 4)
    }
}