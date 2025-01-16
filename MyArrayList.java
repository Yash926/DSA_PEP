import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 50);
        int size = arr.size();
       
        arr.remove(size - 1);
        System.out.println(arr);
    }
}

