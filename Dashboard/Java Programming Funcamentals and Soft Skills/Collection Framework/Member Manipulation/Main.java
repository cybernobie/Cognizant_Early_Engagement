import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1.Add Member\n" +
                    "2.View All Members\n" +
                    "3.Search Member by address\n" +
                    "4.Exit\n" +
                    "Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter the id");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter the name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter the address:");
                    String address = scanner.nextLine();

                    Member member = new Member(id, name, address);
                    library.addMember(member);

                    break;
                }
                case 2: {
                    for (Member member : library.viewAllMembers()) {
                        System.out.println("Id:" + member.getMemberId());
                        System.out.println("Name:" + member.getMemberName());
                        System.out.println("Address:" + member.getAddress());
                    }

                    break;
                }
                case 3: {
                    System.out.println("Enter the address");
                    String address = scanner.nextLine();
                    List<Member> memberList = library.viewMembersByAddress(address);

                    if (memberList.isEmpty()) {
                        // No instruction given!
                    } else {
                        for (Member member : library.viewAllMembers()) {
                            System.out.println("Id:" + member.getMemberId());
                            System.out.println("Name:" + member.getMemberName());
                            System.out.println("Address:" + member.getAddress());
                        }
                    }

                    break;
                }

                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}
