import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        
        System.out.println("\nPrime numbers between " + start + " and " + end + ":");
        
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
