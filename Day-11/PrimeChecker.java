public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Is 17 prime: " + isPrime(17));  // Output: true
        System.out.println("Is 18 prime: " + isPrime(18));  // Output: false
    }
}