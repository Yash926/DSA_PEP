// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isSame(TreeNode p, TreeNode q)
//     {
//         if(p==null && q==null)
//         {
//             return true;
//         }
//         else if(p==null || q==null)
//         {
//             return false;
//         }
//         if(p.val==q.val &&  isSame(p.left,q.left) && isSame(p.right,q.right))
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
//     public boolean helper(TreeNode p, TreeNode q)
//     {
//         if(p==null)
//         {
//             return false;
//         }
//         boolean c1=isSame(p,q);
//         boolean c2=helper(p.left,q);
//         boolean c3=helper(p.right,q);
//         return c1||c2||c3;
//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         return helper(root, subRoot);
        
//     }
// }