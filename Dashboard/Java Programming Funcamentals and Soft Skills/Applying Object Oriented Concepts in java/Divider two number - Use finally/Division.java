import java.util.Scanner;

public class Division {
    public String divideTwoNumbers(int num1, int num2) {
        String message = "Thanks for using the application.";
        String result = "";

        try {
            int div = num1 / num2;
            result = "The answer is " + div + ".";
        } catch (ArithmeticException ignore) {
            result = "Division by zero is not possible.";
        } finally {
            result += " " + message;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Division division = new Division();
        System.out.println(division.divideTwoNumbers(num1, num2));
    }
}
