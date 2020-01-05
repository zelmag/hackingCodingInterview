class swapNth{
  // Node indices starts from 1.
  static LinkedListNode
  swap_nth_node(LinkedListNode head, int n) {
    LinkedListNode prev = head;
    for(int i = 1; i < n-1; i++){
      prev = prev.next;
    }
    LinkedListNode swap = prev.next;
    System.out.println(swap.data);
    LinkedListNode rest = prev.next.next;
    swap.next = head.next; //prev.next is the new head!
    head.next = rest;
    prev.next = head;
    return swap;
  }
}  
