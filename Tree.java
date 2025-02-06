class Tree{
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    Node root;  
    Tree()
    {
        root = null;
    }
    void insert(int val)
    {
        root = insertRec(root, val);
    }   
    Node insertRec(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        if(val < root.val)
        {
            root.left = insertRec(root.left, val);
        }
        else if(val > root.val)
        {
            root.right = insertRec(root.right, val);
        }
        return root;
    }
    void preorder()
    {
        preorderRec(root);
    }
    void preorderRec(Node root)
    {
        if(root != null)
        {
            System.out.print(root.val + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

}
