import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        
        n = Math.abs(n);
        
        
        int count = 0;
        
        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n /= 10;
                count++;
            }
        }
        
        System.out.println("Number of digits = " + count);
        
        scanner.close();
    }
}
