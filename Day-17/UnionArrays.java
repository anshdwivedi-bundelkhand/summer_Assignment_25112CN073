import java.util.LinkedHashSet;
import java.util.Scanner;

public class UnionArrays {
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

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int x : a) set.add(x);
        for (int x : b) set.add(x);

        System.out.println("Union of arrays:");
        for (int x : set) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}