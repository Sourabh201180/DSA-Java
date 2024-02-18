/* 
    implementing BST in case of sqewed tree
    by dividing the array into two halfs

    Time complexity:
        (n * (log n))
*/

class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }  

    private Node root;

    public BST() {

    }

    // Height
    public int height(Node node) {
        if(node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Insert
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(value, node.left);
        }
        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Balancing
    public boolean balanced() {
        return balanced(root);
    }

    public boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // Display
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    // Populate
    public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // Populate Sorted
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = start + (end - start)/2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    // PreOrder
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }
    
    public static void main(String[] args) {
        BST tree = new BST();

        // int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        // tree.populate(nums);
        // tree.display();

        // sqwed one
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tree.populateSorted(nums);
        tree.display();

        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }
}