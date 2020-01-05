class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       //make it a ring
        if(head == null){
            return head;
        }
        int size = 1;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next;
            size++;
        }
        temp.next = head; //made it a ring
        k = k % size;
        
        //now break it off at the right place
        int currElement = 1;
        ListNode tail = head;
        while(currElement < size - k){
            tail = tail.next;
            currElement++;
        }
        ListNode newH = tail.next;
        tail.next = null;
        return newH;
    }
}
