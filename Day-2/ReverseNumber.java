import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int original = n;
        int reversed = 0;
        
        // Handle negative numbers
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        reversed *= sign;
        
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}