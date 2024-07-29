import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    private int toAge(String birthDate) {
        LocalDate parsedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(parsedBirthDate, currentDate);
        return period.getYears();
    }

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate; 
        this.age = toAge(birthDate);
    }
 
    public Contact(Contact source) {
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

    private void setAge(int age) {
        this.age = toAge(birthDate);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


}
