
//Merge sort on a linked list!! 
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //1. divide. do fast and slow pointers to split in half
        ListNode endFirst = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            endFirst = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //head is head of left list. endFirst is the end. 
        //slow is head of right list and fast is end of right list
        endFirst.next = null;
        //2. sort
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        //3. merge
        return merge(left,right);
    }
    public ListNode merge (ListNode l1, ListNode l2){
        ListNode sortedTemp = new ListNode(0);
        ListNode curr = sortedTemp;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next = l1;
        }else if(l2 != null){
            curr.next = l2;
        }
        return sortedTemp.next;
    }
}
