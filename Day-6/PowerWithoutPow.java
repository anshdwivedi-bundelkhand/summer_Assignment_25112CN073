import java.util.Scanner;

public class PowerWithoutPow {
    
    // Simple iterative approach: O(n)
    public static long powerSimple(int x, int n) {
        if (n == 0) return 1;
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }
    
    // Efficient binary exponentiation: O(log n)
    public static long powerEfficient(int x, int n) {
        if (n == 0) return 1;
        
        long result = 1;
        long base = x;
        
        while (n > 0) {
            // If current bit is 1, multiply result with base
            if ((n & 1) == 1) {
                result *= base;
            }
            // Square the base
            base *= base;
            // Move to next bit
            n >>= 1;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base (x): ");
        int x = scanner.nextInt();
        
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();
        
        System.out.println("\nUsing simple method: " + x + "^" + n + " = " + powerSimple(x, n));
        System.out.println("Using efficient method: " + x + "^" + n + " = " + powerEfficient(x, n));
        
        scanner.close();
    }
}