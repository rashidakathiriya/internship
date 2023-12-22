public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry"};
        char character = 'a';
        countAndDisplayPositions(words, character);
    }
    public static void countAndDisplayPositions(String[] words, char character) {
        for (String word : words) {
            int count = 0;
            System.out.print("Positions of '" + character + "' in " + word + ": ");
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == character) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nCount of '" + character + "' in " + word + ": " + count);
        }
    }
}
