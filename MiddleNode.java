// public /**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
// class Solution {
//    public int length(ListNode head){
//        ListNode temp=head;
//        int cnt=0;
//        while(temp!=null)
//        {
//            cnt++;
//            temp=temp.next;
//        }
//        return cnt;
//    }
//    public ListNode middleNode(ListNode head) {
//        ListNode t=head;
//        int count;
//        int l=length(head);
//        int m=0;
//        if(head==null)
//        {
//            return null;
//        }
//        if(l%2==0)
//        {
//            m=(l/2);
//        }
//        else{
//            m=l/2;
//        }
//        int i=0;
//        while(t!=null)
//        {
//            if(i==m)
//            {
//                return t;
//            }
//            i++;
//            t=t.next;
//        }
//        return null;

         
//    }
// }


//middle node deletion cde

// if (head == null || head.next == null) {
//     return null;
//     }
//     ListNode fast = head;
//     ListNode slow = head;
//     ListNode prev = null ;
    
//     while (fast != null && fast.next != null)
//     {
//     fast = fast.next.next ;
//     prev = slow;
//     slow = slow.next ;
//     }
    
//     prev.next = slow.next;
//     return head ;
