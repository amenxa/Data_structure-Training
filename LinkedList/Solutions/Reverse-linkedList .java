class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null ||head.next == null)return head ;
      ListNode p1 = head , p2 = head.next ,p3= p2.next  ;
      head.next = null ;
      while (true)
      {
        p2.next = p1 ;
        if (p3==null)break ;
        p1=p2;
        p2=p3;
        p3=p3.next;

      }
      return p2;

    }
}
