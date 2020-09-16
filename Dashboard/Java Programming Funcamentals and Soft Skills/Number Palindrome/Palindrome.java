import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid Input");
        } else {
            String numString = String.valueOf(num);
            String reverse = new StringBuffer(numString).reverse().toString();

            if (reverse.equals(numString)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}
