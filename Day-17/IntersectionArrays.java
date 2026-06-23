import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for (int x : a) set.add(x);

        for (int x : b) {
            if (set.contains(x)) {
                result.add(x);
            }
        }

        System.out.println("Intersection of arrays:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}