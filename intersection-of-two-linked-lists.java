/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int c=0;
        int d=0;
        while(a!=null && b!=null){
           
            if(a==b){
                return a;
            }
            a=a.next;
            b=b.next;
            if(a==null && c==0){
                a=headB;
                c=1;
            }
        
            if(b==null && d==0){
                b=headA;
                d=1;
            }
        }
        return null;
    }
}
