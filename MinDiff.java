class Solution {
    public void inorder(TreeNode root , List<Integer> in)
    {
    if(root == null)
    {
    return ;
    }
    inorder(root.left , in) ;
    in.add(root.val) ;
    inorder(root.right , in);
    }
    public int getMinimumDifference(TreeNode root) {
    int minDiff = Integer.MAX_VALUE;
    List<Integer> arr = new ArrayList<>();
    inorder(root, arr);
    for (int i = 1; i < arr.size(); i++) {
    
    minDiff = Math.min(minDiff, arr.get(i) - arr.get(i - 1));
    }
    return minDiff;
    }
}