import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactsManager {
    private List<Contact> contactsList;
    private HashMap<String, Contact> contactsMap;

    public ContactsManager() {
        contactsList = new ArrayList<>();
        contactsMap = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contactsList.add(newContact);
        contactsMap.put(name.toLowerCase(),newContact);
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


    public void searchContactByName(String name){
        Contact contact = contactsMap.get(name.toLowerCase());
        if (contact !=null){
            System.out.println("Contact found: " + contact);
        } else {
        System.out.println("No contact found with the entered name: "+ name);
        }
    }
}
