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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode mid = getmid(head);
        ListNode left=sortList(head);
        ListNode right =sortList(mid);

        return merge(left,right);
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode();
        ListNode ans =dummy;

        while(l1 !=null && l2 !=null){
            if(l1.val<=l2.val){
                ans.next=l1;
                l1=l1.next;
                ans=ans.next;
            }
            else{
                ans.next=l2;
                l2=l2.next;
                ans=ans.next;
            }
        }
        ans.next=(l2==null)?l1:l2;
        return dummy.next;
    }
    ListNode getmid(ListNode head){
        ListNode midprev=null;
        while(head!=null && head.next!=null){
            midprev=(midprev == null)?head:midprev.next;
            head=head.next.next;
        }
        
        ListNode mid =midprev.next;
        midprev.next=null;
        return mid;
    }
}