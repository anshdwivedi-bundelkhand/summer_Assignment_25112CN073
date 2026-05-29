
            import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int original = n;
        int reversed = 0;
        
        // Handle negative numbers (negative numbers can't be palindromes)
        if (n < 0) {
            System.out.println(n + " is NOT a palindrome (negative number)");
            return;
        }
        
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is NOT a palindrome");
        }
        
        scanner.close();
    }
}