// BST

class BST {
    private Node root;
    
    private class Node {
        private int value;
        private Node left;
        private Node right;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    public void createRoot(int value) {
        Node node = new Node(value);
        node.left = node.right = null;
        root = node;
    }

    public void addNode(int value) {
        Node temp = root;
        Node ttemp = null;
        while(temp != null) {
            ttemp = temp;
            if(temp.value > value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        Node node = new Node(value);
        node.left = node.right = null;
        if(ttemp.value > value) {
            ttemp.left = node;
        } else {
            ttemp.right = node;
        }
    }

    public void InOrder(Node root) {
        if(root != null) {
            InOrder(root.left);
            System.out.println(root.value);
            InOrder(root.right);
        }
    }

    public void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
    }
    
    public static void main(String[] args) {
        BST tree = new BST();
        
        tree.createRoot(50);
        tree.addNode(30);
        tree.addNode(35);
        tree.addNode(70);
        tree.addNode(60);
        tree.addNode(32);

        tree.InOrder(tree.root);
        System.out.println();

        tree.preOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
    }
}