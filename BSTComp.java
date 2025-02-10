class Node
{
int val ;
Node left ;
Node right ;

Node(int val )
{
this.val = val ;
this.left = null ;
this.right = null ;
}
}
public class Main {

public static Node insert(Node root , int val)
{
if(root == null)
{
return new Node(val);
}
if(val > root.val)
{
root.right = insert(root.right , val) ;
}
else
{
root.left = insert(root.left , val);
}

return root ;
}

public static boolean search(Node root , int target)
{
if(root == null)
{
return false ;
}
if(root.val == target)
{
return true ;
}
if(target > root.val)
{
return search( root.right , target) ;
}
else
{
return search(root.left , target) ;
}
}
public static Node successor(Node root)
{
if(root == null)
{
return null;
}
if(root.left == null)
{
return root ;
}
return successor(root.left) ;

}
public static Node delete(Node root , int val)
{
if(root == null)
{
return null ;
}
if (val > root.val)
{
root.right = delete(root.right , val) ;
}
else if(val < root.val)
{
root.left = delete(root.left , val) ;
}
else
{
// found the element
//1) leaf node
// 2) node with 1 child
// 3 ) node with 2 child
if(root.left == null)
{
return root.right ;
}
if(root.right == null)
{
return root.left ;
}

Node s = successor(root.right) ;
root.val = s.val ;
root.right = delete(root.right , s.val);
}
return root ;
}





public static void inorder(Node root )
{
if(root == null)
{
return ;
}
inorder(root.left) ;
System.out.print(root.val + " ");
inorder(root.right) ;
}
public static void main(String[] args) {
Node root = new Node(50);
root = insert(root ,30);
root = insert(root , 70);
root = insert(root ,20) ;
root = insert(root , 40) ;
root = insert(root , 60);
root = insert(root , 80) ;
System.out.println(successor(root).val);
// System.out.println(search(root , 6)) ;
inorder(root);
System.out.println() ;
delete(root , 50) ;
delete(root , 70);
inorder(root);



}
}