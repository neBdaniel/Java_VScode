package Data_Sructures;

// Define the TreeNode class to represent nodes in the binary tree
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Define the BinaryTree class to manage the tree structure
class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node into the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        // If the tree is empty, create a new node as the root
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Otherwise, recur down the tree to find the appropriate position
        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to perform an in-order traversal of the binary tree
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
}

public class Trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Perform an in-order traversal to display the tree
        System.out.print("In-order traversal: ");
        tree.inorderTraversal(tree.root);
    }
}

