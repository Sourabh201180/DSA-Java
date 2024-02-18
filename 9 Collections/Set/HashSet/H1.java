import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashSet;

class A {
    public static void main(String[] args) {
        // neigther ordered and nor sorted, doesn't store duplicate records
        HashSet<String> set = new HashSet<>();
        set.add("rohan");
        set.add("gohan");
        set.add("eohon");
        set.add("rohan");
        set.add("mohan");
        System.out.println(set);

        // ordered, store duplicate records as well
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(50);
        System.out.println(al);

        // ordered, store duplicate records, thread safe countour part of arraylist
        Vector<Integer> vec = new Vector<>();
        vec.add(23);
        vec.add(3);
        vec.add(2);
        vec.add(6);
        System.out.println(vec);
        
        // stack based on the principal of first in last out
        Stack<Integer> st = new Stack<>();
        st.add(23);
        st.push(43);
        st.add(3);
        st.add(2);
        st.add(6);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(13);
        ll.add(33);
        ll.add(24);
        ll.add(92);
        System.out.println(ll);

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(12);
        q1.add(90);
        q1.add(23);
        q1.add(54);
        System.out.println(q1);

        Queue<Integer> q2 = new PriorityQueue<>();
        q2.offer(12);
        q2.offer(23);
        q2.offer(90);
        q2.offer(54);
        System.out.println(q2.poll());
        System.out.println(q2.peek());
        System.out.println(q2.peek());
        System.out.println(q2);
    }
}