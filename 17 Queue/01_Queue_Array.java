class Queue {
    static final int size = 10;
    static int front = 0;
    static int rear = 0;
    static int[] queue = new int[size];
    static int max = 0;
    
    // insert from rear
    // there is a problem, when we perform several push and poll then after that we were not able to push elements
    // for this solution we have the concept of using circular queue
    public static void push(int value) {
        if(rear == size) {
            System.out.println("Queue is already full, can't push more element!!");
            return;
        }

        System.out.println("pushed " + value);
        queue[rear] = value;
        rear++;
    }

    // delete from front
    public static int poll() {
        if(front == rear) {
            System.out.println("Queue is already Empty, can't pop any element!!");
            return -1;
        }

        System.out.println("deleted " + queue[front]);
        int num = queue[front];
        front++;

        return num;
    }

    // print from front
    public static void peek() {
        if(front == rear) {
            System.out.println("Queue is Empty!!");
            return;
        }

        System.out.println(queue[front]);
    }

    public static void display() {
        if(front == rear) {
            System.out.println("Queue is Empty!!");
            return;
        }

        for(int i=front; i<rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        push(70);
        push(80);
        push(90);
        push(100);

        peek();

        poll();

        peek();
        peek();
        peek();
        peek();

        push(34);
        push(94);
        push(21);
        push(39);

        display();
    }
}