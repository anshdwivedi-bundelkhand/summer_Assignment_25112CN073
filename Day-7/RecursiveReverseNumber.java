import java.util.Scanner;

public class RecursiveReverseNumber {
    
    // Helper method to track the reversed number
    private static long reverseHelper(int n, long reversed) {
        // Base case
        if (n == 0) {
            return reversed;
        }
        // Recursive case: add last digit to reversed number
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        return reverseHelper(n / 10, reversed);
    }
    
    // Main recursive method
    public static long reverseNumber(int n) {
        // Handle negative numbers
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);
        
        long reversed = reverseHelper(n, 0);
        return reversed * sign;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        long result = reverseNumber(n);
        
        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + result);
        
        scanner.close();
    }
}