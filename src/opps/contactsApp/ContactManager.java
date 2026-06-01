package opps.contactsApp;

import java.util.ArrayList;

class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found.");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }

    public Contact searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public void deleteContact(String name) {
        Contact c = searchContact(name);

        if (c != null) {
            contacts.remove(c);
            System.out.println("Contact Deleted Successfully!");
        } else {
            System.out.println("Contact Not Found!");
        }
    }
}
