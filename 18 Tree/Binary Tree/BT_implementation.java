import java.util.Scanner;

class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;
        
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do u want to insert left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do u want to insert right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    public void display(Node node, String indent) {
        if(node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // try to imagine it out like it is rotated by 90 towards left
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level) {
        if(node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);
        
        if(level != 0) {
            for(int i=0; i<level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        bt.display();
        bt.prettyDisplay();
    }
}