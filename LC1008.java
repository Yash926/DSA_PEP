class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder, new int[]{0}, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private TreeNode constructBST(int[] preorder, int[] index, int min, int max) {
        if (index[0] >= preorder.length) {
            return null;
        }
        
        int val = preorder[index[0]];
        if (val < min || val > max) {
            return null;
        }
        
        TreeNode root = new TreeNode(val);
        index[0]++;
        root.left = constructBST(preorder, index, min, val);
        root.right = constructBST(preorder, index, val, max);
        
        return root;
    }
}
//chat gpt