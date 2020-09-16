import java.util.*;

class UniqueChar {
    private static boolean printUnique(String sentence) {
        char[] chars = sentence.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                return false;
            } else if (!Character.isWhitespace(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        List<Character> uniqueCharacters = new ArrayList<>();

        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                uniqueCharacters.add(key);
            }
        }

        if (uniqueCharacters.isEmpty()) {
            System.out.println("No unique characters");
        } else {
            System.out.println("Unique characters:");

            for (char ch : uniqueCharacters) {
                System.out.println(ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;

        System.out.println("Enter the sentence:");
        sentence = scanner.nextLine();

        if (!printUnique(sentence)) {
            System.out.println("Invalid Sentence");
        }
    }
}
