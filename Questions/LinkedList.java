public class LinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            size++;
        }
    }

    Node head;
    int size = 0;

    public void addFirstElement(int value) {
        head = new Node(value);
    }

    public void addNodeAtLast(int value) {
        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(value);
        temp.next = node;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node forw = null;

        while(curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        head = prev;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirstElement(10);
        l1.addNodeAtLast(20);
        l1.addNodeAtLast(30);
        l1.addNodeAtLast(40);
        l1.addNodeAtLast(50);
        l1.display();
        System.out.println(l1.size + "  ~~~~~~~  ");
        l1.reverse();
        l1.display();
    }
}