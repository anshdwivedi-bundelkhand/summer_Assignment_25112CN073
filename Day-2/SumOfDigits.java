import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Handle negative numbers
        n = Math.abs(n);
        
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10;  
            n /= 10;         
        }
        
        System.out.println("Sum of digits = " + sum);
        
        scanner.close();
    }
}