/* 
    we have three ways to implement this:-
        1. making pop() and top() costlier
            push -> o(1)
            pop  -> o(n)
            top  -> o(n)
            empty-> o(1)

        2. making push() only costlier (better approach)
            push -> o(n)
            pop  -> o(1)
            top  -> o(1)
            empty-> o(1)

        3. single queue approach
*/

import java.util.Queue;
import java.util.LinkedList;

class MyStack1 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack1() {

    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        if(q1.isEmpty()) {
            return -1;
        }

        int n = q1.size();
        while(n>1) {
            int e = q1.peek();
            q2.offer(e);
            q1.poll();
            n--;
        }
        int x = q1.poll();
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        return x;
    }
    
    public int top() {
        if(q1.isEmpty()) {
            return -1;
        }

        int n = q1.size();
        while(n>1) {
            int e = q1.peek();
            q2.offer(e);
            q1.poll();
            n--;
        }
        int x = q1.poll();
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        q1.offer(x);
        
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack1 stack = new MyStack1();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}

class MyStack2 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack2() {

    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    
    public int pop() {
        if(q1.isEmpty()) {
            return -1;
        }

        return q1.poll();
    }
    
    public int top() {
        if(q1.isEmpty()) {
            return -1;
        }

        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}

class MyStack3 {
    Queue<Integer> q = new LinkedList<>();

    public MyStack3() {

    }
    
    public void push(int x) {
        q.offer(x);
        int n = q.size();
        for(int i=0; i<n-1; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        if(q.isEmpty()) {
            return -1;
        }

        return q.poll();
    }
    
    public int top() {
        if(q.isEmpty()) {
            return -1;
        }

        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack3 stack = new MyStack3();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}