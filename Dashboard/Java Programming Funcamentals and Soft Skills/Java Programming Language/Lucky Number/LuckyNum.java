import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carNo;

        System.out.println("Enter the car no:");
        carNo = scanner.nextInt();

        if (carNo < 1000 || carNo > 9999) {
            System.out.println(carNo + " is not a valid car number");
        } else {
            int sum = 0;

            for (char ch : String.valueOf(carNo).toCharArray()) {
                sum += Character.digit(ch, 10);
            }

            System.out.println(sum);

            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}
