import java.util.*;
public class QueueLinked{
    public static void main(String[] args)
    {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.offer(30);
        int f=q.poll();
        System.out.println(f);
        System.out.println(q);
        int p=q.peek();
        System.out.println(p);
        System.out.println(q);
    }
}


// import java.util.* ;

// public class Main {
// public static void main(String[] args) {
// Queue<Integer> q = new LinkedList<>() ;
// Stack<Integer> st = new Stack<>();
// // push , pop , isEmpty() , peek
// // add/offer , poll , peek , IsEmpty
// q.add(10);
// q.add(20);
// q.offer(30);

// int f = q.poll();
// System.out.println(f) ;
// System.out.println(q) ;
// int p = q.peek() ;
// System.out.println(p) ;
// System.out.println(q) ;


// }
// }