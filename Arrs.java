import java.util.Arrays;

public class Arrs {
    
    public static void main(String[] args) {
        // int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int nums2d[][] = {{1,2,3,4,5}, {6,7,8,9,0}};
        // int sum = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        // }
        // System.out.println(sum);

        // int number = 5;

        // for(int multiplier = 1; multiplier < 10; multiplier++) {
        //     System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
        // }

        for (int n = 1; n < 10; n++) {
            for(int m = 1; m < 10; m++) {
                System.out.printf("%d x %d = %d \n", n, m, n * m);
            }
            System.out.println("");
        }


    }
}
