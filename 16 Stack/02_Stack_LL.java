class Stack {
    // private static top = -1;
    private Node top;
    private int size;

    public Stack() {
        this.size = 0;
    }
    
    private class Node {
        Node prev;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public void push(int value) {
        Node temp = top;
        Node node = new Node(value);
        if(temp == null) {
            node.prev = null;
            top = node;
            size++;
            return;
        }

        node.prev = top;
        top = node;
        size++;
    }

    public void pop() {
        if(size == 0) {
            System.out.println("Stack is already Empty, can't pop!");
            return;
        }
        
        System.out.println("popped " + top.value);
        top = top.prev;
        size--;
    }

    public void peek() {
        if(size == 0) {
            System.out.println("Stack is Empty, nothing to peek!");
            return;
        }

        System.out.println(top.value);
    }

    // public void display() {
    //     if(size == 0) {
    //         System.out.println("Stack is Empty, nothing to peek!");
    //         return;
    //     }

    //     Node temp = top;
    //     while(temp != null) {
    //         System.out.println(temp.value);
    //         temp = temp.prev;
    //     }
    // }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.peek();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        stack.peek();
        stack.peek();
        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.peek();

        // stack.display();
    }
}