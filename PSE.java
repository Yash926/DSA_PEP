import java.util.*;
public class PSE{
    public static void main(String[] args)
    {
        int arr[]={4,5,2,10,8,7,6};
        // int arr[]={1,3,4,2};
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();  
        for(int i=0;i<arr.length;i++)
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
        System.out.println(ans);
    }
}