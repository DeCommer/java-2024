import java.util.Scanner;

public class ContactMain {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager(contactData());

        displayContacts(contactManager);

        System.out.print("\nYou have 8 contacts. Enter 'e' to edit them: " );
        String status = in.nextLine();

        while(status.equals("e")) {
            System.out.print("\nChoose and index from 0 to 7: ");
            int index = in.nextInt();
            in.nextLine();
            contactManager.setContact(editedContact(), index);
            System.out.println("\n\nUPDATED CONTACTS\n\n");
            displayContacts(contactManager);
            System.out.println("Enter 'e' to make more changes");
            status = in.nextLine();
        }
        
        //Task 4: Test your constructor by creating four instances (objects) of the Contact class.
        // Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        // Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        // Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        // Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");
        //Task 5: Use breakpoints to visualize the initialization of each field as objects are created.

        //Task 6: Test the copy constructor by creating two objects with fields copied from two existing objects.
        // Contact copyContact1 = new Contact(contact1);
        // Contact copyContact2 = new Contact(contact4);
        //Task 7: Use breakpoints to inspect field initialization in the new objects created using the copy constructor.

        //Task 12: Update the birthDate of one of the previously created objects:
        //contact1.setBirthDate(1979-10-04);

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

    public static void displayContacts(ContactManager contactManager) {
        for(int i=0; i < 8; i++) {
            Contact contact = contactManager.getContact(i);
            System.out.println(contact);
            System.out.println("\n");
        }
    }

    public static Contact editedContact() {
        System.out.print("\tName: ");
        String name = in.nextLine();
        System.out.print("\tPhone Number: ");
        String phoneNumber = in.nextLine();
        System.out.print("\tBirth Date: ");
        String birthDate = in.nextLine();

        return new Contact(name, phoneNumber, birthDate);
    }
}
