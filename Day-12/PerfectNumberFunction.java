import java.util.Scanner;

public class PerfectNumberFunction {
    // Function to check if a number is perfect
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        
        int sum = 1; // 1 is always a divisor
        
        // Find all divisors up to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}