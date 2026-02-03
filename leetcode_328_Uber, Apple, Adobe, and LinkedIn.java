class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode od=head;//od=odd
        ListNode ev=head.next;//ev=even
        ListNode evh=ev;//evh=even head
        while(od.next!=null&&ev.next!=null)
        {
            od.next=od.next.next;
            od=od.next;
            ev.next=ev.next.next;
            ev=ev.next;
        }
        od.next=evh;
        return head;
    }
}