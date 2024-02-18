import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BT {
    Scanner sc = new Scanner(System.in);

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node root;

    public BT() {

    }

    public Node createTree(Node root) {
        System.out.println("Add data: ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("add Node at left of " + data);
        root.left = createTree(root.left);
        System.out.println("add Node at right of " + data);
        root.right = createTree(root.right);

        return root;
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.poll();
            if(temp )









            
        }
    }

    public void levelOrderTraversalTree(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        queue.offer(null);

        while(!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.poll();

            if(temp == null) {
                // purana level completely traverse ho chuka hai
                System.out.println();
                if(!queue.isEmpty()) {
                    // queue still have some child nodes
                    queue.offer(null);
                }
            } else {
                System.out.print(temp.value + " ");
                if(temp.left != null) {
                    queue.offer(temp.left);
                } 
                if(temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
    }

    public void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        BT bt = new BT();

        Node root = null;
        root = bt.createTree(root);

        System.out.println("\nPre Order Traversal:");
        bt.preOrderTraversal(root);
        System.out.println("\nIn Order Traversal:");
        bt.inOrderTraversal(root);
        System.out.println("\nPost Order Traversal:");
        bt.postOrderTraversal(root);

        System.out.println("\nLevel Order Traversal");
        bt.levelOrderTraversal(root);
    }
}