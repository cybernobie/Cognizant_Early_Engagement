import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int associateId, days;
        String associateName;

        System.out.println("Enter the associate id:");
        associateId = scanner.nextInt();

        System.out.println("Enter the associate name:");
        associateName = scanner.next();

        System.out.println("Enter the number of days:");
        days = scanner.nextInt();

        if (days < 0) {
            System.out.println("Invalid Input");
        } else {
            Associate associate = new Associate();
            associate.setAssociateId(associateId);
            associate.setAssociateName(associateName);
            associate.trackAssociateStatus(days);

            System.out.println("The associate " + associate.getAssociateName() + " work status:" + associate.getWorkStatus());
        }
    }
}