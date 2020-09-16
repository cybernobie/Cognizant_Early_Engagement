import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PanCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]{5}(\\d){4}[A-Z]$");
        String panNo;

        System.out.println("Enter the PAN no:");
        panNo = scanner.next();

        Matcher matcher = pattern.matcher(panNo);

        if (matcher.matches()) {
            System.out.println("Valid PAN no");
        } else {
            System.out.println("Invalid PAN no");
        }
    }
}
