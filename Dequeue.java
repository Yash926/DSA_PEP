
import java.util.* ;

public class Dequeue{
public static void main(String[] args) {
Deque<Integer> dq = new ArrayDeque<>() ;
dq.addFirst(10);
dq.addFirst(20);
dq.addFirst(30);
dq.addLast(50);

// dq.removeFirst() dq.removeLast() dq.peekFirst() , dq.peekLast()
System.out.println(dq);



}
}