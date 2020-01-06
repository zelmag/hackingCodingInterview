class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummyRes = new ListNode(0);
       int carry = 0;
       ListNode temp = dummyRes;
       while(carry > 0 || l1 != null || l2 != null){
           int l1Val = l1 != null ? l1.val : 0;
           int l2Val = l2 != null ? l2.val : 0;
           int sum = l1Val + l2Val + carry;
           carry = sum / 10;
           temp.next = new ListNode(sum % 10);
           l1 = l1 != null ? l1.next : null;
           l2 = l2 != null ? l2.next : null;
           temp = temp.next;
       }
    return dummyRes.next;
    }
}
