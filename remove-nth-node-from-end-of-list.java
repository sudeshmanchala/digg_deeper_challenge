/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
       
       if(head.next==null && n>=1){
        return null;
       }
       ListNode ptr=head;
       int c=0;
       while(ptr!=null){
        c=c+1;
        ptr=ptr.next;
       }
       ListNode ptr2=head;
       c=c-n;
       if(c==0){
        head=head.next;
       return head;
       }
       else{
       while(c>1){
        ptr2=ptr2.next;
        c--;
       }
    }
       ptr2.next=ptr2.next.next;
        return head;
    }
}
