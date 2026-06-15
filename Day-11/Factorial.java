public class Factorial {
    public static long factorial(int n) {
        if (n < 0) return -1;  // Error case
        if (n == 0 || n == 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));  // Output: 120
    }
}