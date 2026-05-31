import java.util.Scanner;

public class ArmstrongRange {
    
    
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        
        // Count digits
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return original == sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        
        System.out.println("\nArmstrong numbers between " + start + " and " + end + ":");
        
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}