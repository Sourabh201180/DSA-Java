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

    public ListNode mergeKLists(ListNode[] lists) {
        head = new ListNode(0);
        ListNode temp = head;

        for(int i=0; i<lists.length; i++) {
            ListNode ttemp = lists[i];
            while(ttemp != null) {
                System.out.println(ttemp.val);
                temp.next = new ListNode(ttemp.val);
                temp = temp.next;
                ttemp = ttemp.next;
            }
        }

        return mergeSort(head.next);
    }

    public ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
    
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = mergeSort(head);
        ListNode l2 = mergeSort(slow);

        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }

    public void display(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        s.display(l1);
        
        // 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        s.display(l2);
        
        // 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        s.display(l3);

        ListNode resultantList = s.mergeKLists(new ListNode[]{l1, l2, l3});
        s.display(resultantList);
    }
}