class ListNode {
    int val;
    ListNode next;

    ListNode() {}

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

    public void display(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode oddEven(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;

        for(boolean isOdd=true; head != null; head = head.next, isOdd = !isOdd) {
            if(isOdd) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
        }

        odd.next = evenHead.next;
        even.next = null;

        return oddHead.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = new ListNode(7);
        s.display(l1);

        s.display(s.oddEven(l1));
    }
}