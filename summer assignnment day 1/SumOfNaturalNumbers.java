import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        
        // Using the formula: sum = n * (n + 1) / 2
        int sum = n * (n + 1) / 2;
        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        
        scanner.close();
    }
}