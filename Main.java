import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactsManager manager = new ContactsManager();
        int option;

        while (true) {
            System.out.println("\n=== Contacts List Manager ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter a phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter a email address: ");
                    String email = scanner.nextLine();
                    manager.addContact(name, phoneNumber, email);
                    break;

                case 2:
                    manager.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchContactByName(searchName);
                    break;
                
                case 4:
                    System.out.println("\nExiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
