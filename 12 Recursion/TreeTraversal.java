public class TreeTraversal {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode root;

    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();

        t1.root = new TreeNode(10);
        t1.root.left = new TreeNode(20);
        t1.root.right = new TreeNode(30);
        t1.root.right.left = new TreeNode(40);

        t1.preOrder(t1.root);
        System.out.println();

        t1.inOrder(t1.root);
        System.out.println();
        
        t1.postOrder(t1.root);
    }
}