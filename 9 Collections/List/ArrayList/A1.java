import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(29);
        list.add(45);
        list.add(43);
        list.add(23);

        System.out.println(list);
        
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // remove method of Iterator interface
        Integer n = Integer.valueOf(45);
        System.out.println(list.remove(n));

        
        System.out.println(list);
        
        // using add method of List interface
        list.add(1, 65);
        System.out.println(list.set(1, 99));
        // remove method of List interface
        System.out.println(list.remove(2));
        System.out.println(list.get(1));

        for(Integer i : list) {
            System.out.print(i + " ");
        }

        Vector<Integer> v = new Stack<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
    }
}