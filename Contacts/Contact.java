import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Contact {
    //Task 1: Create class with fields, name phone number, birth date and age.
    private String name; 
    private String phoneNumber;
    private String birthDate;
    private int age;

    //Task 2: Create a constructor that initializes the fields of a newly created object.
    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate; 
        //Task 8: Modify the Contact class by removing the age parameter from the constructor.
        // this.age = age;

        //Task 10: Modify the constructor to update the age field by calling toAge and passing in the birthDate.
        this.age = toAge(birthDate);
        //Task 11: Use breakpoints to visualize the runtime of the age field being updated automatically from the birthDate.
    }
 
    public Contact(Contact source) { //Task 3: Create a constructor (copy constructor) that initializes a new object using an existing object's fields.
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return this.age;
    }

    /* Task 14: The age should be automatically updated once the birthDate is updated, so make setAge private, 
    * as it should not be accessible outside of this class. We only need to call setAge from setBirthDate so that 
    * age is automatically updated when the birthDate is updated. */


    private void setAge(int age) {
        this.age = toAge(birthDate);
    }

    @Override
    public String toString() {
        return
            "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";

    }

    /*Task 13: Create a toAge method that converts the birthDate string to an age.
    * Then,Convert the String into a LocalDate using the LocalDate.parse method. Ensure that the LocalDate follows the pattern yyyy-MM-dd.
    * Then, Define a LocalDate object representing the current date using the LocalDate.now method.
    * Then, Define a Period object representing the period between two dates using the Period.between method.
    * Then, Extract the number of years from the Period object and return it using the Period.getYears method.
    */
    private int toAge(String birthDate) {
        LocalDate parsedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(parsedBirthDate, currentDate);
        return period.getYears();
    }


}
