/* 
    Implementation of Binary Tree O(n)
        1. Linked representation
        2. Sequential(using an array)
*/

import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

class BT {
    static Scanner sc = new Scanner(System.in);

    public static Node createTree() {
        Node root = null;

        System.out.println("Enter value: ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left value of " + data);
        root.left = createTree();
        
        System.out.println("Enter right value of " + data);
        root.right = createTree();

        return root;
    }

    public static void InOrder(Node root) {
        if(root != null) {
            InOrder(root.left);
            System.out.println(root.value);
            InOrder(root.right);
        }
    }

    public static void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
    }

    public static void main(String[] args) {
        Node root = createTree();

        preOrder(root);
        System.out.println();

        InOrder(root);
        System.out.println();
        
        postOrder(root);
    }
}

/*
class BT {
    private Node root;
    static int count = 0;

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        
        public Node(int value) {
            this.value = value;
        }
    }

    public void addNode(int value) {
        Node node = new Node(value);
        node.left = node.right = null;

        Node temp = root;
        Node ttemp = null;

        if(count == 0) {
            root = node;
            count++;
            return;
        } 

        while(temp != null) {
            // System.out.println(temp.value);
            ttemp = temp;
            if(temp.left == null) {
                temp = node;
                temp = temp.left;
            } else {
                temp = node;
                temp = temp.right;
            }
        }
    }

    public static Node createTree(int value) {
        Node root = null;
        
        root = new Node(value);


        return root;
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
        BT bt = new BT();

        bt.addNode(10);
        bt.addNode(20);
        bt.addNode(30);
        bt.addNode(40);
        bt.addNode(50);
        bt.addNode(60);

        bt.InOrder(bt.root);
        System.out.println();

        bt.preOrder(bt.root);
        System.out.println();

        bt.postOrder(bt.root);
    }
}
*/