import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class DeCommerExeption extends Exception
    {
        public DeCommerExeption(String string)
            {
                super(string);
            }
    }

public class Exeptions{

    public static void main(String[] args) throws IOException{
        int i = 2;
        int j = 0;

        try {
            j = 18/j;
            if(j == 0){
                throw new DeCommerExeption("Zero in denominator " );
            }
        }catch(ArithmeticException e) {
                j = 18/i;
                System.out.println("Zero in denominator results in default " + e);
            }catch(DeCommerExeption e){
                System.out.println("Not running " + e);
            }
        System.out.println(j);
        System.out.println("End");
        BufferedReader bf;
        try ( /************************/ Scanner input = new Scanner(System.in)) {
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            System.out.print("Enter a number: ");
            int num2 = Integer.parseInt(bf.readLine());
            System.out.print("Enter a number: ");
            int num3 = input.nextInt();
            System.out.println("You entered " + num2 + " From BufferReader");
            System.out.println("You entered " + num3 + " From Scanner");
        }
        bf.close();
        }
    }
