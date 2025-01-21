
// class Solution {

// public int length(ListNode head)
// {
// ListNode temp = head ;
// int count =0 ;
// while(temp != null)
// {
// count++ ;
// temp = temp.next ;
// }
// return count ;
// }
// public ListNode rotateRight(ListNode head, int k) {
// if(head == null)
// {
// return null ;
// }

// k = k%length(head) ;
// for(int i =0 ;i<k ;i++)
// {
// // deletion from end
// ListNode tail = head ;
// ListNode prev = null;
// while(tail.next != null)
// {
// prev = tail ;
// tail = tail.next ;
// }

// ListNode temp = tail ;
// if (prev == null)
// {
// return head ;
// }
// prev.next = null ;
// // insert from front
// temp.next = head ;
// head = temp;
// }

// return head;




// }
// }