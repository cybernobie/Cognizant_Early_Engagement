import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) throws FileNotFoundException {
        String name, parentname;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inmate's name:");
        name = scanner.nextLine();
        System.out.println("Inmate's father's name:");
        parentname = scanner.nextLine();
        if (name.matches("^[a-zA-Z ]+$") && parentname.matches("^[a-zA-Z ]+$")) {
            System.out.println(name + " " + parentname);
        } else {
            System.out.println("Invalid name");
        }
    }
}
