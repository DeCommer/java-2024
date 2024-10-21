///Here's a fun one.
/// Create a user entered array length with random elements
/// return the array element total, array sum, and average


public class MathDemo
    {
        public static void main(String[] args)
            {
                //Calculate an average from an array of numbers
                int[] nums = {20, 50, 40, 70, 80, 60, 30};
                avg(nums);
            }

        public static int[] avg(int[] arr) 
            {
                int arrTotal = 0;
                int count = 0;
                for(int i = 0; i < arr.length; i++)
                    {
                        count++;
                        arrTotal += arr[i];
                        System.out.print(arr[i] + " ");
                    }
                System.out.println("");
                try
                    {
                        System.out.printf("Array total: %d \n", arrTotal);
                        System.out.printf("Elements in array: %d\n", count);

                        double averageOut = (double) arrTotal / count;
                        System.out.printf("The average is: %d / %d = %.2f",arrTotal, count, averageOut);
                    }
                catch(ArithmeticException e)
                    {
                        System.out.println("Divide by zero error");
                    } 
                    return arr;
            }
    }
