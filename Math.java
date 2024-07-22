import java.util.List;

import java.util.Random;



public class Math
    {
        public static void main(String[] args)
        {
            //Calculate an average from an array of numbers
            int[] nums = {25, 50, 40, 70, 80, 30};
            avg(nums);
        }

        public static int[] avg(int[] arr) 
            {
                int average = 0;
                int count = 0;
                for(int i = 0; i < arr.length; i++)
                    {
                        count++;
                        average += arr[i];
                        System.out.print(arr[i] + " ");
                    }
                System.out.println("");
                try
                    {
                        double averageOut = (double) average / count;
                        System.out.println("The average is: " + averageOut);
                    }
                catch(ArithmeticException e)
                    {
                        System.out.println("Divide by zero error");
                    } 
                    return arr;
                    
            }


    }
