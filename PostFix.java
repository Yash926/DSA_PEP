import java.util.*;
public class PostFix{
    public static void main(String[] args) {
       String exp[]= {"5","3","4","*","+"};
       //if i get a number i will push it to stack
       //if i get a operator i will pop 2 elements from stack and perform the operation and push the result back to stack
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<exp.length;i++){
        String c=exp[i];
        if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
            int b=st.pop();  //2nd operand
            int a=st.pop(); //1st operand
            int ans=0;
            switch(c){
                case "+":
                   st.push(a+b);
                    break;
                case "-":
                   st.push(a-b);
                    break;
                case "*":
                    st.push(a*b);
                    break;
                case "/":
                    st.push(a/b);
                    break;
            }
           
        }
        else{
            st.push(Integer.parseInt(c));
        }
       }
       System.out.println(st.peek());
    }
}