class Stack {
    static final int size = 10;
    int[] stack = new int[size];
    int top = -1;
    int max = 0;
    
    public void push(int value) {
        if(top == size-1) {
            System.out.println("Stack is already full, can't push more element!!");
            return;
        }

        stack[top+1] = value;
        top++;
        max++;
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack is already Empty, can't pop any element!!");
            return -1;
        }

        int num = stack[top];
        top--;
        max--;

        return num;
    }

    public void peek() {
        if(top == -1) {
            System.out.println("Stack is Empty!!");
            return;
        }

        System.out.println(stack[top]);
    }

    public static StringBuffer reverse(String str) {
        StringBuffer st = new StringBuffer();
        Stack s = new Stack();
        
        for(char c : str.toCharArray()) {
            s.push(c);
        }

        while(s.top != -1) {
            st.append((char)s.pop());
        }
        
        return st;
    }

    // public void display() {
    //     if(top == -1) {
    //         System.out.println("Stack is Empty!!");
    //         return;
    //     }

    //     for(int i=top; i>=0; i--) {
    //         System.out.println(stack[i]);
    //     }
    // }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);

        st.peek();
        st.pop();
        st.peek();
        st.peek();
        st.peek();
        st.peek();

        st.push(34);
        st.push(94);
        st.push(21);
        st.push(39);

        // st.display();

        System.out.println(reverse("sourabh"));
    }
}