class Solution {
    int count = 0 ;
    public int dfs(TreeNode root, int max) {
    
    if(root == null)
    {
    return 0 ;
    }
    if(root.val >= max)
    {
    max = root.val ;
    count++ ;
    }
    
    dfs(root.left , max) ;
    dfs(root.right , max) ;
    
    return count ;
    }
    
    public int goodNodes(TreeNode root) {
    if (root == null) {
    return 0;
    }
    
    dfs(root, root.val);
    return count ;
    }
    }