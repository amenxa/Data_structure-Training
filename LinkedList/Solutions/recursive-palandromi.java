class Solution {
    ListNode h ;
    boolean ispal = true ;
    void re (ListNode p)
    {
        if (p==null)return ;
        re(p.next);
       if (p.val!=h.val)ispal=false ;
       h=h.next ;

    }
    public boolean isPalindrome(ListNode head) {
       h = head ;
       re(head);
       return ispal;
    }
}
