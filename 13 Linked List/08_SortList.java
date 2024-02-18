class Solution {
    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;

    public void addFirstNode(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void addNodeAtLast(int val) {
        if(head == null) {
            addFirstNode(val);
            return;
        }

        ListNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        ListNode node = new ListNode(val);
        temp.next = node;
    }

    public void display() {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Bubble Sort
    public ListNode sortListBubbleSort(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode temp = head;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        for(int i=0; i<size; i++) {
            temp = head;
            for(int j=0; j<size-i-1; j++) {
                if(temp.val > temp.next.val) {
                    int swapElem = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = swapElem; 
                }
                temp = temp.next;
            }
        }

        return head;
    }

    // Merge Sort
    public ListNode sortListMergeSort(ListNode head) {
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

        ListNode l1 = sortListMergeSort(head);
        ListNode l2 = sortListMergeSort(slow);

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

    public ListNode SortListInsertionSort(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        ListNode tail = head;
        
        while(temp != null) {
            if(temp.val >= tail.val) {
                tail = temp;
                temp = temp.next;
                continue;
            }

            tail.next = temp.next;

            ListNode prev = null;
            ListNode t1 = head;

            while(t1 != tail.next) {
                if(t1.val >= temp.val) {
                    break;
                }
                prev = t1;
                t1 = t1.next;
            }

            // insert at first
            if(prev == null) {
                temp.next = head;
                head = temp;
            } else {
                temp.next = prev.next;
                prev.next = temp;
            }

            temp = tail.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution list = new Solution();
        
        list.addFirstNode(4);
        list.addNodeAtLast(2);
        list.addNodeAtLast(1);
        list.addNodeAtLast(3);

        list.display();

        list.sortListBubbleSort(list.head);
        list.sortListMergeSort(list.head);
        list.display();
    }
}