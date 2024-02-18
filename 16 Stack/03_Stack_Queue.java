/*
 *  Partially implemented...
*/

import java.util.Queue;
import java.util.LinkedList;

class Stack {
    public static Queue<Integer> q1;
    public static Queue<Integer> q2;

    public Stack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int value) {
        q.offer(value);
    }

    public int pop() {
        int size = q.size();

        int val = q.peek();
        q.poll();

        return val;
    }

    public int peek() {
        int size = q.size();
        Integer val = q.getLast();

        return val;
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.peek());
        System.out.println(s.peek());
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        System.out.println(s.peek());
        System.out.println(s.peek());
    }
}