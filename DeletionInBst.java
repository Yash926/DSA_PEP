// class DeletionInBst {
//     public TreeNode deleteNode(TreeNode root, int key) {
//         if (root == null) {
//             return null;
//         }
//         if (key < root.val) {
//             root.left = deleteNode(root.left, key);
//         } else if (key > root.val) {
//             root.right = deleteNode(root.right, key);
//         } else {
//             if (root.left == null) {
//                 return root.right;
//             } else if (root.right == null) {
//                 return root.left;
//             }
//             root.val = findMin(root.right);
//             root.right = deleteNode(root.right, root.val);
//         }
//         return root;
//     }

//     private int findMin(TreeNode root) {
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root.val;
//     }
// }




/**
* Definition for a binary tree node.
* public class TreeNode {
* int val;
* TreeNode left;
* TreeNode right;
* TreeNode() {}
* TreeNode(int val) { this.val = val; }
* TreeNode(int val, TreeNode left, TreeNode right) {
* this.val = val;
* this.left = left;
* this.right = right;
* }
* }
*/
// class Solution {
//     public TreeNode min (TreeNode root)
//     {
//     if(root == null)
//     {
//     return null;
//     }
    
//     if(root.left == null)
//     {
//     return root ;
//     }
//     return min(root.left);
//     }
//     public TreeNode deleteNode(TreeNode root, int key) {
    
//     if(root == null)
//     {
//     return null ;
//     }
//     if(key > root.val)
//     {
//     root.right = deleteNode(root.right , key) ;
//     }
//     else if(key < root.val)
//     {
//     root.left = deleteNode(root.left , key) ;
//     }
//     else
//     {
//     // you got the node
//     if(root.left == null)
//     {
//     return root.right ;
//     }
//     if(root.right == null)
//     {
//     return root.left ;
//     }
    
//     TreeNode s = min(root.right) ;
//     root.val = s.val ;
//     root.right = deleteNode(root.right , s.val) ;
//     }
//     return root ;
//     }
//     }