// // size unlimited
class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }

}
public class LinkedList {
    public static void main(String[] args){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);

        n1.next=n2;
        n2.next=n3;

        Node temp=n1;  //iterator
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    
}


// class Node
// {
// int val ;
// Node next ;

// Node(int val)
// {
// this.val = val ;
// this.next = null ;
// }
// }
// public class Main {
// public static void main(String[] args) {

// Node n1 = new Node(1) ;
// Node n2 = new Node(2) ;
// Node n3 = new Node(3);
// n1.next = n2 ;
// n2.next = n3 ;

// Node temp = n1 ;

// while(temp != null)
// {
// System.out.println(temp.val);
// temp = temp.next ;
// }
// }


// Inserting in Front
