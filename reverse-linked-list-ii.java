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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        
        ListNode ptr=head;
        ListNode le=null;
        ListNode ri=null;
        ListNode p=null;
        for(int i=1;i<=right;i++){
            if(i+1==left){
                p=ptr;
            }
            if(i==left){
                le=ptr;
            }
            if(i==right){
                ri=ptr;
            }
            ptr=ptr.next;
           
        }
        int z=1;
        if(p==null && head==le){
            head=ri;
            z=0;
        }
        ListNode dummylefty=new ListNode();
        ListNode dummyrighty=new ListNode();
        ListNode prev=dummylefty;
        ListNode curr=le;
        ListNode nex=curr.next;
        dummyrighty.next=ri.next;
        ri.next=dummyrighty;
        while(prev!=ri){
            curr.next=prev;
            prev=curr;
            curr=nex;
            nex=nex.next;
        }
        le.next=dummyrighty.next;
        if(z!=0){
        p.next=ri;
        }

    return head;
    }
}
