import java.util.Map;
import java.util.TreeMap;


public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Constance");
        treeMap.put(3, "Spoons");
        treeMap.put(2, "Joseph");

        System.out.println(treeMap);

        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
        }
    }

}
