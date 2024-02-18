/* 
    implementaion
    delLast
    delFirst
    swapFirstAndSecond
    swapFirstAndLast
    swapLastAndSecondLast

    we are adding and deleting elements from the last position
*/

class SCLL {
    private Node head;
    private int size;

    SCLL() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addFirstNode(int value) {
        head = new Node(value);
        head.next = head;
        size++;
    }

    public void addNode(int value) {
        if(head == null) {
            addFirstNode(value);
            return;
        }

        Node temp = head;
        
        while(temp.next != head) {
            temp = temp.next;
        }

        Node node = new Node(value);
        temp.next = node;
        node.next = head;
        size++;
    }

    public void deleteNode() {
        Node temp = head;

        while(temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
        size--;
    }

    public void display() {
        Node temp = head;

        while(temp.next != head) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public static void main(String[] args) {
        SCLL scll = new SCLL();

        scll.addNode(10);
        scll.addNode(20);
        scll.addNode(30);
        scll.addNode(40);
        scll.addNode(50);
        scll.display();
        scll.deleteNode();
        scll.display();
    }
}