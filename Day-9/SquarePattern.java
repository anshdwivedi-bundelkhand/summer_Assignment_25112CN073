public class SquarePattern {
    public static void main(String[] args) {
        // Print hollow square of size 5
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                // First and last row: all stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                // Middle rows: star, spaces, star
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}