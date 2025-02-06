class MaxDepth_tree{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }   
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null)
            {
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

}