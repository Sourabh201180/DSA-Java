/* 
    Correct Binary Tree That Has Two Nodes Swapped
*/

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}

public class BT2NodesSwap {
    Node first;
    Node second;
    Node prev;

    public void helper(Node root) {
        inOrder(root);

        // swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        if(prev != null && prev.val > node.val) {
            if(first == null) {
               first = prev; 
            }
            second = node;
        }
        prev = node;
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BT2NodesSwap bts = new BT2NodesSwap();


    }
}