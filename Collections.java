// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
// import java.util.Set;
// import java.util.HashSet;
// import java.util.TreeSet;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.Arrays;
import java.util.*; //replaces above
// import java.util.stream.Stream; //replaces above

public class Collections
    {
    public static void main(String[] args)
        {

            Collection<Integer> nums = new ArrayList<Integer>();
            nums.add(2);
            nums.add(5);
            nums.add(7);
            nums.add(4);

            for(int num : nums)
                {
                    System.out.println("From Collection: " + num);
                }

            Iterator<Integer> values = nums.iterator();
            
            System.out.println("");
            while(values.hasNext()) 
                {
                    System.out.println("From Iterator " + values.next());
                }

            List<Integer> nums2 = new ArrayList<Integer>();
            nums2.add(3);
            nums2.add(5);
            nums2.add(7);
            nums2.add(8);

            System.out.println("");
            System.out.println("From List: " + nums2.indexOf(7));
            System.out.println("From List: " + nums2.get(2));
            System.out.println("");

            Set<Integer> nums3 = new HashSet<Integer>(); //No repeats, not sorted, no indexes
            nums3.add(3);
            nums3.add(7);
            nums3.add(357);
            nums3.add(3435);
            nums3.add(753);

            for(int hashNum : nums3) 
                {
                    System.out.println("From HashSet " + hashNum);
                }

            System.out.println("");

            Set<Integer> nums4 = new TreeSet<Integer>(); //No repeats, sorted, no indexes
            nums4.add(6);
            nums4.add(12);
            nums4.add(9);
            nums4.add(15);
            nums4.add(3);

            for(int treeNum : nums4) 
                {
                    System.out.println("From TreeSet " + treeNum);
                }

            //HashTable is synchronized through threads, HashMap is not

            Map<String, Integer> favoritePeople = new HashMap<>(); //Keys are unique (set),  
            favoritePeople.put("Constance", 1);
            favoritePeople.put("Grand Mammie", 2);
            favoritePeople.put("Spoons", 3);

            System.out.println(favoritePeople);
            // System.out.println(favoritePeople.get("Constance"));
            System.out.println(favoritePeople.keySet());

            for(String key : favoritePeople.keySet())
                { //printing all key and values from Map
                    System.out.println(key + " : " + favoritePeople.get(key));
                }

            //Stream API (Map Filter Reduce)

            List<Integer> nums5 = Arrays.asList(4, 5, 7, 3, 2 ,6);

            // Stream<Integer> s1 = nums5.stream();
            // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); //filter for even nums
            // Stream<Integer> s3 = s2.map(n -> n * 2); //Mapping to double each nums
            // int result = s3.reduce(0, (oof, doof) -> oof + doof);

            int result = nums5.stream() // replaces all of avove
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (glug, blug) -> glug + blug);

            // s3.forEach(n -> System.out.println(n));
            System.out.println(result);
        }
    }