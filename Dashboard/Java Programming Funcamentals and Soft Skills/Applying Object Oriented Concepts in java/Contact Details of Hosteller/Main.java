import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static Hosteller getHostellerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = scanner.nextInt();

        System.out.println("Student Name");
        String name = scanner.next();

        System.out.println("Department Id");
        int department = scanner.nextInt();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Phone Number");
        String phNo = scanner.next();

        System.out.println("Hostel Name");
        String hostel = scanner.next();

        System.out.println("Room Number");
        int room = scanner.nextInt();

        Hosteller hosteller = new Hosteller();
        hosteller.setStudentId(id);
        hosteller.setName(name);
        hosteller.setDepartmentId(department);
        hosteller.setGender(gender);
        hosteller.setPhone(phNo);
        hosteller.setHostelName(hostel);
        hosteller.setRoomNumber(room);

        return hosteller;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hosteller hosteller = getHostellerDetails();

        System.out.println("Modify Room Number");
        boolean updateRoom = scanner.next().equals("Y");

        if (updateRoom) {
            System.out.println("New Room Number(Y/N)");
            int room = scanner.nextInt();
            hosteller.setRoomNumber(room);
        }

        System.out.println("Modify Phone Number(Y/N)");
        boolean updatePhone = scanner.next().equals("Y");

        if (updatePhone) {
            System.out.println("New Phone Number");
            String phNo = scanner.next();
            hosteller.setPhone(phNo);
        }

        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(String.valueOf(hosteller.getStudentId()))
                .add(hosteller.getName())
                .add(String.valueOf(hosteller.getDepartmentId()))
                .add(hosteller.getGender())
                .add(hosteller.getPhone())
                .add(hosteller.getHostelName())
                .add(String.valueOf(hosteller.getRoomNumber()));

        System.out.println("The Student Details:");
        System.out.println(stringJoiner.toString());
    }
}
