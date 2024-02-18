class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    ListNode head;

    public void addFirstNode(int val) {
        head = new ListNode(val);
    }

    public void addNode(int val) {
        if(head == null) {
            addFirstNode(val);
            return;
        }

        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new ListNode(val);
    }

    public void display(ListNode head) {
        if(head == null) {
            return;
        }

        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        return head;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.addNode(1);
        s1.addNode(2);
        s1.addNode(3);
        s1.addNode(4);
        s1.addNode(5);
        s1.display(s1.head);
        ListNode newNode = s1.oddEvenList(s1.head);
        s1.display(newNode);
       
        Solution s2 = new Solution();
        s2.addNode(2);
        s2.addNode(1);
        s2.addNode(3);
        s2.addNode(5);
        s2.addNode(6);
        s2.addNode(4);
        s2.addNode(7);
        s2.display(s2.head);
    }
}