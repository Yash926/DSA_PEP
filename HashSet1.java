import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(10);
        // set.add(20);
        // set.remove(10);
        // boolean v1=set.contains(20);
        // System.out.println(v1);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(10);

        HashSet<Integer> set = new HashSet<>(arr);//to remoe dublicate elements


    }
}
