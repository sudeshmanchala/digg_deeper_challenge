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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode tmp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newhead;
        while(second != null){
            if(first.val!= second.val){
                return false;
               // break;
            }
            first=first.next;
            second=second.next;
        }

      return true;  
    }
    //    ListNode tmp3=tmp.next;
    ListNode reverse(ListNode tmp){
        ListNode prev=null;
       ListNode curr=tmp;
       ListNode front=null;
       while(curr != null){
        front=curr.next;
        curr.next=prev;
        prev=curr;
        curr=front;
       }
       return prev;
    }
       
      
    }
