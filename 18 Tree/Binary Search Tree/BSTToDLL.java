public class BSTToDLL {
    LLNode head;
    LLNode tail;

    public LLNode convert(TreeNode root) {
        if(root == null) {
            return null;
        }

        helper(root);

        return head;
    }

    private void helper(TreeNode node) {
        if(node == null) {
            return;
        }

        helper(node.left);

        LLNode newNode = new LLNode(node.val);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        helper(node.right);
    }

    public void display(LLNode head) {
        if(head == null) {
            return;
        }

        LLNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        BSTToDLL bst = new BSTToDLL();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);

        LLNode list = bst.convert(root);
        bst.display(list);
    }   
}

class LLNode {
    int val;
    LLNode prev;
    LLNode next;

    public LLNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}