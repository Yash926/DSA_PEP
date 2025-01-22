// 






// class MyStack
// {
// int top ;
// int stack [] ;

// MyStack(int size)
// {
// stack = new int[size] ;
// top = -1 ;
// }

// public void push(int val)
// {
// top++ ;
// stack[top] = val ;
// }

// public int pop()
// {
// if(top == -1)
// {
// return -1 ;
// }
// int data = stack[top];
// top-- ;
// return data ;
// }

// public int peek()
// {
// return stack[top];
// }

// public boolean isempty()
// {
// return top == -1 ;
// }

// }
// public class Main {
// public static void main(String[] args) {
// MyStack st = new MyStack(5);
// st.push(10) ;
// st.push(20);
// st.push(30);
// st.push(40) ;
// st.push(50);
// // such cases where you push in the stack but your stack is full . stack overflow
// st.push(60);



// // pop the stack when its empty is called as stack //underflow

// //stack overflow
// System.out.println(st.pop());
// // peek
// // is empty


// }
// }


//Implementing stack using Linked List.


class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class StackLL
{
    Node top;
    StackLL()
    {
        top=null;
    }
    public void push(int val){
    if(top==null)
    {
        top=new Node(val);
    }
    else
    {
        Node temp=new Node(val);
        temp.next=top;
        top=temp;
    }
}
    public int peek(){
        if(top==null)
        {
            return -1;
        }
        return top.val;
    }
    public boolean isempty(){
        return top==null;
    }
    public int pop(){
        if(top==null)
        {
            //Stack underflow
            return -1;
        }
        int data=top.val;
        top=top.next;
        return data;
    }
}
public class StackClass{
    public static void main(String[] args)
    {
        StackLL st=new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isempty());
    }

}




// class MyStackArr
// {
// int top ;
// int stack [] ;

// MyStackArr(int size)
// {
// stack = new int[size] ;
// top = -1 ;
// }

// public void push(int val)
// {
// top++ ;
// stack[top] = val ;
// }

// public int pop()
// {
// if(top == -1)
// {
// return -1 ;
// }
// int data = stack[top];
// top-- ;
// return data ;
// }

// public int peek()
// {
// return stack[top];
// }

// public boolean isempty()
// {
// return top == -1 ;
// }

// }
// class Node
// {
// int val ;
// Node next ;
// Node(int val )
// {
// this.val = val ;
// this.next = null ;
// }
// }
// class StackLL
// {
// Node top ;

// StackLL()
// {
// this.top = null;
// }

// public void push(int val)
// {
// if(top == null)
// {
// top = new Node(val);
// }
// else
// {
// Node temp = new Node(val);
// temp.next = top;
// top = temp ;
// }
// }

// public int peek()
// {
// if(top == null)
// {
// return -1 ;
// }
// return top.val ;
// }

// public boolean isempty()
// {
// return top == null;
// }

// public int pop()
// {
// if(top == null)
// {
// // stack underflow
// return -1 ;
// }
// int data = top.val ;
// top = top.next ;
// return data ;
// }

// }
// public class Main {
// public static void main(String[] args) {

// StackLL st = new StackLL();
// st.push(10);
// st.push(20);
// st.push(30);

// System.out.println(st.pop());

// }
// }