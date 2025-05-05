import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactsManager {
    private List<Contact> contactsList;

    public ContactsManager() {
        contactsList = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contactsList.add(newContact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contactsList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contactsList) {
                System.out.println(contact);
            }
        }
    }
}
