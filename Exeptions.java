import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

class DeCommerExeption extends Exception {
    public DeCommerExeption(String string) {
        super(string);
    }
}

public class Exeptions {

    public static void main(String[] args) throws IOException {

        int i = 2;
        int j = 0;

        try {
            j = 18/j;
            if(j == 0) {
                throw new DeCommerExeption("Zero in denominator " );
            }
        }catch(ArithmeticException e) {
            j = 18/i;
            System.out.println("Zero in denominator results in default " + e);
        }catch(Exception e) {
            System.out.println("Not running " + e);
        }
        System.out.println(j);
        System.out.println("End");

        /************************/

        System.out.println("Enter a number: ");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num2 = Integer.parseInt(bf.readLine());

        Scanner input = new Scanner(System.in);
        int num3 = input.nextInt();

        System.out.println("You entered " + num2 + " From BufferReader");
        System.out.println("You entered " + num3 + " From Scanner");

        input.close();
        bf.close();

    }
}
