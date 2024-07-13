import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j) {

                if(i % 10 > j % 10) {
                    return 1;
                }else {
                    return -1;
                }
            }
        };


        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(64);
        nums.add(28);
        nums.add(85);
        nums.add(31);

        // System.out.println("Original: " + nums);

        Collections.sort(nums, com);
        System.out.println("Sorted: " + nums);

    }
}
