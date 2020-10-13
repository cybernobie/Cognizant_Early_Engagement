import java.util.Scanner;

public class TestApplication {
    private static AddressBook.Address getAddress(String addressType) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the " + addressType);

        System.out.println("Enter the house name");
        String house = scanner.nextLine();

        System.out.println("Enter the street");
        String street = scanner.nextLine();

        System.out.println("Enter the city");
        String city = scanner.nextLine();

        System.out.println("Enter the state");
        String state = scanner.nextLine();

        AddressBook.Address address = new AddressBook.Address();
        address.setName(house);
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);

        return address;
    }

    private static void printAddress(AddressBook.Address address, String addressType) {
        System.out.println(addressType);
        System.out.println("House name:" + address.getName());
        System.out.println("Street:" + address.getStreet());
        System.out.println("City:" + address.getCity());
        System.out.println("State:" + address.getState());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddressBook.Address permAddress = getAddress("permanent address");
        AddressBook.Address tempAddress = getAddress("temporary address");

        System.out.println("Enter the phone number");
        long phoneNumber = Long.parseLong(scanner.nextLine());

        AddressBook addressBook = new AddressBook();
        addressBook.setPhoneNumber(phoneNumber);
        addressBook.setPermAddress(permAddress);
        addressBook.setTempAddress(tempAddress);

        printAddress(addressBook.getPermAddress(), "Permanent Address");
        printAddress(addressBook.getTempAddress(), "Temporary Address");

        System.out.println("Phone number");
        System.out.println(addressBook.getPhoneNumber());
    }
}
