class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> seen = new HashSet<>();
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            if(seen.contains(temp.val)){
                prev.next = temp.next;
                temp = temp.next;
            }else{
                seen.add(temp.val);
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
