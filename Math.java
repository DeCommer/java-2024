import java.util.Random;

public class Math
    {
        public static void main(String[] args)
        {
            //Calculate an average from an array of numbers
            int[] nums = {25, 50, 40, 70, 80, 30};
            int average = 0;
            int count = 0;
            for(int i = 0; i < nums.length; i++)
                {
                    count++;
                    average += nums[i];
                    System.out.print(nums[i] + " ");
                }
            System.out.println("");
            try {
                double averageOut = (double) average / count;
                System.out.println("The average is: " + averageOut);
            } catch(ArithmeticException e) {
                System.out.println("Divide by zero error");
            }  
        }
    }
