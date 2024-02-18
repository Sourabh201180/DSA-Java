/* 
    Tree is a non-linear data structure which represents the records in heirarical order,
    where a node can have any number of child nodes
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    class Node {
        Node left;
        int value;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        // Node root = new Node(10);
        // Node lnode = new Node(20);
        // Node rnode = new Node(30);
        
    }
}

class TreeGeneral {
    // Represents a node of an n-ary tree
    static class Node {
        int value;
        ArrayList<Node> child = new ArrayList<>();
    };
 
    // Utility function to create a new tree node
    static Node newNode(int value) {
        Node temp = new Node();
        temp.value = value;

        return temp;
    }
 
    // Prints the n-ary tree level wise
    static void LevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
    
        // Standard level order traversal code  // BFS
        // using queue
        Queue<Node > q = new LinkedList<>(); // Create a queue
        q.add(root); // Enqueue root 

        while (!q.isEmpty()) {
            int n = q.size();
    
            // If this node has children
            while (n > 0) {
                // Dequeue an item from queue
                // and print it
                Node p = q.peek();
                q.remove();

                System.out.print(p.value + " ");
    
                // Enqueue all children of 
                // the dequeued item
                for (int i = 0; i < p.child.size(); i++) {
                    q.add(p.child.get(i));
                }

                n--;
            }
            
            // Print new line between two levels
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        
        /*
                       10
                   /  /  \  \
                  2  34  56  100
                 / \     |   / | \
               77  88    1  7  8  9
        */
        
        Node root = newNode(10);
        (root.child).add(newNode(2));
        (root.child).add(newNode(34));
        (root.child).add(newNode(56));
        (root.child).add(newNode(100));
        (root.child.get(0).child).add(newNode(77));
        (root.child.get(0).child).add(newNode(88));
        (root.child.get(2).child).add(newNode(1));
        (root.child.get(3).child).add(newNode(7));
        (root.child.get(3).child).add(newNode(8));
        (root.child.get(3).child).add(newNode(9));
    
        System.out.println("Level order traversal: ");
        LevelOrderTraversal(root);
    }
}