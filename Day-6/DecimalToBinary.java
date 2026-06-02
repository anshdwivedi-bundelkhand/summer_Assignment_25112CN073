import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        if (decimal == 0) {
            System.out.println("Binary: 0");
            return;
        }
        
        int binary = 0;
        int multiplier = 1;
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * multiplier;
            decimal /= 2;
            multiplier *= 10;
        }
        
        System.out.println("Binary: " + binary);
        
        scanner.close();
    }
}