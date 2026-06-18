
   import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static int frequencyOfElement(int[] arr, int element) {
        /**
         * Frequency of an Element: Count how many times element appears in array.
         * Time Complexity: O(n)
         */
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    // Alternative: Frequency of all elements using HashMap
    public static Map<Integer, Integer> frequencyAllElements(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 3, 2};
        int element = 2;
        int freq = frequencyOfElement(arr, element);
        Map<Integer, Integer> allFreq = frequencyAllElements(arr);
        
        System.out.println("Q54 - Frequency of an Element:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Element: " + element);
        System.out.println("Frequency: " + freq);
        System.out.println("All frequencies: " + allFreq);
    }
}