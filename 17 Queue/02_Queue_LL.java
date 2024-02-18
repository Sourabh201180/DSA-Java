class Queue {
    private class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }

    private Node front;
    private Node rear;

    public void push(int value) {
        Node node = new Node(value);
        if(front == null) {
            front = rear = node;
            node.next = null;
            return;
        }

        rear.next = node;
        // node.next = null;
        rear = node;
    }

    public void poll() {
        if(front == null) {
            System.out.println("Queue is already Empty, can't poll!");
            return;
        }
        
        System.out.println("popped " + front.value);
        front = front.next;
    }

    public void peek() {
        if(front == null) {
            System.out.println("Queue is Empty, nothing to peek!");
            return;
        }

        System.out.println(front.value);
    }

    public void display() {
        if(front == null) {
            System.out.println("Queue is Empty, nothing to peek!");
            return;
        }

        // Node temp = front;
        // while(temp != null) {
        //     System.out.println(temp.value);
        //     temp = temp.next;
        // }

        System.out.println(front.value);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.peek();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);
        
        queue.peek();
        queue.peek();
        queue.peek();

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        queue.peek();

        queue.display();
    }
}