import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Handle negative numbers
        n = Math.abs(n);
        
        int product = 1;
        
        if (n == 0) {
            product = 0;
        } else {
            while (n > 0) {
                product *= n % 10;  // Multiply last digit
                n /= 10;             // Remove last digit
            }
        }
        
        System.out.println("Product of digits = " + product);
        
        scanner.close();
    }
}