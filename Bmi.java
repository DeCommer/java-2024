import java.util.Scanner;

public class Bmi
    {
        public static void main(String[] args)
            {

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
        
                double bmi = ((joseph.getWeight() / Math.pow(joseph.getHeight(), 2)) * 703);

                System.out.println("");

                System.out.println("Hello, " + joseph.getfName());
                System.out.println("For an age of " + joseph.getAge() + " years old");
                System.out.println("With your weight being " + joseph.getWeight() + "lbs");
                System.out.println("And a height of " + joseph.getHeight() + "in");
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

                input.close();
            }
    }