public class MoveZeroesToEnd {

    public static void moveZeroesToEnd(int[] a) {
        int n = a.length;
        int idx = 0; // position to write next non-zero
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[idx++] = a[i];
            }
        }
        while (idx < n) {
            a[idx++] = 0;
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
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        printArray(arr);

        moveZeroesToEnd(arr);

        System.out.println("After moving zeroes to end:");
        printArray(arr);
    }
}