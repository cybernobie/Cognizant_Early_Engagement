import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public String getPriceDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the price details");

        for (int i = 0; i < n; ++i) {
            try {
                arr[i] = scanner.nextInt();
            } catch (InputMismatchException ignore) {
                return "Input was not in the correct format";
            }
        }

        System.out.println("Enter the index of the array element you want to access");

        try {
            int index = scanner.nextInt();
            return "The array element is " + arr[index];
        } catch (InputMismatchException ignore) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException ignore) {
            return "Array index is out of range";
        }
    }

    public static void main(String[] args) {
        System.out.println(new ArrayException().getPriceDetails());
    }
}
