class Solution {
    public boolean isPalindrome(ListNode head) {
    String s = "";
    while (head!=null)
    {
        s+=head.val;
        head=head.next;
    }
    int x = s.length();
   
    for (int i =0 ;i<x;i++)
    if (s.charAt(i)!=s.charAt(x-1-i))return false ;
    return true ;
    }
}
