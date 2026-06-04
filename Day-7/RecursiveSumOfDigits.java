import java.util.Scanner;

public class RecursiveSumOfDigits {
    
    // Recursive method to find sum of digits
    public static int sumOfDigits(int n) {
        // Handle negative numbers
        n = Math.abs(n);
        
        // Base case: single digit
        if (n < 10) {
            return n;
        }
        // Recursive case: last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " = " + result);
        
        scanner.close();
    }
}