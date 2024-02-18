class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LL() {
        this.size = 0;
    }

    public void addFirstNode(int val) {
        Node node = new Node(val);
        node.next = head;   // no need to explicitly write this, it will automatically points to null
        head = tail = node;
        size++;
    }

    public void addNodeAtLast(int val) {
        if(tail == null) {
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

    public void addNodeAtFirst(int val) {
        if(head == null) {
            addFirstNode(val);
            return;
        }

        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAfter(int val, int elm) {
        Node temp = head;

        while(temp.value != elm) {
            temp = temp.next;
        }

        Node ttemp = temp.next;

        Node node = new Node(val);
        temp.next = node;
        node.next = ttemp;
        size++;
    }

    public void addBefore(int val, int elm) {
        Node temp = head;
        Node ttemp = null;

        while(temp.value != elm) {
            ttemp = temp;
            temp = temp.next;
        }

        Node node = new Node(val);
        ttemp.next = node;
        node.next = temp;
        size++;
    }

    public void addNodeAtParticularIndex(int val, int index) {
        Node temp = head;

        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        Node ttemp = temp.next;

        Node node = new Node(val);
        temp.next = node;
        node.next = ttemp;
        size++;
    }

    public void deleteLastNode() {
        if(size < 1) {
            System.out.println("Linked list is already empty!");
            return;
        } else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }

        // System.out.println("Element deleted: " + tail.value);
        //////////////////////////////////
        Node temp = head;
        Node ttemp = null;
        
        while(temp.next != null) {  // try it with temp.next.next
            ttemp = temp;
            temp = temp.next;
        }
        
        ttemp.next = null;
        tail = ttemp;
        ////////////////////////////////// 
        size--;
    }

    public void deleteFirstNode() {
        if(size < 1) {
            System.out.println("Linked list is already empty!");
            return;
        } else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }

        System.out.println("Element deleted: " + head.value);

        Node temp = head.next;
        head = temp;
        size--;
    }
    
    public void deleteAfter(int elm) {
        Node temp = head;
        Node ttemp = null;
        Node p = null;

        while(temp.value != elm) {
            temp = temp.next;
        }
        
        ttemp = temp.next;
        System.out.println("Element deleted: " + ttemp.value);
        p = ttemp.next;
        temp.next = p;
        size--;
    }

    public void deleteBefore(int elm) {
        Node temp = head;
        Node ttemp = null;
        Node p = null;

        while(temp.next.value != elm) {
            ttemp = temp;
            temp = temp.next;
        }

        System.out.println("Element deleted: " + temp.value);
        p = temp.next;
        ttemp.next = p;
        size--;
    }
    
    public void deleteNodeAtParticularIndex(int index) {
        Node temp = head;
        Node ttemp = null;
        Node p = null;

        for(int i=0; i<index; i++) {
            ttemp = temp;
            temp = temp.next;
        }

        p = temp.next;
        ttemp.next = p;
        size--;
    }

    public void delete(Node node) {
        Node temp = head;
        Node ttemp = null;
        Node p = null;

        while(temp.value != node.value) {
            ttemp = temp;
            temp = temp.next;
        }

        p = temp.next;
        ttemp.next = p;
        size--;
    }

    public void swapFirstAndSecond() {
        Node temp = head;
        Node ttemp = temp.next;

        temp.next = ttemp.next;
        ttemp.next = temp;
        head = ttemp;
    }

    public void swapFirstAndLast() {
        Node temp = head;
        Node ttemp = temp.next;
        Node p = temp;
        Node q = null;

        while(p.next != null) {
            q = p;
            p = p.next;
        }

        q.next = temp;
        temp.next = null;
        p.next = ttemp;
        head = p;
        tail = temp;
    }

    public void swapLastAndSecondLast() {
        Node temp = head;
        Node ttemp = null;
        Node p = null;

        while(temp.next.next != null) {
            ttemp = temp;
            temp = temp.next;
        }

        p = temp.next;
        ttemp.next = p;
        p.next = temp;
        temp.next = null;
        tail = temp;
    }

    public void swapMN(int m, int n) {
        Node temp = head;
        Node ttemp = head;
        Node p = null;
        Node q = null;
        Node r = null;
        Node s = null;

        for(int i=0; i<m; i++) {
            p = temp;
            temp = temp.next;
        }
        q = temp.next;

        for(int i=0; i<n; i++) {
            r = ttemp;
            ttemp = ttemp.next;
        }
        s = ttemp.next;

        // System.out.println(p.value);
        // System.out.println(temp.value);
        // System.out.println(q.value);
        // System.out.println(r.value);
        // System.out.println(ttemp.value);
        // System.out.println(s.value);

        r.next = temp;
        temp.next = s;
        p.next = ttemp;
        ttemp.next = q;
    }

    public void reverse() {
        Node temp = head;
        Node p = temp.next;
        Node ttemp = null;
        Node q = null;

        while(ttemp.next != null) {
            //  incomplete!
            //  incomplete!
            //  incomplete!
            //  incomplete!
            //  incomplete!
            ttemp = ttemp.next;
        }
    }

    public void reverseNew() {
        Node curr = head;
        Node forw = null;
        Node prev = null;

        while(curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        head = prev;
    }

    public Node removeNthFromEnd(Node head, int n) {
        // Basic approach
        /*
        if(head == null || head.next == null) {
            return null;
        }
         
        if(head.next.next == null && (n == 2 || n == 3)) {
            return head.next;
        }

        int size = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            size++;
        }

        int ind = size - n;
        temp = head;

        for(int i=1; i<ind; i++) {
            temp = temp.next;
        }
        
        if(temp.next != null)
            temp.next = temp.next.next;
        else 
            temp.next = null;

        return head;
        */

        Node slow = head;
        Node fast = head;

        for(int i=0; i<n; i++) {
            fast = fast.next;
        }

        if(fast == null) {
            return head.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
    
    public void display() {
        Node temp = head;

        // System.out.print("start  ->  ");
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirstNode(15);
        
        list.addNodeAtLast(16);
        list.addNodeAtLast(18);
        
        list.addNodeAtFirst(63);
        list.addNodeAtFirst(45);

        list.addNodeAtParticularIndex(91, 5);

        list.addAfter(23, 16);
        list.addBefore(89, 91);

        list.display();
        
        // list.deleteFirstNode();
        // // list.deleteLastNode();

        // list.deleteAfter(16);
        // list.deleteBefore(89);

        // list.deleteNodeAtParticularIndex(2);

        // list.swapFirstAndSecond();
        // list.swapFirstAndLast();
        // list.swapLastAndSecondLast();
        // list.swapMN(1, 5);
        // list.reverseNew();

        list.delete(list.new Node(15));

        System.out.println();
        list.display();

        // System.out.println(list.size);
    }
}