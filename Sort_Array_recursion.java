// public class Sort_Array_recursion {
//     public static void main(String[] args) {
//         int[] arr = { 5, 4, 3, 2, 1 ,9 , 5 ,10};
//         sort(arr, arr.length);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void sort(int[] arr, int n) {
//         if (n == 1) {
//             return;
//         }
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 int temp = arr[i];
//                 arr[i] = arr[i + 1];
//                 arr[i + 1] = temp;
//             }
//         }
//         sort(arr, n - 1);
//     }
// }   
import java.util.ArrayList;

class Sort_Array_recursion{
    public static void main(String[] args){
        int[] arr={5, 4, 3, 2, 1 ,9 , 5, 10};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Sort(list);
        System.out.println(list);
    }


public static void Sort(ArrayList<Integer> list){
    if(list.size()==1)
    {
        return;
    }
    int temp=list.get(list.size()-1);
    list.remove(list.size()-1);
    Sort(list);
    insert(list,temp);
}


public static void insert(ArrayList<Integer> list,int temp){
    if(list.size()==0||list.get(list.size()-1)<=temp)
    {
        list.add(temp);
        return;
    }
    int val=list.get(list.size()-1);
    list.remove(list.size()-1);
    insert(list,temp);
    list.add(val);
}
}