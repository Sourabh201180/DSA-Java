/*
    implementation
    delFirst
    delLast
    swapFirstAndLast
    swapFirstAndSecond
    delThirdLast
    swapFirstAndFourth
    swapFirstAndN
*/

class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node {
        private Node pre;
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirstNode(int value) {
        Node node = new Node(value);
        node.next = null;       // no need of this
        node.pre = null;       // no need of this
        head = tail = node;
        size++;
    }

    public void addNodeAtLast(int value) {
        if(tail == null) {
            addFirstNode(value);
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(value);
        temp.next = node;
        node.pre = temp;
        node.next = null;
        tail = node;
        size++;
    }

    public void addNodeAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head.pre = node;
        node.pre = null;
        head = node;
        size++;
    }

    public void addAfter(int element, int value) {
        Node temp = head;
        Node ttemp = null;
        Node node = new Node(value);
        while(temp.value != element) {
            temp = temp.next;
        }
        ttemp = temp.next;
        temp.next = node;
        node.pre = temp;
        node.next = ttemp;
        ttemp.pre = node;
        size++;
    }

    public void addBefore(int element, int value) {
        Node temp = head;
        Node ttemp = null;
        Node node = new Node(value);
        while(temp.value != element) {
            ttemp = temp;
            temp = temp.next;
        }
        ttemp.next = node;
        node.pre = ttemp;
        node.next = temp;
        temp.pre = node;
        size++;
    }

    public void addNodeAtParticularIndex(int index, int value) {
        Node temp = head;
        Node ttemp = null;
        Node node = new Node(value);
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        ttemp = temp.next;
        temp.next = node;
        node.pre = temp;
        node.next = ttemp;
        ttemp.pre = node;
        size++;
    }

    public void deleteLastNode() {
        Node temp = head;
        Node ttemp = null;
        if(size < 1) {
            System.out.println("Linked list is already empty!");
            return;
        } else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        while(temp.next != null) {
            ttemp = temp;
            temp = temp.next;
        }

        System.out.println("Element deleted: " + temp.value);
        ttemp.next = null;
        temp = null;
        tail = ttemp;
        size--;
    }

    public void swapLastAndSecondLast() {
        Node temp = tail;
        Node ttemp = temp.pre;
        Node p = ttemp.pre;
        p.next = temp;
        temp.pre = p;
        temp.next = ttemp;
        ttemp.pre = temp;
        ttemp.next = null;
        tail = ttemp;
    }

    public Node reverse() {
        // Node temp = tail;

        // while(temp != null) {
        //     temp.next = temp.pre;
        //     temp.pre = 
        //     temp = temp.pre;
        // }

        // some code stuff

        return head;
    }

    public void displayReverse() {
        Node temp = tail;

        while(temp != null) {
            System.out.print(temp.value);
            temp = temp.pre;
        }
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL dList = new DLL();

        dList.addFirstNode(45);
        dList.addNodeAtLast(63);
        dList.addNodeAtLast(18);
        dList.addNodeAtLast(7);
        dList.addNodeAtLast(17);
        dList.addNodeAtLast(99);
        dList.addNodeAtFirst(16);
        dList.addAfter(18, 81);
        dList.addBefore(7, 19);
        dList.addNodeAtParticularIndex(1, 15);
        
        dList.display();
        // dList.deleteLastNode();
        // dList.swapLastAndSecondLast();
        dList.displayReverse();
        dList.display();

        System.out.println(dList.head.value);
        System.out.println(dList.tail.value);
    }
}