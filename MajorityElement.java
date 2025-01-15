import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int target=arr.length/2;
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>target)
            {
                System.out.println(key);
                break;
            }
        }

    
    }
}
//Sir code

// int arr [] = {2,2,1,1,1,2,2} ;
// // freq
// HashMap<Integer , Integer> map = new HashMap<>() ;
// int target = arr.length/2 ;
// for(int i =0 ;i<arr.length ;i++)
// {
// map.put(arr[i] , map.getOrDefault(arr[i] , 0) +1) ;
// }

// // keyset
// for(int key : map.keySet())
// {
// if (map.get(key) > target )
// {
// System.out.println(key);
// break ;
// }


