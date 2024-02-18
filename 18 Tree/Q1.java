/*
    1. start from root node
    2. check equality of the given node is equal to the current node. True -> return current node common ancesstor
    3. recursively search 
            a. left sub tree    
            b. right sub tree 
    4. if both nodes found in different subtrees -> return the curr. node
    5. if both the nodes are in same subtree (repeat 3)
    6. if neither subtrees found the node return -1 -> no ancesstors found
*/

/*
    1. define node class.(value, reference to parent)
    2. read no. of test cases
    3. read the no. of nodes(N) and parent values
    4. create arrays of nodes
    5. iterate over parent values 
                    -> if -1 value -> root node -> parent to null
    6. read x1 and x2 input
    7. function for nearestCommonAncesstors(x1, x2)
    8. display result otherwise print -1
    9. time complexity O(N)
*/

import java.util.*;

class Node {
    int value;
    Node parent;

    public Node(int value) {
        this.value = value;
        this.parent = null;
    }
}

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++) {
            int N = sc.nextInt();

            int[] parentValues = new int[N];
            for(int i=0; i<N; i++) {
                parentValues[i] = sc.nextInt();
            }

            Node[] nodes = new Node[N];
            
            for(int i=0; i<N; i++) {
                nodes[i] = new Node(i);
            }

            // tree formation
            for(int i=0; i<N; i++) {
                if(parentValues[i] == -1) {
                    nodes[i].parent = null;
                } else {
                    nodes[i].parent = nodes[parentValues[i]];
                }
            }

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            Node ancesstor = findNearestCommonAncesstor(nodes[x1], nodes[x2]);

            if(ancesstor == null) {
                System.out.println("-1");
            } else {
                System.out.println(ancesstor.value);
            }
        }
    }

    public static Node findNearestCommonAncesstor(Node n1, Node n2) {
        Set<Node> ancesstors = new HashSet<>();

        while(n1 != null) {
            ancesstors.add(n1);
            n1 = n1.parent;
        }

        while(n2 != null) {
            if(ancesstors.contains(n2)) {
                return n2;
            }
            n2 = n2.parent;
        }
        
        return null;
    }
}