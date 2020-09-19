import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Menu\n" +
                    "\n" +
                    "1.Add Contact\n" +
                    "\n" +
                    "2.Display all contacts\n" +
                    "\n" +
                    "3.Search contact by phone \n" +
                    "\n" +
                    "4.Remove contact\n" +
                    "\n" +
                    "5.Exit\n" +
                    "\n" +
                    "Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("Add a Contact:");

                    System.out.println("Enter the First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter the Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter the Phone No.: ");
                    long phoneNumber = Long.parseLong(scanner.nextLine());

                    System.out.println("Enter the Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(firstName, lastName, phoneNumber, email);
                    phoneBook.addContact(contact);

                    break;
                }
                case 2: {
                    System.out.println("The contacts in the List are:");

                    for (Contact contact : phoneBook.viewAllContacts()) {
                        System.out.println("First Name: " + contact.getFirstName());
                        System.out.println("Last Name: " + contact.getLastName());
                        System.out.println("Phone No.: " + contact.getPhoneNumber());
                        System.out.println("Email: " + contact.getEmailId());
                    }

                    break;
                }
                case 3: {
                    System.out.println("Enter the Phone number to search contact:");
                    long phoneNumber = Long.parseLong(scanner.nextLine());
                    Contact contact = phoneBook.viewContactGivenPhone(phoneNumber);

                    if (contact == null) {
                        // I don't wanna deal with null pointer exception
                    } else {
                        System.out.println("The contact is:");
                        System.out.println("First Name: " + contact.getFirstName());
                        System.out.println("Last Name: " + contact.getLastName());
                        System.out.println("Phone No.: " + contact.getPhoneNumber());
                        System.out.println("Email: " + contact.getEmailId());
                    }

                    break;
                }
                case 4: {
                    System.out.println("Enter the Phone number to remove :");
                    long phoneNumber = Long.parseLong(scanner.nextLine());

                    System.out.println("Do you want to remove the contact (Y/N): ");
                    String option = scanner.nextLine();

                    if (option.startsWith("Y") || option.startsWith("y")) {
                        boolean isContactRemoved = phoneBook.removeContact(phoneNumber);

                        if (isContactRemoved) {
                            System.out.println("The contact is successfully deleted.");
                        } else {
                            // No instruction given
                        }
                    } else  if (option.startsWith("N") || option.startsWith("n")) {
                        // Don't remove
                    } else {
                        // Wrong input
                    }
                }
            }
        }
    }
}
