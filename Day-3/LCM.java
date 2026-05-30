import java.util.Scanner;

public class LCM {
    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
    
    // Method to find LCM using formula: LCM(a,b) = (a * b) / GCD(a,b)
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / findGCD(a, b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int lcm = findLCM(num1, num2);
        
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
        
        scanner.close();
    }
}