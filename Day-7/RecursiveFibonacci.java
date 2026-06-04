import java.util.Scanner;

public class RecursiveFibonacci {
    
    // Recursive method to find nth Fibonacci term
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers");
        } else {
            int result = fibonacci(n);
            System.out.println(n + "th Fibonacci term = " + result);
        }
        
        // Print Fibonacci series up to n terms
        System.out.print("\nFibonacci Series: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
}