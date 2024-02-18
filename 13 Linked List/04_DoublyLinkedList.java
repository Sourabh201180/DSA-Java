/* 
    king of Linked List...

    implementation
    delFirst
    addFirst
    swapFirstAndSecond
    swapFirstAndLast
    delLast
    delSecondLast
    swapLastAndSecondLast
    swapThirdAndFourth
    swapMAndN

    we are adding and deleting elements from the last position
*/

class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node {
        Node prev;
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            size++;
        }
    }

    public void addFirstNode(int value) {
        head = tail = new Node(value);
    }

    public void addNode(int value) {
        if(head == null) {
            addFirstNode(value);
            return;
        }

        Node temp = head;
        
        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(value);
        temp.next = node;
        node.prev = temp;
        tail = node;
    }

    public void deleteNode() {
        Node temp = tail.prev;
        temp.next = null;
        tail = temp;
        size--;
    }

    public void display() {
        Node temp = head;

        while(temp.next != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);
        dll.addNode(60);
        dll.display();
        dll.deleteNode();
        dll.display();
    }
}