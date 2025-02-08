/**
* Definition for a binary tree node.
* public class TreeNode {
* int val;
* TreeNode left;
* TreeNode right;
* TreeNode(int x) { val = x; }
* }
*/
class Solution {

public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {
if (root == null) return false;

path.add(root);

if (root == target) return true;

if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
return true;
}

path.remove(path.size() - 1);
return false;
}
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
List<TreeNode> a1 = new ArrayList<>() ;
List<TreeNode> a2 = new ArrayList<>() ;
findPath(root , p , a1);
findPath(root , q , a2);

TreeNode lca = null;
for(int i =0 ;i<Math.min(a1.size() , a2.size()) ;i++)
{
if(a1.get(i) == a2.get(i))
{
lca = a1.get(i) ;
}
}

return lca ;
}
}