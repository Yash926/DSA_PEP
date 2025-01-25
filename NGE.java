import java.util.*;
public class NGE{
    public static void main(String[] args)
    {
        int arr[]={4,5,2,10,8,7,6};
        //for each element in the array i will find the next greater element to its right}
        // compare arr[i] with stack top;
        // while arr[i]>top:pop()
        //nge (to,-1);
        // st.push(arr[i])
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(st.size()>0 && arr[i]>st.peek())
            {
                st.pop();
            }
            if(st.size()>0)
            {
                ans.add(st.peek());
            }
            else
            {
                ans.add(-1);
            }
            st.push(arr[i]);

        }
        Collections.reverse(ans);
        System.out.println(ans);
}
}


// import java.util.*;
// public class NGE{
//     public static void main(String[] args){
//         int arr[]={4,5,2,10,8,7,6};
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             int nge=-1;
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[j]>arr[i])
//                 {
//                     nge=arr[j];
//                     ans.add(nge);
//                     break;
//                 }
//             }
//             if(nge==-1)
//             {
//                 ans.add(-1);
//             }
//         }
//         System.out.println(ans);
//         }
// }