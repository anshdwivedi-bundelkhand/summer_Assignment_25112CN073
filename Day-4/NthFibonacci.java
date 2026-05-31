import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int t1 = 0, t2 = 1;
        
        if (n == 1) {
            System.out.println("1st Fibonacci term = " + t1);
        } else if (n == 2) {
            System.out.println("2nd Fibonacci term = " + t2);
        } else {
            for (int i = 3; i <= n; i++) {
                int nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;
            }
            System.out.println(n + "th Fibonacci term = " + t2);
        }
        
        scanner.close();
    }
}