import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<>();

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addContact(Contact contact) {
        phoneBook.add(contact);
    }

    public List<Contact> viewAllContacts() {
        return phoneBook;
    }

    public Contact viewContactGivenPhone(long phoneNumber) {
        for (Contact contact : phoneBook) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return contact;
            }
        }

        return null;
    }

    public boolean removeContact(long phoneNumber) {
        Contact contact = viewContactGivenPhone(phoneNumber);

        if (contact == null) {
            return false;
        } {
            return phoneBook.remove(contact);
        }
    }
}
