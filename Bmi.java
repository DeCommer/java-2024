import java.util.Scanner;

public class Bmi {

    public static class Person {
        String fName;
        String lName;
        int age;
        int weight;
        double height;
        double bmi;
        public String getfName() {
            return fName;
        }
        public void setfName(String fName) {
            this.fName = fName;
        }
        public String getlName() {
            return lName;
        }
        public void setlName(String lName) {
            this.lName = lName;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getBmi() {
            return bmi;
        }
        public void setBmi(double bmi) {
            this.bmi = bmi;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Person joseph = new Person();

        System.out.print("Enter Name: ");
        String fNameIn = input.nextLine();
        joseph.setfName(fNameIn);

        System.out.print("Age: ");
        int ageIn = input.nextInt();
        joseph.setAge(ageIn);

        System.out.print("Enter Height in Feet.inches Eg. 5.9: ");
        double heightIn = input.nextDouble();
        joseph.setHeight(Math.floor((heightIn * 12) * 100) / 100);

        System.out.print("Enter your weight in lbs: ");
        int weightIn = input.nextInt();
        joseph.setWeight(weightIn);
 
        joseph.setBmi((joseph.getWeight() / Math.pow(joseph.getHeight(), 2)) * 703);

        System.out.println("");

        System.out.println("Hello, " + joseph.getfName());
        System.out.println("For an age of " + joseph.getAge() + " years old");
        System.out.println("With your weight being " + joseph.getWeight() + "lbs");
        System.out.println("And a height of " + joseph.getHeight() + "in");
        System.out.println("");
        System.out.println("Your  BMI is: " + Math.floor(joseph.getBmi() * 100) / 100);

        if(joseph.getBmi() > 25) {
            System.out.println("That is a litle high");
        }else {
            System.out.println("Your BMI is in the normal range!");
        }

        input.close();
    }
}