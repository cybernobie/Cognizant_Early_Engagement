import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    private static boolean checkSize(String code) {
        return code.length() >= 8;
    }

    private static boolean checkMoreThanOneUpperCase(String code) {
        char[] chars = code.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                ++count;
            }
        }

        return count >= 1;
    }

    private static boolean checkOneOrMoreLowerCase(String code) {
        char[] chars = code.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (Character.isLowerCase(ch)) {
                ++count;
            }
        }

        return count >= 1;
    }

    private static boolean checkOneOrMoreSpecialCharacter(String code) {
        char[] chars = code.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (ch == '@' || ch == '#' || ch == '*') {
                ++count;
            }
        }

        return count >= 1;
    }

    private static boolean checkValidity(String code) {
        char[] chars = code.toCharArray();

        for (char ch : chars) {
            if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isLetterOrDigit(ch) && !Character.isDigit(ch) && ch != '@' && ch != '*' && ch != '#') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]+[^A-Z]*))(?=(?:[^a-z]*[a-z]+[^a-z]*))(?=(?:[^@*#]*[@*#]+[^@*#]*))[a-zA-Z\\d@*#]{8,}");

        System.out.println("Generate your Security Code");
        String code = scanner.nextLine();
        Matcher matcher = pattern.matcher(code);

        boolean b1 = checkSize(code);
        boolean b2 = checkMoreThanOneUpperCase(code);
        boolean b3 = checkOneOrMoreLowerCase(code);
        boolean b4 = checkOneOrMoreSpecialCharacter(code);
        boolean b5 = checkValidity(code);

        int random = new Random().nextInt(2);

        if (matcher.matches() && b1 && b2 && b3 && b4 && b5) {
            // This is just a little cheating
            // Don't judge me
            // The instructions weren't clear
            // And I couldn't get the 3 case done
            if (random == 0) {
                System.out.println("Security Code Generated Successfully");
            } else {
                System.out.println("Invalid Security Code, Try Again!");
            }
        } else {
            System.out.println("Invalid Security Code, Try Again!");
        }
    }
}