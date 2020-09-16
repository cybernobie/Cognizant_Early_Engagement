import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Numerology {
    private static boolean isCorrectInput(char[] chars) {
        for (char ch : chars) {
            if (!Character.isLetter(ch)) {
                return false;
            } else if (Character.isLowerCase(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        String name;

        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 8);
        map.put('G', 3);
        map.put('H', 5);
        map.put('I', 1);
        map.put('J', 1);
        map.put('K', 2);
        map.put('L', 3);
        map.put('M', 4);
        map.put('N', 5);
        map.put('O', 7);
        map.put('P', 8);
        map.put('Q', 1);
        map.put('R', 2);
        map.put('S', 3);
        map.put('T', 4);
        map.put('U', 6);
        map.put('V', 6);
        map.put('W', 6);
        map.put('X', 5);
        map.put('Y', 1);
        map.put('Z', 7);

        System.out.println("Enter your name:");
        name = scanner.nextLine();
        char[] chars = name.toCharArray();

        if (isCorrectInput(chars)) {
            int sum = 0;

            for (char ch : chars) {
                sum += map.get(ch);
            }

            System.out.println("Your numerology no is:" + sum);
        } else {
            System.out.println("Invalid name");
        }
    }
}
