import java.util.Scanner;

public class Practice {
    
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = in.nextDouble();
            
            System.out.print("Enter Second number: ");
            double b = in.nextDouble();
            
            double c = Math.hypot(a, b);
            
            System.out.println(c);
        }
    }
}
 