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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode first=head;
        ListNode second =head.next;
        ListNode temp = second;
        ListNode temp1=head;
        while(first!=null && temp!=null && first.next!=null && temp.next!=null)
        {
            first.next=first.next.next;
            temp.next=temp.next.next;
            temp1=first;
            first=first.next;
            temp=temp.next;
        } 
        if(first!=null)
        {
            first.next=second;
        }
        else
        {
            temp1.next=second;
        }
        
        return head;
    }
}
