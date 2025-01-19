// class Solution {
//     public static int findUnion(int a[], int b[]) {
//         HashSet<Integer> set=new HashSet<>();
//         for(int num1:a)
//         {
//             set.add(num1);
//         }
//         for(int num2:b)
//         {
//             set.add(num2);
//         }
//         return set.size();
//     }
// }

import java.util.HashSet;
public class union {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
       
        HashSet<Integer> set=new HashSet<>();
        for(int num1:a)
        {
            set.add(num1);
        }
        for(int num2:b)
        {
            set.add(num2);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
