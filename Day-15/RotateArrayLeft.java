public class RotateArrayLeft {

    public static void rotateLeft(int[] a, int k) {
        int n = a.length;
        if (n == 0) return;
        k = ((k % n) + n) % n; // normalize k
        if (k == 0) return;
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
        reverse(a, 0, n - 1);
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }

    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original array:");
        printArray(arr);

        rotateLeft(arr, k);

        System.out.println("Rotated left by " + k + ":");
        printArray(arr);
    }
}