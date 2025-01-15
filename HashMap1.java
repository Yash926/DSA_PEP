import java.util.HashMap;   // import the HashMap class
public class HashMap1 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.remove("b");
        int size=map.size();
        System.out.println(size);
        int v3=map.get("a");
        System.out.println(v3);
        boolean v1=map.containsKey("b");
        System.out.println(v1);
        int v2=map.getOrDefault("c",0);
        System.out.println(v2);
        System.out.println(map);
    }

}
//no dublicate keys are allowed
