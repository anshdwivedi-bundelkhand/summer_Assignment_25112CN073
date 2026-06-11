public class CharacterPattern {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}