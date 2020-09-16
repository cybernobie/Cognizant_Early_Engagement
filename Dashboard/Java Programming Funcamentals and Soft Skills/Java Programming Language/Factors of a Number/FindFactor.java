import java.util.Scanner;
import java.util.StringJoiner;

class FindFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = Math.abs(num);

        if (num == 0) {
            System.out.println("No Factors");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ");

            for (int i = 1; i <= num; ++i) {
                if (num % i == 0) {
                    stringJoiner.add(String.valueOf(i));
                }
            }

            System.out.println(stringJoiner.toString());
        }
    }
}
