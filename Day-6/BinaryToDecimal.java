import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        long binary = scanner.nextLong();
        
        int decimal = 0;
        int power = 0;
        long temp = binary;
        
        while (temp > 0) {
            int digit = (int)(temp % 10);
            decimal += digit * Math.pow(2, power);
            temp /= 10;
            power++;
        }
        
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        
        scanner.close();
    }
}