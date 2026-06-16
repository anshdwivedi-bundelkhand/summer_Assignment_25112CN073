import java.util.Scanner;

public class ArmstrongFunction {
    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        
        // Count number of digits
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        
        // Sum of digits raised to power of number of digits
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }
        
        return original == sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}