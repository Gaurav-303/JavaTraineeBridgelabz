package opps.contactsApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsApp {

    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CONTACTS APP =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Username: ");
                    String uname = sc.nextLine();

                    System.out.print("Password: ");
                    String pass = sc.nextLine();

                    users.add(new User(uname, pass));
                    System.out.println("Registration Successful!");
                    break;

                case 2:
                    System.out.print("Username: ");
                    uname = sc.nextLine();

                    System.out.print("Password: ");
                    pass = sc.nextLine();

                    User loggedIn = null;

                    for (User u : users) {
                        if (u.getUsername().equals(uname)
                                && u.checkPassword(pass)) {
                            loggedIn = u;
                            break;
                        }
                    }

                    if (loggedIn == null) {
                        System.out.println("Invalid Credentials!");
                        break;
                    }

                    System.out.println("Login Successful!");

                    ContactManager manager = new ContactManager();

                    while (true) {

                        System.out.println("\n1. Add Contact");
                        System.out.println("2. View Contacts");
                        System.out.println("3. Search Contact");
                        System.out.println("4. Edit Contact");
                        System.out.println("5. Delete Contact");
                        System.out.println("6. Logout");

                        int option = sc.nextInt();
                        sc.nextLine();

                        switch (option) {

                            case 1:
                                System.out.print("Name: ");
                                String name = sc.nextLine();

                                System.out.print("Phone: ");
                                String phone = sc.nextLine();

                                System.out.print("Email: ");
                                String email = sc.nextLine();

                                System.out.print("Tag: ");
                                String tag = sc.nextLine();

                                System.out.print("Note: ");
                                String note = sc.nextLine();

                                manager.addContact(
                                        new Contact(name, phone,
                                                email, tag, note));
                                break;

                            case 2:
                                manager.viewContacts();
                                break;

                            case 3:
                                System.out.print("Enter Name: ");
                                name = sc.nextLine();

                                Contact found =
                                        manager.searchContact(name);

                                if (found != null)
                                    found.display();
                                else
                                    System.out.println("Not Found!");
                                break;

                            case 4:
                                System.out.print("Enter Name: ");
                                name = sc.nextLine();

                                Contact edit =
                                        manager.searchContact(name);

                                if (edit != null) {

                                    System.out.print("New Phone: ");
                                    phone = sc.nextLine();

                                    System.out.print("New Email: ");
                                    email = sc.nextLine();

                                    System.out.print("New Tag: ");
                                    tag = sc.nextLine();

                                    System.out.print("New Note: ");
                                    note = sc.nextLine();

                                    edit.update(phone, email,
                                            tag, note);

                                    System.out.println("Updated!");
                                } else {
                                    System.out.println("Contact Not Found!");
                                }
                                break;

                            case 5:
                                System.out.print("Enter Name: ");
                                name = sc.nextLine();

                                manager.deleteContact(name);
                                break;

                            case 6:
                                System.out.println("Logged Out!");
                                break;

                            default:
                                System.out.println("Invalid Choice!");
                        }

                        if (option == 6)
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
