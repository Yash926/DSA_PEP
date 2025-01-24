import java.util.*;
public class NSE{
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
            while(st.size()>0 && arr[i]<st.peek())
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





// / Online Free Java compiler to run Java program online
// import java.util.* ;
// public class Main {
// public static void main(String[] args) {
// int arr [] = {4, 5, 2, 10, 8, 7, 6};
// [-1, -1, 5, -1, 10, 8, 7]
// // iterate from back
// // compare arr[i] with stack top
// // while arr[i] > top : pop()
// // nge (top , -1)
// // st.push(arr[i])
// Stack<Integer> st = new Stack<>() ;
// ArrayList<Integer> ans = new ArrayList<>() ;
// for(int i =0 ; i < arr.length ;i++)
// {
// while (st.size() > 0 && arr[i] > st.peek())
// {
// st.pop() ;
// }
// if(st.size() > 0 )
// {
// ans.add(st.peek());
// }
// else
// {
// ans.add(-1);
// }
// st.push(arr[i]) ;
// }


// System.out.println(ans);
// }
// }