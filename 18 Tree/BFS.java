/* 
  BFS -> Breath First Search
        can be used in case of finding minimum distance between two vertices
*/

import java.util.LinkedList;
import java.util.Queue;

class A {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

    public static void BreathFirstSearch(LinkedList root) {
        if(root == null) {
            return;
        }

        Queue<LinkedList> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int n = q.size();
            while(n>0) {
                LinkedList p = q.peek();
                q.remove();
                System.out.println(p.get(0));
                // for(;;) {
                //     q.offer(root);
                // }
                n--;
            }
        }
    }
}