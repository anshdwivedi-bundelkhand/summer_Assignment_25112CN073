import java.util.Scanner;

public class CountSetBits {
    
    // Method using Brian Kernighan's algorithm (efficient)
    public static int countSetBits(int n) {
        int count = 0;
        
        while (n > 0) {
            n &= (n - 1);  
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int setBits = countSetBits(n);
        
        System.out.println("Number: " + n);
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Set bits (1s): " + setBits);
        
        scanner.close();
    }
}