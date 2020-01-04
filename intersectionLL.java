public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //need to know difference in length
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        int countB = 0;
        while(tempA != null || tempB != null){
            if(tempA != null){
                countA++;
                tempA = tempA.next;
            }
            if(tempB != null){
                countB++;
                tempB = tempB.next;
            }
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int diff = countA - countB;
        if(diff > 0){
            while(diff > 0){
                temp1 = temp1.next;
                diff--;
            }
        }else if(diff < 0){
            while(diff < 0){
                temp2 = temp2.next;
                diff++;
            }
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
