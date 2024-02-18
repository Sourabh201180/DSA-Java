public class AVL {
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

    public AVL() {

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

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
            // left part is heavier
            if(height(node.left.left) - height(node.left.right) > 0) {
                // left-left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                // left-right case
                node.left = leftRotate(node.right);
                return rightRotate(node);
            }
        } 
        if(height(node.left) - height(node.right) < -1) {
            // right part is heavier
            if(height(node.right.left) - height(node.right.right) < 0) {
                // right-right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.left.right) > 0) {
                // left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        } 

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(t.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;

    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(t.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;

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
        AVL tree = new AVL();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tree.populate(nums);
        tree.display();
    }
}