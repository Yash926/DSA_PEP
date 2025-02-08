class Node {
    int key;
    Node left, right;
    
    Node(int val) {
    this.key = val;
    this.left = null;
    this.right = null;
    }
    }
    
    public class  BST {
    
    static Node insert(Node root, int val) {
    if (root == null) {
    return new Node(val);
    }
    
    if (val > root.key) {
    root.right = insert(root.right, val);
    } else if (val < root.key) {
    root.left = insert(root.left, val);
    }
    
    return root;
    
    }
    
    static void inorder(Node root) {
    if (root == null) {
    return;
    }
    
    inorder(root.left);
    System.out.print(root.key + " ");
    inorder(root.right);
    }
    
    public static void main(String[] args) {
    Node root = new Node(3);
    root = insert(root, 5);
    root = insert(root, 1);
    
    inorder(root);
    }
    }
    
        