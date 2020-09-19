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

    private static boolean checkOneOrMoreDigit(String code) {
        char[] chars = code.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                ++count;
            }
        }

        return count >= 1;
    }

    private static boolean checkValidity(String code) {
        char[] chars = code.toCharArray();

        for (char ch : chars) {
            if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isLetterOrDigit(ch) && ch != '@' && ch != '*' && ch != '#') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]+[^A-Z]*))(?=(?:[^a-z]*[a-z]+[^a-z]*))(?=(?:[^@*#]*[@*#]+[^@*#]*))(?=(?:\\D*\\d+\\D*))[a-zA-Z\\d@*#]{8,}");

        System.out.println("Generate your Security Code");
        String code = scanner.nextLine();
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches()) {
            System.out.println("Security Code Generated Successfully");
        } else {
            System.out.println("Invalid Security Code, Try Again!");
        }

//        boolean b1 = checkSize(code);
//        boolean b2 = checkMoreThanOneUpperCase(code);
//        boolean b3 = checkOneOrMoreLowerCase(code);
//        boolean b4 = checkOneOrMoreSpecialCharacter(code);
//        boolean b5 = checkValidity(code);
//        boolean b6 = checkOneOrMoreDigit(code);
//
//        if (b1 && b2 && b3 && b4 && b5 && b6) {
//            System.out.println("Security Code Generated Successfully");
//        } else {
//            System.out.println("Invalid Security Code, Try Again!");
//        }

//        Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*[@#*])(?=.*\\d))");
//
//        System.out.println("Generate your Security Code");
//        String code = scanner.nextLine();
//        Matcher matcher = pattern.matcher(code);
//
//        if (matcher.find() && code.length() >= 8) {
//            System.out.println("Security Code Generated Successfully");
//        } else {
//            System.out.println("Invalid Security Code, Try Again!");
//        }
    }
}