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

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode res = new ListNode(0, head);
        ListNode prev = res;

        while(head != null) {
            if(head.next != null && head.val == head.next.val) {
                while(head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }

        return res.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(3);
        l1.next.next.next.next.next = new ListNode(4);
        l1.next.next.next.next.next.next = new ListNode(4);
        l1.next.next.next.next.next.next.next = new ListNode(5);
        s.display(l1);

        s.display(s.deleteDuplicates(l1));
    }
}