import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number would you like to fizzzbuzz up to: ");

        int userIn = input.nextInt();

        for(int i = 0; i < userIn; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            }else if( i % 5 == 0) {
                System.out.println("Buzz");
            }else {
            System.out.println(i);
            }
        }
        input.close();
    }
}
