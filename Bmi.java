import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
                Person person = new Person();

                System.out.print("Enter Name: ");
                String fNameIn = input.nextLine();
                person.setfName(fNameIn);
                    
                System.out.print("Age: ");
                int ageIn = input.nextInt();
                person.setAge(ageIn);

                System.out.print("Enter Height in Feet.inches Eg. 5.9: ");
                double heightIn = input.nextDouble();
                person.setHeight(Math.floor((heightIn * 12) * 100) / 100);

                System.out.print("Enter your weight in lbs: ");
                int weightIn = input.nextInt();
                person.setWeight(weightIn);
        
                double bmi = ((person.getWeight() / Math.pow(person.getHeight(), 2)) * 703);

                System.out.println("");

                System.out.println("Hello, " + person.getfName());
                System.out.println("At " + person.getAge() + " years old");
                System.out.println("With a weight of " + person.getWeight() + "lbs");
                System.out.println("And a height of " + person.getHeight() + "in");
                System.out.println("");
                System.out.println("Your  BMI is: " + Math.floor(bmi * 100) / 100);

                if(bmi < 18.5)
                {
                    System.out.println("You are underweight");
                }else if(bmi > 18.5 && bmi < 24.9)
                {
                    System.out.println("You are healthy");
                }else if(bmi > 24.9 && bmi < 29.9)
                {
                    System.out.println("You are overweight");
                }else if(bmi >= 30 && bmi <= 39.9)
                {
                    System.out.println("You are obese");
                }else if(bmi >= 40)
                {
                    System.out.println("Severely Obese");
                }else
                {
                    System.out.println("Not valid");
                }
            }
        }
    }