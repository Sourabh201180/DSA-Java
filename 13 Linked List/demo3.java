class LinkedList {
    Node head;
    int size;
    
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // addLast
    public void addNode(int value) {
        Node node = new Node(value);

        if(head == null) {
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    // addFirst
    public void addFirst(int value) {
        Node node = new Node(value);

        if(head == null) {
            head = node;
            return;
        }

        Node temp = head;
        head = node;
        node.next = temp;
    }

    public void deleteFirstNode() {
        head = head.next;
    }

    public void deleteLastNode() {
        Node temp = head;
        Node ttemp = temp;

        while(temp.next != null) {
            ttemp = temp;
            temp = temp.next;
        }

        ttemp.next = null;
    }

    public void addAfter(int value, int element) {
        Node node = new Node(value);
        
        Node temp = head;
        Node ttemp = temp;

        while(temp.value != element) {
            ttemp = temp;
            temp = temp.next;
        }

        ttemp = temp;
        temp = temp.next;
    
        ttemp.next = node;
        node.next = temp;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getSize(Node head) {
        int size = 0;
        Node temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    public Node swapNode(Node head, int k) {
        if(head == null) {
            return head;
        }

        int size = getSize(head);
        int m = k;
        int n = size - m + 1;

        Node temp = head;
        Node p = null;
        Node q = null;
        Node ttemp = head;
        Node r = null;
        Node s = null;
        System.out.println(m + " ~~~ " + n);

        // if(m < n)
        if((m+1) == n) {  // adj
            System.out.println("first");
            for(int i=1; i<m; i++) {
                p = temp;
                temp = temp.next;
            }
            ttemp = temp.next;
            q = ttemp.next;

            p.next = ttemp;
            ttemp.next = temp;
            temp.next = q;
        } else {        // normal
            System.out.println("second");
            for(int i=1; i<m; i++) {
                p = temp;
                temp = temp.next;
            }
            q = temp.next;
            for(int j=1; j<n; j++) {
                r = ttemp;
                ttemp = ttemp.next;
            }
            s = ttemp.next;

            p.next = ttemp;
            ttemp.next = q;
            r.next = temp;
            temp.next = s;
        }

        // else if(m > n)
        

        return head;
    }

    public Node swapNodes(Node head, int k) {
        if(head == null) {
            return head;
        }

        int m = k;
        int size = 0;
        Node first = head;

        while(first != null) {
            first = first.next;
            size++;
        }

        int n = size-m+1;

        // System.out.println(m + " ~ " + n);
        Node temp = head;
        Node ttemp = temp;
        Node p = null;
        Node q = null;
        Node r = null;
        Node s = null;

        if(n > m) {
            if(n-m == 1) {  // adjacent
                System.out.println("~~~~~~~");
                for(int i=1; i<m; i++) {
                    p = temp;
                    temp = temp.next;
                }
                ttemp = temp.next;
                r = ttemp.next;
                
                p.next = ttemp;
                ttemp.next = temp;
                temp.next = r;
            } else {    // non adjacent
                System.out.println("++++++++");
                for(int i=1; i<m; i++) {
                    p = temp;
                    temp = temp.next;
                }
                q = temp.next;

                for(int i=1; i<n; i++) {
                    r = ttemp;
                    ttemp = ttemp.next;
                }
                s = ttemp.next;

                // System.out.println(p.value + "~" + temp.value + "~" + q.value + "~" + r.value + "~" + ttemp.value + "~" + s.value);

                p.next = ttemp;
                ttemp.next = q;
                r.next = temp;
                temp.next = s;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        
        // l1.addNode(1);
        // l1.addNode(2);
        // l1.addNode(3); 
        // l1.addNode(4);
        // l1.addNode(5);
        // l1.addNode(60);

        // l1.addFirst(70);

        // l1.deleteLastNode();
        // l1.deleteLastNode();

        // l1.deleteFirstNode();

        // l1.addAfter(25, 20);
        l1.addNode(7);
        l1.addNode(9);
        l1.addNode(6);
        l1.addNode(6);
        l1.addNode(7);
        l1.addNode(8);
        l1.addNode(3);
        l1.addNode(0);
        l1.addNode(9);
        l1.addNode(5);
        
        l1.display();

        // l1.swapNodes(l1.head, 2);
        l1.swapNode(l1.head, 5);

        l1.display();

        System.out.println();
        System.out.println();

        LinkedList l2 = new LinkedList();
        l2.addNode(1);
        l2.addNode(2);
        l2.addNode(3);
        l2.addNode(4);
        l2.addNode(5);

        l2.display();
        l2.swapNode(l2.head, 2);
        l2.display();
    }
}