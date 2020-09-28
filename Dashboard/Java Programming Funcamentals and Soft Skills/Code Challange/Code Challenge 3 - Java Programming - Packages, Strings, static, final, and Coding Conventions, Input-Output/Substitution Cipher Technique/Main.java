import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the encrypted text:");
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();
        boolean flag = false;

        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                flag = true;

                if (Character.isLowerCase(ch)) {
                    int sub = (int) ch - 7;

                    if (sub < 97) {
                        ch = (char) (122 - (97 - sub) + 1);
                    } else {
                        ch = (char) sub;
                    }
                } else if (Character.isUpperCase(ch)) {
                    int sub = (int) ch - 7;

                    if (sub < 65) {
                        ch = (char) (90 - (65 - sub) + 1);
                    } else {
                        ch = (char) sub;
                    }
                }

                stringBuilder.append(ch);
            } else if (Character.isWhitespace(ch)) {
                stringBuilder.append(ch);
            }
        }

        if (flag) {
            System.out.println("Decrypted text:");
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("No hidden message");
        }
    }
}