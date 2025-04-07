package ShadowFox.Task1;
import java.util.ArrayList;
import java.util.Scanner;

// Contact class to represent individual contacts
class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email;
    }
}

// Main Contact Management System
public class CMS {
    static ArrayList<Contact> contactList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phone, email);
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    static void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n--- Contact List ---");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("\nContact #" + (i + 1));
            System.out.println(contactList.get(i));
        }
    }

    static void updateContact() {
        System.out.print("Enter the name of the contact to update: ");
        String name = scanner.nextLine();

        for (Contact contact : contactList) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new phone number: ");
                contact.phone = scanner.nextLine();

                System.out.print("Enter new email address: ");
                contact.email = scanner.nextLine();

                System.out.println("Contact updated successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }

    static void deleteContact() {
        System.out.print("Enter the name of the contact to delete: ");
        String name = scanner.nextLine();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).name.equalsIgnoreCase(name)) {
                contactList.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }
}
