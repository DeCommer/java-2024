import java.util.Scanner;

public class ContactMain {

    static Scanner in = new Scanner(System.in);

    public static Contact[] contactData() {
        return new Contact[] {
            new Contact("John Doe", "555-123-4567", "1985-01-01"),
            new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
            new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
            new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
            new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
            new Contact("Diana White", "555-333-4444", "1997-11-18"),
            new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
            new Contact("Fiona Black", "555-777-8888", "2002-10-31")
        };
    }

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager(contactData());
        
        // Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        // Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        // Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        // Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");

        // Contact[] contacts = {contact1, contact2};
        // ContactManager contactMan = new ContactManager(contacts);

        // Contact retrievedContact = contactMan.getContact(0);
        // System.out.println(retrievedContact.getName());

        // Contact newContact = new Contact("Joseph", "616-284-1479", "1979-10-04");
        // contactMan.setContact(newContact, 0);

        // retrievedContact = contactMan.getContact(0);
        // System.out.println(retrievedContact.getName());

        in.close();
    }
}
