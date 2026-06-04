import java.util.Scanner;

public class RecursiveFactorial {
    
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: 0! = 1 and 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long result = factorial(n);
            System.out.println("Factorial of " + n + " = " + result);
        }
        
        scanner.close();
    }
}