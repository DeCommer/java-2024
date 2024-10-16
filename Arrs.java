//import java.util.Arrays;
import java.util.ArrayList;

public class Arrs
    {
    
    public static void main(String[] args)
        {
            // int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            // int[][] nums2d = {{1,2,3,4,5}, {6,7,8,9,0}};
            // int sum = 0;

            // for(int i = 0; i < nums.length; i++) {
            //     sum += nums[i];
            // }
            // System.out.println(sum);

            // int number = 5;

            // for(int multiplier = 1; multiplier < 10; multiplier++) {
            //     System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
            // }

            // for (int n = 1; n <= 12; n++) { //multiplication table
            //     for(int m = 1; m <= 12; m++) {
            //         System.out.printf("%d x %d = %d \n", n, m, n * m);
            //     }
            //     System.out.println("");
            // }

            // for(int n = 1; n <= 12; n++) { // formatted multiplication table
            //     for(int m = 1; m <= 12; m++) {
            //         System.out.printf("%3d ", n * m );
            //     }
            //     System.out.println("");
            // }

            ArrayList<Integer> list1 = new ArrayList<>();

            list1.add(1); // 0 index
            list1.add(2); // 1
            list1.add(3); // 2
            list1.add(4); // 3
            list1.add(5); // 4

            // System.out.println(list1.size());
            // System.out.print("toString: " + list1.toString() + "\n");
            // list1.set(3, Integer.valueOf(900));

            System.out.println("Before: " + list1.toString());

            list1.forEach(n -> {
                list1.set(list1.indexOf(n), n * 2);
            });
            System.out.printf("After: " + list1.toString());

            for(int n = 0; n <= list1.size(); n++)
                {
                    n *= 2;
                    System.out.println("After: " + n);
                }
        }
    }
