class SearchINBst{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        System.out.println(searchInBst(root, 6));
    }

    public static boolean searchInBst(TreeNode root, int val){
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        if(root.val > val){
            return searchInBst(root.left, val);
        }
        return searchInBst(root.right, val);
    }
}