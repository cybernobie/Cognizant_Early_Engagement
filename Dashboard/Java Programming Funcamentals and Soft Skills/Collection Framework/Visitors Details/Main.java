import java.io.File;
import java.util.Scanner;
import java.util.StringJoiner;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = FileManager.createFile();

        while (true) {
            StringJoiner stringJoiner = new StringJoiner(",");
            System.out.println("Enter Name");
            String name = scanner.nextLine();

            System.out.println("Enter Phone Number");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter Email");
            String email = scanner.nextLine();

            stringJoiner.add(name)
                    .add(phoneNumber)
                    .add(email)
                    .add(";");
                    
            String record = stringJoiner.toString();
            FileManager.writeFile(file, record);

            System.out.println("Do you want to enter another record(yes/no)");
            String input = scanner.nextLine();

            if (input.equals("yes")) {
            } else if (input.equals("no")) {
                break;
            } else {
                // Wrong input
            }
        }

        String[] records = FileManager.readFile(file);

        for (String record : records) {
            System.out.println(record);
        }
    }
}
