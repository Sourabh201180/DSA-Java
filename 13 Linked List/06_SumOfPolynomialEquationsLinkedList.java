class SLL {
    private Node head;
    private Node tail;  
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private int pow;
        private Node next;

        public Node() {

        }

        public Node(int value, int pow) {
            this.value = value;
            this.pow = pow;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirstNode(int val, int pow) {
        Node node = new Node(val, pow);
        node.next = head;
        head = tail = node;
        size++;
    }

    public void addNodeAtLast(int val, int pow) {
        if(tail ==  null) {
            addFirstNode(val, pow);
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(val, pow);
        temp.next = node;
        tail = node;
        size++;
    }
    
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + "x" + temp.pow +" -> ");
            temp = temp.next;
        }
    }

    // Storing the Sum of two lists elements in the  
    public static SLL sumOfTwoPolynomialList(SLL list1, SLL list2) {
        SLL resList = new SLL();

        Node p1 = list1.head;
        Node p2 = list2.head;

        while(p1 != null && p2 != null) {
            if(p1.pow > p2.pow) {
                resList.addNodeAtLast(p1.value, p1.pow);
                p1 = p1.next;
            } else if(p1.pow < p2.pow) {
                resList.addNodeAtLast(p2.value, p2.pow);
                p2 = p2.next;
            } else {
                resList.addNodeAtLast(p1.value + p2.value, p1.pow);
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        while(p1 != null) {
            resList.addNodeAtLast(p1.value, p1.pow);
            p1 = p1.next;
        }
        while(p2 != null) {
            resList.addNodeAtLast(p2.value, p2.pow);
            p2 = p2.next;
        }

        return resList;
    }

    public static void main(String[] args) {
        // ############     List 1     ##############
        SLL list1 = new SLL();
        // 5x2 + 4x + 2
        list1.addFirstNode(5, 2);
        list1.addNodeAtLast(4, 1);
        list1.addNodeAtLast(2, 0);
        list1.display();
        System.out.println();
        
        // ############     List 2     ############
        SLL list2 = new SLL();
        // 5x3 + x2 + 3x + 5
        list2.addFirstNode(5, 3);
        list2.addNodeAtLast(1, 2);
        list2.addNodeAtLast(3, 1);
        list2.addNodeAtLast(5, 0);
        list2.display();

        // ############      Resultant List    #########
        System.out.println("\n\nResultant list:");
        // 5x3 + 6x2 + 7x + 7
        SLL resultantList = sumOfTwoPolynomialList(list1, list2);
        resultantList.display();
    }
}