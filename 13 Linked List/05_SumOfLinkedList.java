class SLL {
    private Node head;
    private Node tail;  
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirstNode(int val) {
        Node node = new Node(val);
        node.next = head;
        head = tail = node;
        size++;
    }

    public void addNodeAtLast(int val) {
        if(tail ==  null) {
            addFirstNode(val);
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(val);
        temp.next = node;
        tail = node;
        size++;
    }
    
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    // Storing the Sum of two lists elements in the  
    public static SLL sumOfTwoList(SLL list1, SLL list2) {
        SLL resList = new SLL();

        Node p1 = list1.head;
        Node p2 = list2.head;

        while(p1 != null && p2 != null) {
            resList.addNodeAtLast(p1.value + p2.value);
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1 != null) {
            resList.addNodeAtLast(p1.value);
            p1 = p1.next;
        }
        while(p2 != null) {
            resList.addNodeAtLast(p2.value);
            p2 = p2.next;
        }

        return resList;
    }

    public static void main(String[] args) {
        // ############     List 1     ##############
        SLL list1 = new SLL();
        
        list1.addFirstNode(15);
        list1.addNodeAtLast(16);
        list1.addNodeAtLast(17);
        list1.addNodeAtLast(18);
        list1.addNodeAtLast(19);
        list1.addNodeAtLast(20);
        list1.addNodeAtLast(70);
        list1.addNodeAtLast(80);
        list1.addNodeAtLast(90);
        list1.addNodeAtLast(100);
        
        list1.display();
        System.out.println();
        
        // ############     List 2     ############
        SLL list2 = new SLL();

        list2.addFirstNode(25);
        list2.addNodeAtLast(26);
        list2.addNodeAtLast(27);
        list2.addNodeAtLast(28);
        list2.addNodeAtLast(29);
        list2.addNodeAtLast(30);
        list2.addNodeAtLast(50);

        list2.display();

        System.out.println("\n\nResultant list:");
        
        // ############      Resultant List    #########
        SLL resultantList = sumOfTwoList(list1, list2);
        
        resultantList.display();
    }
}