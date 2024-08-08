class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class TreeTraversal {
    public void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(8);
        // root.right = new TreeNode(3);
        // root.right.left = new TreeNode(6);
        // root.right.right = new TreeNode(7);
        // root.right.right.right = new TreeNode(10);
        // root.right.right.left = new TreeNode(9);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(9);
        root.left.left.right.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(8);
        TreeTraversal tree = new TreeTraversal();
        System.out.print("Pre-order traversal is: ");
        tree.preOrder(root);
        System.out.print("\nIn-order traversal is: ");
        tree.inOrder(root);
        System.out.print("\nPost-order traversal is: ");
        tree.postOrder(root);
    }
}
