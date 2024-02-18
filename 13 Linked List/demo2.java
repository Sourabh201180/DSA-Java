class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class LL {
    static Node first;

    public void addNode(int data) {
        Node node = new Node(data);
        
        if(first == null) {
            first = node;
            return; 
        }
        
        Node temp = first;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public void display() {
        Node temp = first;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addNode(10);
        list.addNode(20);
        list.addNode(60);
        list.addNode(50);
        list.addNode(60);

        list.display();
    }
}