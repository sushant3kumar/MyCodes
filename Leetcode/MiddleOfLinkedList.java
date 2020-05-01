/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ftemp= head;
        ListNode stemp= head;
        ListNode temp= head;
        int count=0;
        while(temp!=null)
        {
            
            count++;
            temp=temp.next;
        }
        while( ftemp!=null && ftemp.next!=null && ftemp.next.next!=null)
        {
            stemp=stemp.next;
            ftemp=ftemp.next.next;
        }
        if(count%2==0)
        {
            return stemp.next;
        }
        return stemp;
        
        
    }
}
