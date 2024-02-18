public class DemoBST {
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

    public DemoBST() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if(node == null) {
            return -1;
        }

        return node.height;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(node.left, value);
        }
        if(value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left Child of " + node.value + " : ");
        display(node.right, "Right Child of " + node.value + " : ");
    }

    public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = start + (end - start)/2;

        this.insert(nums[mid]);
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid+1, end);
    }

    public static void main(String[] args) {
        DemoBST tree = new DemoBST();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tree.populate(nums);
        tree.display();
    }
}