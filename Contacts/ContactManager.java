
//Tast 15: Create a new file named ContactManager.java. Inside the file, create the ContactManager class.
public class ContactManager {
    // Task 15: The ContactManager class will define the following field:
    private Contact[] contacts;

    //Task 16: Create a constructor for the ContactManager class that takes an array of Contact objects as a parameter.
    public ContactManager(Contact[] contacts) {
        //The constructor must initialize the contacts field with deep copies of the objects.
        // 1. set field equal to a new array with the same length as the parameter
        this.contacts = new Contact[contacts.length];
         // 2. Set each element in the field equal to a deep copy of an object in the contacts parameter
        for(int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }

    public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }

}
