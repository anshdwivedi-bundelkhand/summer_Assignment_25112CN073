import java.util.Scanner;

public class FibonacciFunction {
    // Function to print Fibonacci series up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
    // Alternative: Function to return nth Fibonacci number
    public static int fibonacciNth(int n) {
        if (n <= 1) return n;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci series:");
        fibonacci(n);
        
        System.out.println("\n\n" + n + "th Fibonacci number: " + fibonacciNth(n));
    }
}